
class Adder
{
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public double add(double n1, int n2)
    {
        return n1+n2;
    }
}



class Methodoverloading
{
    public static void main(String args[]) 
    {
        double num1 = 12.45;
        int num2 = 13;
        //int num3 = 14;

        Adder obj = new Adder();
        //double result1 = obj.add(num1, num2, num3);
        double result2 = obj.add(num1, num2);

       // System.out.println(result1);
        System.out.println(result2);
        
    }
}