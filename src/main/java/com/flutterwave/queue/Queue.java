/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flutterwave.queue;

/**
 *
 * @author cleopatradouglas
 */
public interface Queue<T> {
	/**
	 * 
	 * @param t generic type for the elements of the queue
	 * @return the new queue after inserting the element {@code t} to the beginning of the queue 
	 */
    public Queue<T> enQueue(T t);
    
    /**
	 * 
	 * @return the new queue after removing the element from the beginning of the queue 
	 */
    public Queue<T> deQueue() throws Exception;
    
    /**
     * 
     * @return the head element of the queue
     * @throws Exception when queue is empty
     */
    public T head() throws Exception;
    
    /**
     * 
     * @return true when queue is empty, false otherwise
     */
    public boolean isEmpty();
}
