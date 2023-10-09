public class Demo7 {
    public static void main(String[] args) {
        String givenString = "one two three";
        String result = reverseString(givenString);
        System.out.println(result);
    }
    public static String reverseString(String givenString){
        if(givenString.isEmpty() || givenString.indexOf(" ")==-1)
        {
            return givenString;
        }
        String firstWord = givenString.substring(0,givenString.indexOf(" "));
        String remainingWord = givenString.substring(givenString.indexOf(" ")+1);
        return reverseString(remainingWord) + " " + firstWord;
    }
}
