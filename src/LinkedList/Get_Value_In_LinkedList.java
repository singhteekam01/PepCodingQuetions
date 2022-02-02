package LinkedList;

public class Get_Value_In_LinkedList {
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

        void display(){
            if(size == 0){
                System.out.println("list is empty");
                return;
            }
            Node curr= head;
            while(curr != null){
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        void removeFirst(){
            if(size == 0){
                System.out.println("List is Empty");
                return;
            }
            else if(size == 1){
                head = tail = null;
                size--;
            }else{
                head = head.next;
                size--;
            }
        }

        int getFirst(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        int getLast(){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            return tail.data;
        }

        int getAt(int idx){
            if(size == 0){
                System.out.println("List is empty");
                return -1;
            }
            if(idx == 0){
                return getFirst();
            }else if(idx == size-1){
                return getLast();
            }else if(idx < 0 || idx>= size){
                System.out.println("Invalid argument");
                return -1;
            }else{
                Node curr =head;
                while(idx-->0){
                    curr =curr.next;
                }
                return curr.data;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list.getFirst());
        list.addLast(3);
        list.addLast(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.addLast(9);
        list.addLast(11);
        list.addLast(15);
        System.out.println(list.getAt(4));
        System.out.println(list.getAt(-1));
        System.out.println(list.getAt(3));
        list.display();
    }
}

