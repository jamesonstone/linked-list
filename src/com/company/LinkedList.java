package com.company;

public class LinkedList {
    private Node first;

    public LinkedList() {
        //create a blank node in our list when it starts
        this.first = null;
    }

    public void addNodeAtEndOfList(Object data) {
        if (first == null) {
            first = new Node(data, null);
        }

        Node node = new Node(data);
        Node current = first;

        if (current != null) {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
    }
    
    public void makeNode(Object data) {}
    public Node findTail() { return null; }

    /**
     * Show all the items in the list
     */
    public void showList() {
        // load up the first item in the list
        Node current = first;

        //while there are more things in the list, keep going
        while (current != null) {
            //print out the data assocaited with the node
            System.out.println("Node Data: " + current.data + "\r\n");
            //setup the next node in the list
            current = current.getNext();
        }
    }

}
