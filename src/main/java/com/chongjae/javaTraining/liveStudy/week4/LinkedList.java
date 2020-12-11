package com.chongjae.javaTraining.liveStudy.week4;

public class LinkedList {
    ListNode head;
    int size = 0;

    private ListNode addHead(ListNode head) {
        if (this.head != null) {
            head.setNextListNode(this.head);
        }
        this.head = head;
        size++;
        return this.head;
    }

    private ListNode removeHead(ListNode head) {
        this.head = head.getNextListNode();
        size--;
        return head;
    }

    private void checkHead(ListNode head) {
        if (this.head != head) {
            throw new IllegalArgumentException("LinkedList의 head와 다릅니다.");
        }
    }

    ListNode getHead() {
        return head;
    }

    int getSize() {
        return size;
    }

    ListNode add(ListNode head, ListNode nodeToAdd, int position) {
        checkHead(head);
        if (position == 0) {
            return addHead(nodeToAdd);
        }

        ListNode node = head;
        for (int i = 0; i < position - 1; i++) {
            node = node.getNextListNode();
        }
        ListNode previousNextNode = node.getNextListNode();
        node.setNextListNode(nodeToAdd);
        nodeToAdd.setNextListNode(previousNextNode);
        size++;
        return nodeToAdd;
    }

    ListNode remove(ListNode head, int positionToRemove) {
        checkHead(head);
        if (positionToRemove == 0) {
            return removeHead(head);
        }

        ListNode node = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            node = node.getNextListNode();
        }

        ListNode removedNode = node.getNextListNode();
        ListNode previousNextNode = removedNode.getNextListNode();
        node.setNextListNode(previousNextNode);
        size--;
        return removedNode;
    }

    boolean contains(ListNode head, ListNode nodeToCheck) {
        checkHead(head);
        ListNode node = head;
        while (node != null) {
            if (node == nodeToCheck) {
                return true;
            }
            node = node.getNextListNode();
        }
        return false;
    }
}