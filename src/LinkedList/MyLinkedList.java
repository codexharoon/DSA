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
    private Node head = null;
//    private Node tail = null;

    public boolean isEmpty(){
        return head == null /*&& tail == null*/;
    }

    public void insert(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
//            head = tail = newNode;
        }
        else{
//            tail.next = newNode;
//            tail = newNode;

            Node current = head;

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void remove(){
        if(isEmpty()) return;
        if(head.next == null){
            removeHead();
            return;
        }

        Node prev = null;
        Node current = head;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
//        tail = prev;
    }

    public void insertHead(int value){
        if(isEmpty()){
            insert(value);
        }

        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;
    }

    public void removeHead(){
        if(isEmpty()) return;

//        if(head.next == null){
//            head = tail = null;
//        }

        Node temp = head;
        head = head.next;

        temp.next = null;
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


    public void removeAt(int pos){
        if(isEmpty()) return;

        if(pos == 0){
            removeHead();
            return;
        }

        Node prev = null;
        Node current = head;

        while(current != null && pos > 0){
            prev = current;
            current = current.next;
            pos--;
        }

        prev.next = current.next;

        current.next = null;

//        if(current.next == null){
//            tail = prev;
//        }

    }

    public void reverse(){
        if(isEmpty() || head.next == null) return;

        Node prev = null;
        Node current = head;
        Node next = head.next;

        while(next != null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }

        current.next = prev;
        head = current;
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

//        l.reverse();
//        System.out.println(l);

        l.insert(8888);
        System.out.println(l);

        l.removeHead();
        l.removeHead();
        System.out.println(l);

        l.removeAt(1);
        System.out.println(l);

        l.remove();
        System.out.println(l);

        l.insert(1212);
        System.out.println(l);

        l.removeAt(5);
        l.insert(111);

        System.out.println(l);

        l.insertAt(9090,6);
        l.insert(9091);
        System.out.println(l);
    }

}
