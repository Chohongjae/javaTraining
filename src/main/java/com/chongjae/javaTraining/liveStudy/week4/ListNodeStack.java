package com.chongjae.javaTraining.liveStudy.week4;

public class ListNodeStack {
    LinkedList linkedList = new LinkedList();

    void push(int data) {
        if (linkedList.getSize() == 0) {
            linkedList.add(null, new ListNode(data), 0);
        } else {
            linkedList.add(linkedList.getHead(), new ListNode(data), linkedList.getSize());
        }
    }

    int pop() {
        return linkedList.remove(linkedList.getHead(), linkedList.getSize() - 1).getData();
    }
}
