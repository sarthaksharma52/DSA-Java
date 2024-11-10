package LinkedList;

public class LinkedList {

    Node head;
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val , Node next){
            this.val = val;
            this.next = next;
        }
    }

    // insertion in linkedList
    public void insert(int val){
        Node newnode = new Node(val);
        if(head==null){
            head = newnode;
        }else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newnode;
        }

    }

    // deletion in linkedlist

    public void delete(int val)
    {
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.val == val) {
            head = temp.next;
            return;
        }


        while (temp != null && temp.val != val) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    // display LinkedList

    public void display(){
        Node current = head;
        if(current==null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null){
            System.out.print(" " + current.val + " " + "->");
            current = current.next;
        }
        System.out.print("End");
        System.out.println();
        return;

    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(7);
        list.insert(44);
        list.insert(75);
        list.insert(67);
        list.insert(12);
        list.display();
        list.delete(75);
        list.display();


    }
}
