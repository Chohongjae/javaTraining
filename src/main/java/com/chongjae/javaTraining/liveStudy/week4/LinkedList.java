package com.chongjae.javaTraining.liveStudy.week4;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private final List<ListNode> listNodeList = new ArrayList<>();
    private ListNode headListNode;
    private ListNode lastListNode;

    public List<ListNode> getNodeList() {
        return listNodeList;
    }

    public ListNode getLastNode() {
        return lastListNode;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position) {

    }

    public ListNode remove(ListNode listNode) {

    }

    public boolean contains(ListNode listNode) {

    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        for (ListNode listNode : linkedList.getNodeList()) {
            System.out.println(listNode.getData() + " / " + listNode.getNextNode());
        }

        linkedList.contains(new ListNode(3));
    }
}
