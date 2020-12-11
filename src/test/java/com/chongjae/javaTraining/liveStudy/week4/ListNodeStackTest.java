package com.chongjae.javaTraining.liveStudy.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListNodeStackTest {
    @Test
    public void pushTest() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(3);
        listNodeStack.push(4);
        assertEquals(listNodeStack.linkedList.getSize(), 2);
        assertEquals(listNodeStack.linkedList.getHead().getData(), 3);
    }

    @Test
    public void popTest() {
        ListNodeStack listNodeStack = new ListNodeStack();
        listNodeStack.push(3);
        listNodeStack.push(4);
        assertEquals(listNodeStack.pop(), 4);
        assertEquals(listNodeStack.pop(), 3);
    }
}