package com.chongjae.javaTraining.liveStudy.week4;

public class LinkedList {
    int size = 1;

    ListNode add(ListNode head, ListNode nodeToAdd, int position) throws IllegalAccessException {
        if (position <= 0 || position > size) {
            throw new IllegalAccessException("잘못된 position입니다.");
        } else {
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
    }

    ListNode remove(ListNode head, int positionToRemove) throws IllegalAccessException {
        if (positionToRemove <= 0 || positionToRemove >= size) {
            throw new IllegalAccessException("잘못된 position입니다.");
        }
        ListNode node = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            node = node.getNextListNode();
        }

        ListNode previousNextNode = node.getNextListNode().getNextListNode();
        node.setNextListNode(previousNextNode);
        size--;
        return previousNextNode;
    }

    boolean contains(ListNode head, ListNode nodeToCheck) {
        ListNode node = head;
        while (node != null) {
            if (node == nodeToCheck) {
                return true;
            }
            node = node.getNextListNode();
        }
        return false;
    }

    public static void main(String[] args) throws IllegalAccessException {
        ListNode head = new ListNode(1);
        LinkedList linkedList = new LinkedList();

        ListNode add = linkedList.add(head, new ListNode(2), 1);
        ListNode add1 = linkedList.add(head, new ListNode(3), 2);
        ListNode add2 = linkedList.add(head, new ListNode(4), 3);
        ListNode add3 = linkedList.add(head, new ListNode(5), 4);
        System.out.println(add);
        ListNode add4 = linkedList.add(head, new ListNode(6), 2);
        System.out.println(add4);

        System.out.println(linkedList.contains(head, new ListNode(3)));

        ListNode remove = linkedList.remove(head, 2);
        System.out.println(remove);
        ListNode remove1 = linkedList.remove(head, 4);
        System.out.println(remove1);

    }
}
