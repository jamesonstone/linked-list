package com.company;

public class Main {

    public static void main(String[] args) {
        //init list
        LinkedList linkedList=  new LinkedList();

        System.out.println("Welcome to the LinkedList");

        for(int i = 0; i < 10; i++) {
            System.out.println("Adding new node: " + i);
            linkedList.addNodeAtEndOfList(i);
        }
        System.out.println("Finished loading");

        linkedList.showList();


    }
}
