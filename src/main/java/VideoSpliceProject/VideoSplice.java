package VideoSpliceProject;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoSplice {
    String badSourceType = "abc";



    /*public void outputSplicedVideoToFile() throws LineUnavailableException, IOException, UnsupportedAudioFileException {

        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("some_yolk.wav"));
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        FloatControl gainControl =
                (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        // Could be video1 volume check
        float video1Volume = gainControl.getValue();
        gainControl.setValue(-10.0f); // Reduce volume by 10 decibels.
        clip.start();

    }


        public static void combineAudio(String inputFile1, String inputFile2, String outputFile) throws IOException, EncoderException {
            // Create File objects for input files
            File file1 = new File(inputFile1);
            File file2 = new File(inputFile2);

            // Check if input files exist
            if (!file1.exists() || !file2.exists()) {
                throw new IllegalArgumentException("Input files do not exist.");
            }

            // Get the duration of both input files
            Encoder encoder = new Encoder();
            MultimediaInfo info1 = encoder.getInfo(file1);
            MultimediaInfo info2 = encoder.getInfo(file2);
            long duration1 = info1.getDuration();
            long duration2 = info2.getDuration();

            // Calculate the duration of the output file (choose the longer duration)
            long outputDuration = Math.max(duration1, duration2);

            // Create a VideoAttributes object for the output file
            VideoAttributes audioAttributes = new VideoAttributesImpl();
            audioAttributes.setCodec("copy");

            // Create the encoder and output file
            Encoder audioEncoder = new Encoder();
            File outputFileObj = new File(outputFile);

            // Encode the audio based on higher volume every 5 seconds
            long currentTime = 0;
            while (currentTime < outputDuration) {
                long segmentDuration = Math.min(5000, outputDuration - currentTime);

                // Set the start and end points for the segment
                long start1 = Math.min(currentTime, duration1);
                long end1 = Math.min(start1 + segmentDuration, duration1);
                long start2 = Math.min(currentTime, duration2);
                long end2 = Math.min(start2 + segmentDuration, duration2);

                // Combine audio from input files based on volume
                audioEncoder.encodeAudio(file1, start1, end1, outputFileObj, currentTime, audioAttributes);
                audioEncoder.encodeAudio(file2, start2, end2, outputFileObj, currentTime, audioAttributes);

                // Move to the next segment
                currentTime += segmentDuration;
            }

            System.out.println("Audio combination complete. Output file: " + outputFile);


        }*/


    public static void combineVideos(String inputFile1, String inputFile2, String outputFile) throws IOException {
        // Extract audio from the input files
        String audio1File = "audio1.aac";
        String audio2File = "audio2.aac";
        extractAudio(inputFile1, audio1File);
        extractAudio(inputFile2, audio2File);

        // Get the volume levels of the extracted audio files
        double volume1 = getAudioVolume(audio1File);
        double volume2 = getAudioVolume(audio2File);

        // Choose the video file with the higher volume
        String higherVolumeFile = (volume1 > volume2) ? inputFile1 : inputFile2;
        String lowerVolumeFile = (volume1 > volume2) ? inputFile2 : inputFile1;

        // Merge videos based on the audio volume using ffmpeg
        String command = "ffmpeg -i " + higherVolumeFile + " -i " + lowerVolumeFile +
                " -c:v copy -c:a copy -strict experimental " + outputFile;

        // Execute the command
        Process process = Runtime.getRuntime().exec(command);

        try {
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new IOException("Error combining videos. ffmpeg process exited with code: " + exitCode);

            }
            System.out.println("Video combination complete. Output file: " + outputFile);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clean up temporary audio files
        cleanupTemporaryFiles(audio1File, audio2File);
    }

    private static void extractAudio(String inputFile, String outputAudioFile) throws IOException {
        String command = "ffmpeg -i " + inputFile + " -vn -acodec copy " + outputAudioFile;
        Process process = Runtime.getRuntime().exec(command);

        try {
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                throw new IOException("Error extracting audio. ffmpeg process exited with code: " + exitCode);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static double getAudioVolume(String audioFile) throws IOException {
        /**
         * Tags used
         * -i: input file
         * -af: filtergraph
         * -vn: skip inclusion of video
         * -sn: skip inclusion of subtitle
         * -dn: skip inclusion of datastreams
         * -f: fmt (force input or output file format)
         */
        String command = "ffmpeg -i " + audioFile + " -af 'volumedetect' -vn -sn -dn -f null /dev/null";
        Process process = Runtime.getRuntime().exec(command);

        try {
            process.waitFor();

            String output = new String(process.getErrorStream().readAllBytes());
            String[] lines = output.split("\\r?\\n");

            for (String line : lines) {
                if (line.contains("mean_volume:")) {
                    int startIndex = line.indexOf("mean_volume:") + 13;
                    int endIndex = line.indexOf(" dB");
                    String volumeStr = line.substring(startIndex, endIndex);
                    return Double.parseDouble(volumeStr);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0.0;
    }

    private static void cleanupTemporaryFiles(String... files) {
        for (String file : files) {
            if (file != null) {
                try {
                    Runtime.getRuntime().exec("rm " + file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> whatever = new HashMap<>();
        String inputFile1 = "input1.mp4";
        String inputFile2 = "input2.mp4";
        String outputFile = "output.mp4";

        try {
            combineVideos(inputFile1, inputFile2, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
