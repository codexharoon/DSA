package LinkedList;


class Node{
    public int data;
    public Node next;

    public Node(int value){
        this.data = value;
        next = null;
    }
}


public class MyLinkedList {
    private Node head, tail = null;

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void insert(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertHead(int value){
        if(isEmpty()){
            insert(value);
        }

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int value,int pos){
        if(isEmpty()) throw new IllegalArgumentException();

        if(pos == 0){
            insertHead(value);
            return;
        }

        Node current = head;
        Node prev = null;
        Node newNode = new Node(value);

        while(current != null && pos > 0){
            prev = current;
            current = current.next;
            pos--;
        }

        prev.next = newNode;
        newNode.next = current;
    }

    public int indexOf(int value){
        Node current = head;
        int index = 0;
        while(current!= null){
            if(current.data == value){
                return index;
            }

            index++;
            current = current.next;
        }

        return -1;
    }

    public String toString(){
        StringBuilder list = new StringBuilder();
        list.append("[");

        Node current = head;
        while(current != null){
            list.append(current.data).append(", ");
            current = current.next;
        }

        list.append("\b\b").append("]");

        return list.toString();
    }


    public static void main(String[] args){
        MyLinkedList l = new MyLinkedList();

        l.insert(2);
        l.insert(1);
        l.insert(489);
        l.insert(33);
        l.insert(56);
        l.insert(4);
        l.insert(90);

        System.out.println(l);

        System.out.println(l.indexOf(4));

        l.insertAt(999,0);
        System.out.println(l);
    }

}
