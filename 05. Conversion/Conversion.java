class Conversion 
{
    public static void main(String args[])
    {
        byte b = 127;
        int a = b;
        // int b = a; error
        // System.out.println(a); //127

        int j = 257;
        //byte k = j; // error,, cannote assign a integer to byte
        byte k = (byte)j;
        System.out.println(k);  //1 (byte range is uptp 256)

        float f = 5.5f;
        int x = (int)f;



// Type conversion

        byte num1 = 10;
        byte num2 = 20;

        int result = num1 * num2; //implicit conversion

        System.out.println(result);
    }
}
