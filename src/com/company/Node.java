package com.company;

public class Node {
    // reference to the next node in the list
    Node next;
    // data in the node (object because we want to store anything)
    Object data;

    /**
     * first constructor for creating node without second reference
     * @param data data associated with node
     */
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    /**
     * second constructor for creating full node in one go
     * @param data data associated with node
     * @param next reference to next node
     */
    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
