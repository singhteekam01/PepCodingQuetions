package LinkedList;

public class Implementation {
    private static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node = new Node(3,null);
        list.head = list.tail = node;
        System.out.println(list.size()+"  "+list.tail.data);
    }
}
