class Calculator{
    public int add(int a,int b){
        System.out.print("Addition is : ");
        return a+b;
    }
}

public class DemoTest {
    public static void main(String args[]) {
        int num1 = 3;
        int num2 = 4;
        System.out.println("Hello ");
        Calculator obj = new Calculator();
        int sum = obj.add(num1,num2);
        System.out.println(sum);
    }
}
