package com.chongjae.javaTraining.liveStudy.week4

import spock.lang.Specification

class QueueTest extends Specification {
    def "push test"() {
        given:
        Queue queue = new Queue()
        when:
        queue.push(3)
        queue.push(4)
        queue.push(5)
        then:
        queue.queue.size() == 3
        queue.queue[0] == 3
        queue.queue[2] == 5
    }

    def "pop test"() {
        given:
        Queue queue = new Queue()
        queue.push(3)
        queue.push(4)
        queue.push(5)
        when:
        queue.pop()
        queue.pop()
        then:
        queue.queue.size() == 1
        queue.queue[0] == 5
    }
}
