public class TestStack {

    public static void main(String[] args) {
        
        StackExample stk=new StackExample(5);
        stk.push(10);
        stk.push(20);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
    
}
