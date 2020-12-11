package com.chongjae.javaTraining.liveStudy.week4;

public class ListNode {
    private int data;
    private ListNode nextListNode;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public ListNode getNextListNode() {
        return nextListNode;
    }

    public void setNextListNode(ListNode nextListNode) {
        this.nextListNode = nextListNode;
    }
}
