
// Dynamic Method Dispatch

class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("In B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("In C show");
    }
}

public class Main 
{
    public static void main(String args[])
    {
        A obj1 = new B();
        obj1.show(); //In B show

        obj1 = new A();
        obj1.show();  //In A show

        obj1 = new C();
        obj1.show();// In C show
    }
}