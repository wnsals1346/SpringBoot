package collectionsEx;

import collectionsEx.myLinkedList.MyLinkedList;
import collectionsEx.myQueue.MyQueue;
import collectionsEx.myStack.MyStack;

import java.util.Stack;

public class CollectionsTest {
    public static void main(String[] args) {
        //MyArray marr = new MyArray();
        /*MyLinkedList<String> ml = new MyLinkedList<>();

        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        System.out.println(ms.pop());
        System.out.println(ms.peek());*/

        MyQueue mq = new MyQueue();
        mq.enQueue("a");
        mq.enQueue("b");
        mq.enQueue("c");
        System.out.println(mq.deQueue());
        mq.printQueue();



    }
}
