class Mobile
{
    String brand;
    int price;
    static String name;

    public Mobile()
    {
        brand = "appple";
        price = 100;
        name = "phone";
    }

    public void show()
    {
        System.out.println(brand + " " + price + " " + name);
    }

    static
    {
        name = "MobilePhone";
        System.out.println("Inside Static block");
    }

    
}

class Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
    //    Mobile obj1 = new Mobile();
    //    obj1.brand = "Apple";
    //    obj1.price = 1200;
    //    obj1.name = "Phone";

    //    Mobile obj2 = new Mobile();
    //    obj2.brand = "Apple";
    //    obj2.price = 1200;
    //    obj2.name = "Phone";

    //    obj1.show();
    //    obj2.show();

    Class.forName("Mobile");
    }
}