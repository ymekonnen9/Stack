public class arrayStack<E> implements Stack<E>{
    public final static int CAPACITY = 1000;
    private int size = 0;
    private E[] data;
    private int top = -1; 

    public arrayStack(){
        this(CAPACITY);
    }

    public arrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }

    public int size(){return size;}
    public boolean isEmpty(){return(size==0);}

    public void push(E e)throws IllegalStateException{
        if(size == data.length){throw new IllegalStateException("Stack is full");}
        data[++top] = e;
        size++;
    }

    public E top(){
        if(isEmpty()){return null;}
        return data[top];
    }

    public E pop(){
        if(isEmpty()){return null;}
        E popped = data[top];
        data[top--] = null;
        size--;
        return popped;
    }
}
