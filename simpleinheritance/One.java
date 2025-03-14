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
public class One{
    public static void main(String[] args){
        child obj = new child();
    obj.display();
    }
}