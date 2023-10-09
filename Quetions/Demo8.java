public class Demo8 {
    public static void main(String[] args) {
        //a10b11
        String s = "a1b1";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (i > 0) {
                    char temp = s.charAt(i - 1);
                    while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        num = (num * 10) + (s.charAt(i) - '0');
                        i++;
                    }
                    for (int j = 0; j < num; j++) {
                        System.out.print(temp);
                    }
                }
                num = 0;
            }


// (ab))
        }
    }
}
