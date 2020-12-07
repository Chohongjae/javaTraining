package com.chongjae.javaTraining.liveStudy.week4;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void pushTest() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        assertEquals(stack.stack[0], 3);
        assertEquals(stack.stack[2], 4);
        assertArrayEquals(stack.stack, new int[]{3, 4});
    }

    @Test
    public void popTest() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        assertEquals(stack.pop(), 4);
        assertEquals(stack.pop(), 3);
        assertArrayEquals(stack.stack, new int[]{});
    }

}