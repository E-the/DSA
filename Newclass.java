public class Newclass{
    int a[];
    int length=0;
    Newclass(int size){
        a=new int[size];
        for(int i=0;i<a.length-1;i++){
            a[i]=100+i;
            length++;
        }
    }

    public void printArray(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    
public boolean instAtAnyPos(int data, int pos) {
 if (pos>a.length || pos<0){
     return false;
 }
  for(int i=length; i>pos-1;i--){
   a[i]=a[i-1];
  }
  a[pos-1]=data;
  return true;

}


    public static void main(String[] args) {
        Newclass always = new Newclass(5);
        System.out.println("Printing after");
        always.printArray();
        always.instAtAnyPos(30, 2);
        System.out.println("printing before");
        always.printArray();


    }
}