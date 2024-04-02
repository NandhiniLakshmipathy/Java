
public class Main{
 
    public static void main(String args[])
    {
        final int num = 89;
        Integer i = 90;
        System.out.println("value of i: "+i);
        Student stud1 = new Student(30, "L_Nandhini", 87.5);
        Student stud2 = new Student();
        Student stud3 = new Student();
        Student other = new Student(stud1);
        // stud1.rollNo = 21;
        // stud1.name = "Nandhini";
        //stud1.marks = 40.4;
        System.out.println(other.rollNo);
        System.out.println(stud1.name);
        System.out.println(stud1.marks);

        System.out.println("rollno of stud2: " + stud2.rollNo);

        stud2.greeting();

        stud1.changeName("Lakshmipathy");
        System.out.println("Changed name of stud1:" + stud1.name);

        //calling method of pack oops2
        greeting();
    }
}

class Student{
    int rollNo;
    String name;
    double marks = 90;

    Student(int rollNo, String name, double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    } 

    void greeting(){
        System.out.println("Hello!, " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    // Student()
    // {
    //     this.rollNo = 23;
    //     this.name = "Kalifdass";
    //     this.marks = 756;
    // } 

    Student(Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        this(78, "Kalidass", 90.8);
    }
}