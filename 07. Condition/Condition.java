class Condition
{
    public static void main(String [] args)
    {
        int x = 7;
        int y = 13;
        // print greatest of two numbers
        if(x > y)
            System.out.println(x);
        else
        {
            System.out.println(y); 
            System.out.println("Thank you");
        }



        // print greatest of three numbers 

        int a = 33;
        int b = 8;
        int c = 14;

        if(a>b && a>c)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c); 
    }
}