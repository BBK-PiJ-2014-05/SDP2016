/**
 * Created by geoff_000 on 10/01/2016.
 */
public class IntStack {
    private int[] stack;
    private final int INITIAL_SIZE = 5;
    private int size;

    public IntStack(){
        stack = new int[INITIAL_SIZE];
        size = 0;
    }

    public void push(int x){
        stack[size] = x;
        size++;
    }

    public int pop(){
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException("Empty stack");
        } else{
            size--;
            int result = stack[size];
            return result;
        }
    }

    public static void main(String[] args){
        IntStack stack = new IntStack();
        stack.push(22);
        stack.push(23);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Class classObj = stack.getClass();
        Class arrayClass = stack.getClass();


        int[] test = new int[5];
        arrayClass = test.getClass();
        Class elementClass = arrayClass.getComponentType();
        System.out.println(elementClass);
    }

}
