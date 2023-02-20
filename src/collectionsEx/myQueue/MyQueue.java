package collectionsEx.myQueue;

import collectionsEx.myLinkedList.MyLinkedList;
import collectionsEx.myLinkedList.MyListNode;

public class MyQueue extends MyLinkedList<String> {

    MyListNode<String> front;
    MyListNode<String> rear;

    public MyQueue() {
        front = null;
        rear = null;
    }


    public void enQueue(String data) {
        MyListNode newNode;
        if(front==null)  //처음 항목
        {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        }
        else
        {
            newNode = addElement(data);
            rear = newNode;
        }
        System.out.println(newNode.getData() + " added");
    }
    public String deQueue() {
        if(front==null){
            System.out.println("Queue is Empty");
            return null;
        }
        String data = front.getData();
        front = front.next;
        removeElement(0);
        if( front == null ){  // 마지막 항목
            rear = null;
        }
        return data;

    }

    public void printQueue() {
        print();
    }
}
