/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutterwave.queue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cleopatradouglas
 */
public class ImmutableQueueTest {
    
    public ImmutableQueueTest() {
    }

    /**
     * Test of enQueue method, of class ImmutableQueue.
     */
    @Test
    public void testEnQueue() throws Exception {
         Queue<Integer> queue = new ImmutableQueue<Integer>();
        final Integer value = 6;
        queue = queue.enQueue(value);
        assertEquals(queue.head(), value);
    }

    /**
     * Test of deQueue method, of class ImmutableQueue.
     */
    @Test
    public void testDeQueue() throws Exception {
                Queue<Integer> queue = new ImmutableQueue<Integer>();
        final Integer value = 6;
        queue = queue.enQueue(value);
        queue = queue.deQueue();
        assertEquals(queue.head(), null);
    }

    /**
     * Test of head method, of class ImmutableQueue.
     */
    @Test
    public void testHead() throws Exception {
        Queue<Integer> queue = new ImmutableQueue<Integer>();
        assertEquals(queue.head(), null);
    }

    /**
     * Test of isEmpty method, of class ImmutableQueue.
     */
    @Test
    public void testIsEmpty() throws Exception {
      Queue<Integer> queue = new ImmutableQueue<Integer>();
      queue = queue.deQueue();
      assertTrue(queue.isEmpty());
    }
    
}
