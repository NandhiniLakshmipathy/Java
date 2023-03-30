


class Main 
{
    public static void main(String[] args) 
    {
        AdvCalc obj = new AdvCalc();
        int a = obj.add(2, 2);
        int b = obj.sub(9, 6);
        int c = obj.mul(6, 6);
        int d = obj.div(9, 3);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}