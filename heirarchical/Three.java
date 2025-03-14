class Parent{
    public void add(){
        System.out.println("Hello world");

    }
}
class Child extends Parent{
    void display(){
        add();
    }
}
class Third extends Child{
    void helper(){
        display();
    }
}
public class Three{
    public static void main(String[] args){
        Third obj = new Third();
    obj.helper();
    Child obj1 = new Child();
    obj1.display();
    }
}