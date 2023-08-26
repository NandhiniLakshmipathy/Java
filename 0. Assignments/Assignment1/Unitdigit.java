class Unitdigit{

public static void main(String a[]){

int num1 = 53;
int num2 = 23;

int unitNum1 = num1 % 10;
int unitNum2 = num2 % 10;

int sum = unitNum1 + unitNum2;

if(sum % 2 != 0)
    System.out.println("The sum is Odd");
else
    System.out.println("The sum is Even");

}
}
