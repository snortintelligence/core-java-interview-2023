package org.practice.app.chapter.interviewpoints.singlelinkedlist;

public class LinkedListOperationsImpl implements LinkedListOperations {

    private Node head;

    @Override
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public void display() {
        Node current = head;
        while (current!=null){
            System.out.println(current.data+" ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    @Override
    public void update(int oldData, int newData) {
        Node current = head;
        while (current != null){
            if(current.data == oldData){
                current.data = newData;
                return;
            }
            current = current.next;
        }
        System.out.println("Element not found: " + oldData);

    }

    @Override
    public void delete(int oldData) {
        //case 1. isEmpty
        if(head==null){
            System.out.println("List is empty!");
        }
        //case 2. check data is present of not
        if(head.data==oldData){
            head = head.next;
        }

        Node current = head;
        while (current.next !=null && current.next.data != oldData){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }else{
            System.out.println("Element not found: " + oldData);
        }
    }
}
