package com.chongjae.javaTraining.liveStudy.week5;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node rootNode;
    Queue<Node> queue = new LinkedList<>();

    public Node getRootNode() {
        return rootNode;
    }

    public void insertNode(Node insertNode) {
        if (rootNode == null) {
            rootNode = insertNode;
        }

        queue.offer(rootNode);
        while (true) {
            Node node = queue.remove();
            if (node.getLeft() == null) {
                node.setLeft(insertNode);
                break;
            } else {
                queue.offer(node.getLeft());
            }

            if (node.getRight() == null) {
                node.setRight(insertNode);
                break;
            } else {
                queue.offer(node.getRight());
            }
        }
        queue.clear();
    }

    void bfs(Node node) {
    }

    void dfs(Node node) {
        // 왼쪽 루트 오른쪽
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insertNode(new Node(1));
        binaryTree.insertNode(new Node(2));
        binaryTree.insertNode(new Node(3));
        binaryTree.insertNode(new Node(4));
        binaryTree.insertNode(new Node(5));
        binaryTree.insertNode(new Node(6));
    }
}
