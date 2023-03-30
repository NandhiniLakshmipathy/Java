class Human
{
    private String name;
    private int age;

    public Human()  // defult Constructor
    {
        System.out.println("in constructor");
        name = "Raji";
        age = 34;
    }

    public Human(int age, String name)  // Parameterized constructor
    {
        System.out.println("in parameterized constructor");
        this.age = age;
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

}


public class Main
{
    public static void main(String[] args) 
    {
        Human obj = new Human();
        Human obj1 = new Human(10, "jhon");  // For every object the constructor is called defaultly
        // obj.setAge(10);
        // obj.setName("Nandhini");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        
    }
}