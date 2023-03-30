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

    public void show1()
    {
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show(Mobile obj)
    {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }

}

class Main
{
    public static void main(String[] args) throws ClassNotFoundException
    {
       Mobile obj1 = new Mobile();
    //    obj1.brand = "Apple";
    //    obj1.price = 1200;
    //    Mobile.name = "Phone";

       Mobile obj2 = new Mobile();
       obj2.brand = "Samsung";
       obj2.price = 1200;
       Mobile.name = "Phone";

       Mobile.show(obj2);
       obj1.show1();

    }
}