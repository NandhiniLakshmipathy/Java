class Ternary
{
    public static void main(String args[])
    {
        int n = 30;
        int result = 0;
        
        // if(n%2 == 0)
        //     result = 10;
        // else
        //     result = 20;

        // System.out.println(result);

        // ternary op --> ?:
        result = n%2 == 0 ? 10 : 20;

        System.out.println(result);
    }
}