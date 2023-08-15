package main.java.com.georgescuconstantin.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        AddAndDisplay(queue);

        removeQueue(queue);

        printHeadOfQueue(queue);

        printSizeOfQueue(queue);
    }

    private static void printSizeOfQueue(Queue<Integer> queue) {
        int size = queue.size();
        System.out.println("Size of queue is : " + size);
    }

    private static void printHeadOfQueue(Queue<Integer> queue) {
        int head = queue.peek();
        System.out.println("Head of queue = " + head);
    }

    private static void removeQueue(Queue<Integer> queue) {
        int removedElement = queue.remove();
        System.out.println("Removed element = " + removedElement);
        System.out.println(queue);
    }

    private static void AddAndDisplay(Queue<Integer> queue) {
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }
        System.out.println("Queues are : " + queue);
    }

}
