package trash;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("lol"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("abberation"));
    }

    public static String isPalindrome(String str) {
        StringBuffer buffer = new StringBuffer(str);
        String reverseStr = buffer.reverse().toString();
        return str.length() <= 2  ? "Palindrome can't be less then 2 symbols" :
                str.equals(reverseStr) ? str + " - palindrome" : str + " - not palindrome";
    }
}
