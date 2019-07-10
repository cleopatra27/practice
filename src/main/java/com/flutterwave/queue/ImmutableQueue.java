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
public class ImmutableQueue<T> implements Queue<T> {

    static <T> ImmutableQueue<T> copy(final ImmutableQueue<T> other) {
        return new ImmutableQueue(other);
    }

    ImmutableQueue() {}

    ImmutableQueue(ImmutableQueue<T> other) {
        doInsertAll(other);
    }

    public Queue<T> enQueue(T t) {
        final ImmutableQueue<T> copy = copy(this);
        copy.doInsert(t);
        return copy;
    }

    public Queue<T> deQueue() {
        final ImmutableQueue<T> copy = copy(this);
        copy.doRemoveHead();
        return copy;
    }

    public T head() {
        return head == null ? null : head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    class Element {

        private T data;

        private Element next = null;

        Element(T data, Element next) {
            this.data = data;
            this.next = next;
        }

        Element(T data) {
            this(data, null);
        }

    }

    private Element head = null;

    private Element tail = null;

    private Queue<T> doInsertAll(ImmutableQueue<T> other) {
        Element next = other.head;
        while (next != null) {
            doInsert(next.data);
            next = next.next;
        }
        return this;
    }

    private void doInsert(T data) {
        if (this.head == null) {
            this.head = new Element(data);
            return;
        }
        Element next = head, prev = null;
        while (next != null) {
            prev = next;
            next = prev.next;
        }
        prev.next = new Element(data);
    }

    private void doRemoveHead() {
        if (this.head == null)
            return;
        this.head = head.next;
    }

}


