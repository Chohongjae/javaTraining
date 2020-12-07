package com.chongjae.javaTraining.liveStudy.week4;

import java.util.Arrays;

public class Stack {
    int[] stack;

    void push(int data) {
        if (stack == null) {
            stack = new int[]{data};
        } else {
            int[] newStack = Arrays.copyOf(stack, stack.length + 1);
            newStack[newStack.length - 1] = data;
            stack = newStack;
        }
    }

    int pop() throws IndexOutOfBoundsException {
        if (stack != null && stack.length > 0) {
            int popItem = stack[stack.length - 1];
            stack = Arrays.copyOf(stack, stack.length - 1);
            return popItem;
        }
        throw new IndexOutOfBoundsException("stack에 데이터가 없습니다.");
    }
}
