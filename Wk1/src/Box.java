/**
 * Created by geoff_000 on 10/01/2016.
 */
public class Box<T> {
    T data;
    public Box(T data){
        this.data = data;
    }
    public T getData(){
        return data;
    }

    @Override
    public String toString(){
        return "" + data;
    }

    public static void main(String[] args){
        Box<String> strBox = new Box<String>("What's may name?");
        Box<Integer> intBox = new Box<Integer>(234);
        Box<Double> dbleBox = new Box<Double>(233.223);
        System.out.println(intBox);

    }

}
