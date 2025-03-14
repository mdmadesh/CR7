class Parent{
    public void add(){
        System.out.println("Hello world");

    }
}
class child extends Parent{
    void display(){
        add();
    }
}
class Third extends child{
    void helper(){
        display();
    }
}
public class Two{
    public static void main(String[] args){
        Third obj = new Third();
    obj.helper();
    }
}