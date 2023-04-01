import tools.*;


class Main 
{
    public static void main(String[] args) 
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int add = obj.add(2, 2);
        int sub = obj.sub(9, 6);
        int mul = obj.mul(6, 6);
        int div = obj.div(9, 3);
        double pow = obj.pow(2,3);

        System.out.println(add + " " + sub + " " + mul + " " + div + " " + (int)pow);
    }
}