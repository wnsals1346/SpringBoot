package collectionsEx;

import collectionsEx.myLinkedList.MyLinkedList;

public class CollectionTest {
    public static void main(String[] args) {
        MyLinkedList<Character> ll = new MyLinkedList<>();
        ll.addElement('a');
        ll.addElement('b');
        ll.addElement('d');
        ll.insertElement(3,'c');
        System.out.println(ll.size());
        ll.removeElement(2,'-');
        System.out.println(ll.size());

    }
}
