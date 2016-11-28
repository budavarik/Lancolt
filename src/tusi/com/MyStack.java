package tusi.com;

public class MyStack {

    private MyLinkedList linkedList = new MyLinkedList();

    public void push(int insertValue) {
        linkedList.firstInsert(insertValue);
    }

    public String pop() {
        String result = linkedList.show(0);
        linkedList.deleteFirst();
        return result;
    }

    public String peek() {
        return linkedList.show(0);
    }


}


