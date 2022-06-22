import java.security.PublicKey;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class StackExample {
    int stk[];
    int top=-1;
    int size;

    StackExample(int size){
        this.size=size;
        stk=new int[size];
    }

    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return false;
        }

        stk[++top]= data;
        return true;

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack overflow");
            return -9999;
        }
        int x= top;
        top--;
        return stk[x];
    }

    private boolean isEmpty() {
        return top==1;
    }

    public boolean isFull(){
        return top==size-1;
    }

}
