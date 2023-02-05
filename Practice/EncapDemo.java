class Info {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("Name is " + name + " and age is " + age);
    } 
    
}

public class EncapDemo{
    public static void main(String args[]) {
        Info obj = new Info();
        obj.setAge(23);
        obj.setName("Megha");
        obj.show();
    }
}