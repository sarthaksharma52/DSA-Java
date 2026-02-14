package SystemDesign;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head = null;
    }
    
    public int get(int index) {
        Node temp = head;
        int count = 0;
        while(temp != null){
            if(count == index){
                return temp.val;
            }

            temp = temp.next;
            count++;
        }

        return -1;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        Node temp = head;
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
            return;
        }
        int count = 0;
        Node newNode = new Node(val);
        Node temp = head;
        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }

        if(temp == null){
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(head == null ){
            return;
        }

        if(index == 0){
            head = head.next;
            return;
        }


        Node temp = head;
        int count = 0;
        while(temp != null && count < index-1){
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) return;
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */