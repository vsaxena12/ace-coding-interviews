package org.dsa.linkedList;

import static org.dsa.linkedList.Solution1.insertAtTail;

public class Driver {
    public static void main(String[] args) {
        Integer[][] input = {
                {1, 2, 3, 4, 5},
                {-1, -2, -3, -4, -6},
                {3, 2, 1},
                {},
                {1, 2},
        };

        int[] values = {4, -5, 2, 0, -98};

        for (int i = 0; i < input.length; i++) {
            LinkedList<Integer> inputLinkedList = new LinkedList<Integer>();
            inputLinkedList.createLinkedList(input[i]);

            System.out.print((i + 1) + ".\tInput linked list: ");
            PrintList<Integer> printLinkedList = new PrintList<Integer>();

            printLinkedList.printListWithForwardArrow(inputLinkedList.head);
            System.out.println("\n\tNew node to be added: "+ values[i]);
            System.out.print("\n\tUpdated linked list: ");

            printLinkedList.printListWithForwardArrow(insertAtTail(inputLinkedList.head, values[i]));
            System.out.println("\n" + new String(new char[100]).replace('\0', '-'));
        }
    }
}
