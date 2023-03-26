class Student
{
    int rollno;
    String name;
    int marks;
}


class Array
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student(); 
        obj1.rollno = 1;
        obj1.name = "Nandhini";
        obj1.marks = 67;

        Student obj2 = new Student(); 
        obj2.rollno = 2;
        obj2.name = "kalidass";
        obj2.marks = 88;

        Student obj3 = new Student(); 
        obj3.rollno = 3;
        obj3.name = "Ramya";
        obj3.marks = 77;

        Student students[] = new Student[3];
        students[0] = obj1;
        students[1] = obj2;
        students[2] = obj3;

        //System.out.println(obj1.name + ": " + obj1.rollno);

        // for(int i = 0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " " + students[i].rollno + " " + students[i].marks);
        // }

        for(Student n : students)  // enhanced for loop (for each loop)
        {
            System.out.println(n.name + " " + n.rollno + " " + n.marks);
        }
    }
}