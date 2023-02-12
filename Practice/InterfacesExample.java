import static java.lang.System.out;

interface System{
    void show();
}

class Laptop implements System{
    public void show() {
        out.println("laptop aya re........");
    }
}

class Desktop implements System{
    @Override
    public void show() {
        // TODO Auto-generated method stub
        out.println("Desktop aya re........");
    }
}


public class InterfacesExample {
    public static void main(String args[]) {
        System obj;
        obj = new Laptop();
        obj.show();
        obj = new Desktop();
        obj.show();
    }
}
