public class Strings
{
    public static void main(String[] args)
    {
       // String is actually a class

       String obj = new String("Nandhini");
       System.out.println(obj.hashCode()); //1933525189
       System.out.println(obj.concat(" Lakshmipathy")); //Nandhini Lakshmipathy
       System.out.println(obj.charAt(3)); //d


       // Mutable and immutable strings

       String name = "Nandhini";
       name = name + " Lakshmipathy";
       System.out.println("Hello! " + name);

       String s1 = "Apple";
       String s2 = "Apple";
       System.out.println(s1 == s2);


       // String Buffer

       StringBuffer sb = new StringBuffer();
       System.out.println(sb.capacity());  //16

       StringBuffer sb2 = new StringBuffer("Nandhini");
       System.out.println(sb2.capacity()); //24 (16+8)

       sb2.append("Nandhi");
       System.out.println(sb2);  //NandhiniNandhi

       sb2.insert(0, "l.");
       System.out.println(sb2);  //l.NandhiniNandhi

       sb2.delete(0, 2);
       System.out.println(sb2); //NandhiniNandhi
    }
}