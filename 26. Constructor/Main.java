class Mobile
{
    private String name;
    private int age;

    public Mobile()  // Constructor
    {
        System.out.println("in constructor");
        name = "Raji";
        age = 34;
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
        Mobile obj = new Mobile();
        Mobile obj1 = new Mobile();  // For every object the constructor is called defaultly
        // obj.setAge(10);
        // obj.setName("Nandhini");

        System.out.println(obj.getName() + " : " + obj.getAge());
        
    }
}