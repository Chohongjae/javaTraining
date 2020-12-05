package com.chongjae.javaTraining.liveStudy.week4;

import java.util.Arrays;

public class Queue {
    int[] queue;

    void push(int data) {
        if (queue == null) {
            queue = new int[]{data};
        } else {
            int[] newQueue = Arrays.copyOf(queue, queue.length + 1);
            newQueue[newQueue.length - 1] = data;
            queue = newQueue;
        }
    }

    int pop() throws IndexOutOfBoundsException {
        if (queue != null && queue.length > 0) {
            int popItem = queue[0];
            int[] newQueue = new int[queue.length - 1];
            System.arraycopy(queue, 1, newQueue, 0, queue.length - 1);
            queue = newQueue;
            return popItem;
        }
        throw new IndexOutOfBoundsException("queue에 데이터가 없습니다.");
    }
}
