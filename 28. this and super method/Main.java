class A extends Object   // Super class
{
    public A()
    {
        
        System.out.println("in A");
    }

    public A(int n)
    {
        super();
        System.out.println("in int A");
    }
}

class B extends A  // sub class
{
    public B()
    {
        super();
        System.out.println("in B");
    }

    public B(int n)
    {
        this();
        System.out.println("in int B");
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        B obj = new B(6);
    }
}