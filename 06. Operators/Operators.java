// Assignment and Arithmetic operators

class Operators
{
    public static void main(String args[])
    {
        // Assignment operators --> =, +=, -=, *=, /=

        int num = 10;
        System.out.println(num); //10
        num += 2;
        System.out.println(num); //12


        //Arithmetic Operators --> +, -, *, /, %

        int num1 = 20;
        int num2 = 10;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2; // returns remainder
        System.out.println(add);  // 30
        System.out.println(sub);  // 10
        System.out.println(mul);  // 200
        System.out.println(div);  // 2
        System.out.println(mod);  // 0

        // Relational Operators --> <, >, <=, >=, ==, !=
        // Returns either true or false

        int x = 10;
        int y = 13;
        boolean z = x > y;
        System.out.println(z);  // false


        // Logical Operators
        // &&-AND (RETURNS TRUE ALL ARE TRUE) 
        // ||-OR (RETURNS EITHER ONE CONDITION IS TRUE)
        // !-NOT (CHANGES TRUE TO FALSE AND VICEVERSA)

        int a = 20;
        int b = 10;
        boolean c = a >= b && a != b;
        boolean d = a >= b || a == b;
        boolean e = !(a>=b);
        System.out.println(c); // true
        System.out.println(d); // true
        System.out.println(e); // false
    }
}