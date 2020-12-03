package com.chongjae.javaTraining.liveStudy.week4

import org.kohsuke.github.GHIssueState
import spock.lang.Shared
import spock.lang.Specification

class GitHubDashBoardTest extends Specification {
    @Shared gitHubDashBoard = new GitHubDashBoard("토큰")

    def "GetRepository"() {
        given:
        def ownerAndRepository = "whiteship/live-study"
        when:
        def repository = gitHubDashBoard.getRepository(ownerAndRepository)
        then:
        repository.getName() == "live-study"
        repository.getOwnerName() == "whiteship"
    }

    def "GetIssues"() {
        given:
        def ownerAndRepository = "whiteship/live-study"
        def repository = gitHubDashBoard.getRepository(ownerAndRepository)
        def issueState = GHIssueState.CLOSED
        when:
        def issues = gitHubDashBoard.getIssues(repository, issueState)
        then:
        issues.size() > 0
        issues.get(issues.size() - 1).getTitle() == "1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가."
    }

    def "GetUsersWhoWroteCommentsInIssue"() {
        given:
        def ownerAndRepository = "whiteship/live-study"
        def repository = gitHubDashBoard.getRepository(ownerAndRepository)
        def issueState = GHIssueState.CLOSED
        def issues = gitHubDashBoard.getIssues(repository, issueState)
        when:
        def users = gitHubDashBoard.getUsersWhoWroteCommentsInIssue(issues.get(issues.size() - 1))
        then:
        users.contains("Chohongjae")
    }
}
