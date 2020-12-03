package com.chongjae.javaTraining.liveStudy.week4;

import org.kohsuke.github.GHIssue;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.kohsuke.github.GHIssueState.ALL;

public class HomeWork1 {
    private static final String OWNER_AND_REPOSITORY = "whiteship/live-study";
    private static final int TOTAL_STUDY_NUMBER = 18;

    public static void main(String[] args) throws IOException {
        Properties properties = getProperties("src/main/resources/secret.properties");

        Map<String, Integer> participants = new HashMap<>();
        GitHubDashBoard gitHubDashBoard = new GitHubDashBoard(properties.getProperty("user.oauth.token"));
        for (GHIssue ghIssue : gitHubDashBoard.getIssues(gitHubDashBoard.getRepository(OWNER_AND_REPOSITORY), ALL)) {
            Set<String> users = gitHubDashBoard.getUsersWhoWroteCommentsInIssue(ghIssue);

            for (String user : users) {
                if (participants.containsKey(user)) {
                    participants.put(user, participants.get(user) + 1);
                } else {
                    participants.put(user, 1);
                }
            }
        }

        gitHubDashBoard.printParticipationRate(participants, TOTAL_STUDY_NUMBER);
    }

    public static Properties getProperties(String filePath) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        return properties;
    }
}

