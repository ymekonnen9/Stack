public class SinglyLinkedList<T>{
    public static class Node<T>{
        private T element;
        private Node<T> next;
    

    public Node(T t){
        this.element = t;
    }

    public T getElement(){return this.element;}
    public Node<T> getNext(){return this.next;}
    public void setNext(Node<T> next){this.next = next;}
    
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList(){}
    public boolean isEmpty(){return(size == 0);}
    public int size(){return size;}
    public void addFirst(T t){
        Node<T> newNode = new Node<>(t);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            size++;
        }else{
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public T first(){
        return head.getElement();
    }

    public void addLast(T t){
        Node<T> newNode = new Node<>(t);
        if(isEmpty()){
            addFirst(t);
        }else{
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    public Node<T> returnNode(int i){
        Node<T> temp = head;

        for(int j =0; j < i; j++){
            temp = temp.next; 
        }
        return temp;
    }

    public void insertAtIndex(T t, int index){
        Node<T> temp = head;
        int i =1;
        while( i< index-1){
            temp= temp.getNext();
            i++;
        }
        Node<T> newNode = new Node<>(t);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        size++;
    }

    public T deleteFirst(){
        T t = head.getElement();
        head = head.next;
        size--;
        return t;
    }

    public T deleteLast(){
        T t = tail.getElement();
        Node<T> temp = head;
        int i =1;
        while(i<size-1){
            temp = temp.getNext();
        }
        temp.setNext(null);
        tail = temp;
        size--;
        return t;
    }

    public T deleteAtIndex(int index){
        Node<T> temp = head;
        int i =1;
        while(i < index-1){
            temp = temp.getNext();
        }
        T t = temp.getNext().getElement();
        temp.setNext(temp.getNext().getNext());
        size--;
        return t;
    }

    public void printSinglyLinkedList(){
        Node<T> temp = head;
         
        while(temp !=null){
            System.out.print(temp.getElement());
            temp= temp.getNext();
        }

    }
    
    public boolean isEqual(Object o){
        if(getClass() != o.getClass()){return false;}
        if(o == null){return false;}
        SinglyLinkedList other = (SinglyLinkedList) o;
        if(size != other.size){return false;}
        Node walkA = head;
        Node walkB = other.head;

        while(walkA != null){
            if(!(walkA.getElement().equals(walkB.getElement()))){
                return false;
            }
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }

    
}