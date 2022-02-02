package LinkedList;

public class Kth_Element_From_End  {
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

        void addFirst(int data){
            Node node = new Node(data,null);
            if(size == 0){
                head = tail = node;
            }else{
                node.next = head;
                head = node;
            }
            size++;
        }

        void addAt(int data,int idx){
            if(size == 0 || idx == 0){
                addFirst(data);
            }else if(idx == size){
                addLast(data);
            }else if(idx <0 || idx > size){
                System.out.println("Invalid argument");
                return;
            }else{
                Node curr = head;
                while(idx-->1){
                    curr = curr.next;
                }
                Node temp = curr.next;
                Node node = new Node(data,temp);
                curr.next = node;
                size++;
            }
        }

        void removeLast(){
            if(size == 0){
                System.out.println("List is empty");
                return;
            }else if(size == 1){
                head  = tail = null;
            }else{
                Node curr = head;
                while(curr.next != tail){
                    curr = curr.next;
                }
                curr.next = null;
                tail = curr;
                size--;
            }
        }

        void removeAt(int idx){
            if(size == 0){
                System.out.println("List is empty");
            }else if(idx == 0){
                removeFirst();
            }else if(idx == size-1){
                removeLast();
            }else if(idx< 0 || idx>= size){
                System.out.println("Invalid arguments");
            }else{
                Node curr =head;
                while(idx-->1){
                    curr = curr.next;
                }
                curr.next = curr.next.next;
                size--;
            }
        }

        Node getNode(int idx){
            if(idx == 0){
                return head;
            }
            if(size == 0){
                return null;
            }
            else{
                Node curr = head;
                while(idx-->0){
                    curr = curr.next;
                }
                return curr;
            }
        }

        void reverseDI(){
            int li = 0, ri = size-1;

            while(li < ri){
                Node left = getNode(li);
                Node right =getNode(ri);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                li++; ri--;
            }
        }

        void reversePI(){
            Node curr = head,prev = null;

            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr =next;
            }
            Node temp = head;
            head = prev;
            tail = head;
        }

        int kthFromEnd(int k){
            Node slow = head,fast = head;
            while(k-->0){
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(12);
        list.addLast(3);
        list.addLast(5);
        list.addLast(9);
        list.addLast(11);
        list.addLast(15);
        list.display();
        System.out.println(list.kthFromEnd(4));
    }
}





