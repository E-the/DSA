public class Linkedlist {
    public static class Node{
        int size=0;
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        
        }
        Node(){

        }
       
   
    }
    Node head=null;
    Node tail=null;
    int size=0;

    public void addNode(int data){
        size++;
        Node newnode=new Node(data);
        if(head==null){
            head= tail=newnode;
        }
        else {
            tail.next=newnode;
            tail=newnode;

//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newnode;
        }

}
public void print(){
    Node current=head;

    while(current!=null){
        System.out.println(current.data);
        current=current.next;
    }
}

public void removeTail(){
    size--;
    Node current=head;

    while(current!=null){
        current=current.next;
    }
    current.next=null;
    tail=current;
}
public int getSize(){
    return size;
}
public int getDataAtAnyPos(int pos){
    Node current=head;

    for (int i=1;i<=pos;i++){
        current=current.next;
    }
    return current.data;

}
    
    public static void main(String[] args) {
        Linkedlist aa= new Linkedlist();
        aa.addNode(10);
        aa.addNode(20);
        aa.print();
    }

   

    
}
