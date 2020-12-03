package com.chongjae.javaTraining.liveStudy.week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class GitHubDashBoard {
    private final GitHub gitHub;

    public GitHubDashBoard(String OAuthToken) throws IOException {
        this.gitHub = new GitHubBuilder().withOAuthToken(OAuthToken).build();
    }

    public GHRepository getRepository(String ownerAndRepository) throws IOException {
        return gitHub.getRepository(ownerAndRepository);
    }

    public List<GHIssue> getIssues(GHRepository repository, GHIssueState issueState) throws IOException {
        return repository.getIssues(issueState);
    }

    public Set<String> getUsersWhoWroteCommentsInIssue(GHIssue ghIssue) throws IOException {
        return ghIssue.getComments()
                .stream()
                .map(ghIssueComment -> {
                    try {
                        return ghIssueComment.getUser().getLogin();
                    } catch (IOException e) {
                        e.printStackTrace();
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toSet());
    }

    public void calculateParticipationRate(Map<String, Integer> participants, int totalStudyNumber) {
        participants.forEach((key, value) ->
                System.out.println("참여자 : " + key + " 참석율 : " + String.format("%.2f", (double) value / (double) totalStudyNumber * 100) + "%")
        );
    }
}
