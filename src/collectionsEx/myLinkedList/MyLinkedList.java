package collectionsEx.myLinkedList;

import java.util.ArrayList;

public class MyLinkedList<T> {
    private MyListNode<T> head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(T data) {
        MyListNode<T> newNode = new MyListNode<>(data);

        if(head==null) {
            head = newNode;
        } else {
            MyListNode<T> temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        print();
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, T data) {
        MyListNode<T> newNode = new MyListNode<>(data);

        if(position<0 || position>count) {
            System.out.println("Invalid index, size is "+count);
            return null;
        }

        if(position==0) {
            newNode.next = head;
            head = newNode;
        } else {
            MyListNode<T> prev = head;
            while(--position>0) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
        }
        count++;
        print();
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode<T> removedNode = null;

        if(position<0 || position>count) {
            System.out.println("Invalid index");
            return null;
        }

        if(position==0) {
            head = head.next;
        } else {
            MyListNode<T> prev = head;
            while(--position>0) {
                prev = prev.next;
            }
            removedNode = prev.next;
            prev.next = prev.next.next;
        }
        count--;
        print();
        return removedNode;
    }

    public int size() {
        return count;
    }
    public void print() {
        MyListNode<T> temp = head;
        while(temp!=null) {
            System.out.print(temp.getData()+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
