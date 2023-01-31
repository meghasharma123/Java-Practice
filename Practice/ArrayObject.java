class Student{
    String name;
    int marks;
}

public class ArrayObject {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Archana";
        s1.marks = 50;
        Student s2 = new Student();
        s2.name = "Tina";
        s2.marks = 40;
        Student s3 = new Student();
        s3.name = "Priyanka";
        s3.marks = 30;
        Student stu[] = new Student[3];
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;

        // Enhanced for loop :
        for(Student s : stu){
            System.out.println(s.name + " : " + s.marks);
        }
    }
}
