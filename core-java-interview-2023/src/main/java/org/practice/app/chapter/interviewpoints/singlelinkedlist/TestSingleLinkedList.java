package org.practice.app.chapter.interviewpoints.singlelinkedlist;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        LinkedListOperations listRepository = new LinkedListOperationsImpl();
        listRepository.insert(10);
        listRepository.insert(20);
        listRepository.insert(40);
        listRepository.insert(50);
        listRepository.insert(20);
        listRepository.display();
        listRepository.update(10,100);
        listRepository.delete(20);
        listRepository.display();

    }
}


