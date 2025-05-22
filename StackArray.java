import java.util.ArrayList;

public class StackArray implements Stack {
    private ArrayList<Object> stack = new ArrayList();


    @Override
    public void push(Object item) {
        stack.add(0,item);

    }

    @Override
    public Object pop() throws MyEmptyStackException {
        if(this.isEmpty()){
        throw new MyEmptyStackException ("stack is empty,you cant pop anything");
        return stack.remove(0);
    }

    @Override
    public void peek() {
        if(this.isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println("the top element is" + stack.get(0));



    }

    @Override
    public boolean isEmpty() {
        return stack.size()==0;


    }
}

