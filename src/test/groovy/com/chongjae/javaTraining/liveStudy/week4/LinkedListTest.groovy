package com.chongjae.javaTraining.liveStudy.week4

import spock.lang.Specification

class LinkedListTest extends Specification {
    def "add 테스트"() {
        given:
        LinkedList linkedList = new LinkedList();
        when:
        def node1 = linkedList.add(null, new ListNode(1), 0)
        then:
        linkedList.getHead() == node1
        and:
        when:
        def node2 = linkedList.add(linkedList.getHead(), new ListNode(2), 1)
        then:
        linkedList.getHead().getNextListNode() == node2
        and:
        when:
        def node3 = linkedList.add(linkedList.getHead(), new ListNode(3), 1)
        then:
        linkedList.getHead().getNextListNode() == node3
        node3.getNextListNode() == node2
        and:
        when:
        def node4 = linkedList.add(linkedList.getHead(), new ListNode(4), 0)
        then:
        linkedList.getHead() == node4
        node4.getNextListNode() == node1
    }

    def "remove 테스트"() {
        given:
        LinkedList linkedList = new LinkedList();
        when:
        linkedList.add(null, new ListNode(2), 0)
        linkedList.add(linkedList.getHead(), new ListNode(3), 1)
        linkedList.remove(linkedList.getHead(), 1)
        then:
        linkedList.getHead().getNextListNode() == null
        and:
        def node1 = linkedList.add(linkedList.getHead(), new ListNode(3), 1)
        linkedList.remove(linkedList.getHead(), 0)
        then:
        linkedList.getHead() == node1

    }

    def "contains 테스트"() {
        given:
        LinkedList linkedList = new LinkedList();
        when:
        def node1 = linkedList.add(null, new ListNode(2), 0)
        def node2 = linkedList.add(node1, new ListNode(3), 1)
        def result1 = linkedList.contains(node1, node2)
        def result2 = linkedList.contains(node1, new ListNode(4))
        then:
        result1
        !result2
    }
}
