package LinkedList;

public class Add_Last_In_LL {
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

        void addLast(int data){
            Node node = new Node(data,null);
            if(size==0){
                head = tail = node;
                size++;
            }else{
                tail.next = node;
                tail = node;
                size++;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        System.out.println(list.size()+"  "+list.tail.data);
        list.addLast(5);
        System.out.println(list.size()+"  "+list.tail.data);
        list.addLast(9);
        System.out.println(list.size()+"  "+list.tail.data);
        list.addLast(11);
        System.out.println(list.size()+"  "+list.tail.data);
    }
}
