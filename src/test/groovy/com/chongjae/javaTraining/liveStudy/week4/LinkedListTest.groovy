package com.chongjae.javaTraining.liveStudy.week4

import spock.lang.Specification

class LinkedListTest extends Specification {
    def "add 테스트"() {
        given:
        ListNode head = new ListNode(1)
        LinkedList linkedList = new LinkedList();
        when:
        def node1 = linkedList.add(head, new ListNode(2), 1)
        then:
        head.getNextListNode() == node1
        and:
        when:
        def node2 = linkedList.add(head, new ListNode(3), 1)
        then:
        head.getNextListNode() == node2
        and:
        when:
        def node3 = linkedList.add(head, new ListNode(4), 2)
        then:
        head.getNextListNode().getNextListNode() == node3
    }

    def "remove 테스트"() {
        given:
        ListNode head = new ListNode(1)
        LinkedList linkedList = new LinkedList();
        when:
        def node1 = linkedList.add(head, new ListNode(2), 1)
        def node2 = linkedList.add(head, new ListNode(3), 2)
        linkedList.remove(head, 1)
        then:
        head.getNextListNode() == node2
    }

    def "contains 테스트"() {
        given:
        ListNode head = new ListNode(1)
        LinkedList linkedList = new LinkedList();
        when:
        def node1 = linkedList.add(head, new ListNode(2), 1)
        def node2 = linkedList.add(head, new ListNode(3), 2)
        def result1 = linkedList.contains(head, node2)
        def result2 = linkedList.contains(head, new ListNode(4))
        then:
        result1
        !result2
    }
}
