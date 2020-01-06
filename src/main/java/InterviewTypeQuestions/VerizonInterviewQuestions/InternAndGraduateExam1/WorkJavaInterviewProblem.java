package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkJavaInterviewProblem {

    public List<String> processURLs(List<String> urls) {
        String parsedURL = "";
        List<String> domainNameWithCountList = new ArrayList<>();

        HashMap<String, Integer> domainNameWithCountMap = new HashMap<>();

        for (String url : urls) {
            // trim down URL
            try {
                parsedURL = parseHostFromUrl(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            // then check if map contains it
            if (!domainNameWithCountMap.containsKey(parsedURL)) {
                domainNameWithCountMap.put(parsedURL, 1);
            } else {
                domainNameWithCountMap.put(parsedURL, domainNameWithCountMap.get(parsedURL) + 1);
            }
        }
        for (String item : domainNameWithCountMap.keySet()) {
            domainNameWithCountList.add(item + " " + domainNameWithCountMap.get(item));
        }

        return domainNameWithCountList;
    }

    private String parseHostFromUrl(String url) throws MalformedURLException {
        URL actualUrl = new URL(url);
        return actualUrl.getHost();
    }

    public static void main(String[] args) {
        WorkJavaInterviewProblem workJavaInterviewProblem = new WorkJavaInterviewProblem();

        List<String> listToSend = new ArrayList<>();
        listToSend.add("https://www.yahoo.com/");
        listToSend.add("http://www.yahoo.com/");
        listToSend.add("https://www.yahoo.com/news/");
        listToSend.add("https://sports.yahoo.com/");
        listToSend.add("https://techcrunch.com/startups/");
        listToSend.add("https://www.huffingtonpost.com/");
        listToSend.add("https://www.huffingtonpost.co.uk/");
        listToSend.add("https://www.huffingtonpost.co.uk/entry/brexit-secretary?utm_hp_ref=uk-politics");
        listToSend.add("https://developer.github.com/apps/building-oauth-apps/");
        listToSend.add("https://developer.github.com/v3/");
        listToSend.add("https://developer.github.com:8080/v3/");

        List<String> returnedList = workJavaInterviewProblem.processURLs(listToSend);

        for (String item : returnedList) {
            System.out.println(item);
        }
    }
}
