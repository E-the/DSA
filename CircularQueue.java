public class CircularQueue {

    int front=-1;
    int rear =-1;
    int queeue[];
    int size;

    CircularQueue(int size){
        this.size=size;
        queeue=new int[size];
    }

    public boolean enqueue(int data){
        if (isFull()){
            System.out.println("queue overflow");
            return false;
        }
        if (front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        queeue[rear]=data;
        return true;
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("queue underflow");
            return -999999;
        }
        int x=front;
        if(front==rear){
            front=rear=-1;
        }
        front=(front+1)%size;
        return queeue[x];
    }

    public boolean isFull(){
        return (rear+1)%size==front;
    }

    public boolean isEmpty(){
        return front==-1;
    }
    public static void main(String[] args) {
        CircularQueue al=new CircularQueue(2);
        
        //dequeue take the value out and show
        //dequeue increses value ++
        //enqueue puts the value in queueu
        System.out.println(al.enqueue(2)); 
        System.out.println(al.enqueue(3)); 
        System.out.println(al.dequeue()); 
        System.out.println(al.enqueue(4)); 
        System.out.println(al.dequeue());
        // System.out.println(al.enqueue(5)); 
        // System.out.println(al.dequeue());

 

         
    }
}
