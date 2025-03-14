import java.util.*;
public class Add{
    void add(int a,int b){
        System.out.println("Answer is"+(a+b));
    }
    void add(int a,int b, int c){
        System.out.println("Answer is"+(a+b+c));
    }
    public static void main(String[] args){
        Add obj=new Add();
        obj.add(84,56);
        obj.add(20,30,40);
    }
}