class Human{
    private int age;
    private int score;
    public Human(){
        age = 45;
        score = 95;
    }
    public Human(int age,int score){
        this.age = age;
        this.score  = score;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public void show(){
        System.out.println(age + "and " + score);
    }
    
}

public class ConstructDemo {
    public static void main(String arge[]) {
        Human obj = new Human();
        Human obj1 = new Human(2,1);
        obj.show();
        obj1.show();
    }    
}
