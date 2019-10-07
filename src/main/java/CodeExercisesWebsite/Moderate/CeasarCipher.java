package CodeExercisesWebsite.Moderate;


/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class CeasarCipher {

    public String decode(String code) {
        char[] charArray = code.toCharArray();

        String returnedString = "";
        int finalCharacter;
        int lastCharValue = 'z';
        int alphabetLength = 'z' - 'a' + 1;
        for (char character : charArray) {
            int characterWithoutWrapAround = character + 5;
            if (characterWithoutWrapAround < lastCharValue) {
                finalCharacter = characterWithoutWrapAround;
            } else {
                finalCharacter = characterWithoutWrapAround - alphabetLength;
            }
            returnedString = returnedString + (char) finalCharacter;
        }
        return returnedString;
    }

    public static void main(String[] args) {

        CeasarCipher ceasarCipher = new CeasarCipher();
        ceasarCipher.decode("xvm");

        System.out.println(ceasarCipher.decode("xvm"));
    }
}
