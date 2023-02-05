class B {
    public B(){
        System.out.println("B default. ");
    }
    public B(int n){
        System.out.println("B int. ");
    }
}

class A extends B {
    public A(){
        System.out.println("A default. ");
    }
    public A(int n){
        this();
        System.out.println("A int. ");
    }
}

public class InheritanceDemo {
    public static void main(String args[]) {
        A obj = new A(5);
    }
}
