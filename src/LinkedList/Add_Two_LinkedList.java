package LinkedList;

public class Add_Two_LinkedList {
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
    }

    public static Node reverseList(Node head){
        Node curr = head, prev= null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = next;
        }
        return prev;
    }

    public static LinkedList addTwoList(LinkedList l1, LinkedList l2){
        if(l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }

        LinkedList res = new LinkedList();

        Node h1 = reverseList(l1.head);
        Node h2 = reverseList(l2.head);
        int carry = 0;
        while(h1 != null || h2 != null){
            int d1 = h1 == null ? 0 : h1.data;
            int d2 = h2 == null ? 0 : h2.data;
            int data = (d1+d2+carry);
            carry = (d1+d2)/10;
            data = data%10;
            res.addLast(data);
            if(h1 != null){
            h1 = h1.next;
            }
            if(h2 != null){
            h2 = h2.next;
            }
        }
        Node resHead = reverseList(res.head);
        res.head  =resHead;
        return res;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(4);
        list1.addLast(5);
        list2.addLast(7);
        list2.addLast(8);
        list2.addLast(9);
        list1.display();
        list2.display();
        LinkedList res = addTwoList(list1,list2);
        res.display();

    }
}


