public class StackedLinkedList<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public StackedLinkedList(){}
    public boolean isEmpty(){return list.isEmpty();}
    public int size(){return list.size();}
    public void push(E e){list.addFirst(e);}
    public E pop() {return list.deleteFirst();}
    public E top() {return list.first();}

}
