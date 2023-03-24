//Adding two numbers by creating a object

class Addition
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}

class Demo
{
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 7;

        Addition obj = new Addition();
        int result = obj.add(num1, num2);

        System.out.println(result);
    }
}