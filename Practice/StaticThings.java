class Mobile{
    int ItemCode;
    static String name;
    static{
        name = " Samsung ";
    }
    Mobile(){
        ItemCode = 501;
    }
    public void show(){
        System.out.println(name + " :  " + ItemCode);
    }
}
public class StaticThings {
    public static void main(String args[]) {
        Mobile m = new Mobile();
        Mobile.name="Redmi";
        m.ItemCode = 689;
        m.show();
    }
}
