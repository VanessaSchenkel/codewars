package com.codewars;

import org.springframework.stereotype.Component;

//Given the pointer to the head node of a linked list and an integer to insert at a certain position, create a new node
// with the given integer as its  attribute, insert this node at the desired position and return the head node.
//A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given
// may be null meaning that the initial list is empty.

//insertNodeAtPosition has the following parameters:
//
//        head: a SinglyLinkedListNode pointer to the head of the list
//        data: an integer value to insert as data in your new node
//        position: an integer position to insert the new node, zero based indexing

//SinglyLinkedListNode pointer: a reference to the head of the revised list

@Component
class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public class InsertANodeAtASpecificPositionInALinkedList {
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode n = new SinglyLinkedListNode(data);
        n.data = data;
        n.next = null;
        if (head == null) {
            n.next = head;
            head = n;
            return head;
        } else {
            SinglyLinkedListNode n1 = head;
            for (int i = 0; i < position - 1; i++) {
                n1 = n1.next;
            }
            n.next = n1.next;
            n1.next = n;
            return head;
        }
    }

}

