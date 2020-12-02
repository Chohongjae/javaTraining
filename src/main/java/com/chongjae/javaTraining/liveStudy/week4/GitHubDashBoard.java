package com.chongjae.javaTraining.liveStudy.week4;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.List;

public class GitHubDashBoard {
    private final GitHub gitHub;

    public GitHubDashBoard(String OAuthToken) throws IOException {
        this.gitHub = new GitHubBuilder().withOAuthToken(OAuthToken).build();
    }

    public List<GHIssue> getIssues(String ownerAndRepository, GHIssueState issueState) throws IOException {
        return gitHub.getRepository(ownerAndRepository).getIssues(issueState);
    }

    public List<GHIssueComment> getComments(GHIssue ghIssue) throws IOException {
        return ghIssue.getComments();
    }

    public String getUserLoginIdByComment(GHIssueComment ghIssueComment) throws IOException {
        return ghIssueComment.getUser().getLogin();
    }

    public void calculateParticipationRate() {

    }
}
