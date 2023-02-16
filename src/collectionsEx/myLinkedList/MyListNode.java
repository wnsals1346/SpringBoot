package collectionsEx.myLinkedList;

public class MyListNode<T> {

    private T data;       // 자료
    public MyListNode<T> next;    // 다음 노드를 가리키는 링크

    public MyListNode(){
        data = null;
        next = null;
    }

    public MyListNode(T data){
        this.data = data;
        this.next = null;
    }

    public MyListNode(T data, MyListNode<T> link){
        this.data = data;
        this.next = link;
    }

    public T getData(){
        return data;
    }
}

