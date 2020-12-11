package com.chongjae.javaTraining.liveStudy.week4

import spock.lang.Specification

class ListNodeQueueTest extends Specification {
    def "Push"() {
        given:
        ListNodeQueue listNodeQueue = new ListNodeQueue()
        when:
        listNodeQueue.push(3)
        listNodeQueue.push(4)
        listNodeQueue.push(5)
        then:
        listNodeQueue.linkedList.getHead().getData() == 3
        listNodeQueue.linkedList.getHead().getNextListNode().getData() == 4
    }

    def "Pop"() {
        given:
        ListNodeQueue listNodeQueue = new ListNodeQueue()
        listNodeQueue.push(3)
        listNodeQueue.push(4)
        listNodeQueue.push(5)
        when:
        def data1 = listNodeQueue.pop()
        def data2 = listNodeQueue.pop()
        then:
        data1 == 3
        data2 == 4
        listNodeQueue.linkedList.getHead().getData() == 5
    }
}
