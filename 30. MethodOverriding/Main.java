class A 
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public void show()
    {
        System.out.println("In class A");
    }
}

class B extends A
{
    public int add(int n1, int n2)
    {
        return n1+n2-1;
    }
}



public class Main 
{
    public static void main(String[] args) 
    {
        B obj = new B();
        int result = obj.add(9,5);
        obj.show();
        System.out.println(result);  //13
    }
}