package com.chongjae.javaTraining.liveStudy.week4;

import java.util.Arrays;

public class Stack {
    private int[] array;

    public void push(int data) {
        if (array == null) {
            array = new int[]{data};
        } else {
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[newArray.length - 1] = data;
            array = newArray;
        }
    }

    public int pop() throws IndexOutOfBoundsException {
        if (array != null && array.length > 0) {
            int popItem = array[array.length - 1];
            int[] newArray = Arrays.copyOf(array, array.length - 1);
            array = newArray;
            return popItem;
        }
        throw new IndexOutOfBoundsException("stack에 데이터가 없습니다.");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(3);
//        System.out.println(stack);
//        stack.push(4);
//        System.out.println(stack);
//        stack.push(5);
//        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
