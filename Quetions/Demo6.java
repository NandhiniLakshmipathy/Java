public class Demo6 {
    public static void main(String[] args) {
        String str1 = "test123string";
        String str2 = "te12";
        System.out.println(subString(str1,str2));

    }
    public static  int subString(String str1,String str2)
    {
        int result = str1.indexOf(str2);
        if(result!=-1)
        {
            return result;
        }
        return -1;
    }
}
