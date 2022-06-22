public class DoubleLinkedListEg {


    public static class Node{
        Node next;
        Node prev;
        int data;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    Node tail=null;

    public void append(int data){
        Node newnoNode= new Node(data);
        if(head==null){
            head=newnoNode;
            tail=newnoNode;
        }
        else{
            tail.next=newnoNode;
            newnoNode.prev=tail;
            tail=newnoNode;
        }
    }
    public void insert(int data){
        Node newnoNode= new Node(data);
        if(tail==null){
            tail=newnoNode;
            head=newnoNode;
        }
        else{
            head.prev=newnoNode;
            newnoNode.next=head;
            head=newnoNode;
        }
    }
    public void RemoveAtPos(int pos){
        Node current=head;
        for(int i=0;i<pos-1;i++){
            current=current.next;
        }
        current.prev.next=current.next;
        current.next.prev=current.prev;
    }



    public void print(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String[] args) {
        DoubleLinkedListEg obj= new DoubleLinkedListEg();
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.RemoveAtPos(2);
        obj.print();

        
    }
}
