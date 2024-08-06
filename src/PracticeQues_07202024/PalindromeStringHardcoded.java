package PracticeQues_07202024;

public class PalindromeStringHardcoded {
    public static void main(String[] args) {
        //MADAM - PALINDROME IS ALSO MADAM
        String palindrome = "MADAM";
        String newplaindrome = "";

        for(int i =0; i < palindrome.length(); i++)
        {
            char ch = palindrome.charAt(i);
            newplaindrome = ch + newplaindrome;
        }
        if(palindrome.equals(newplaindrome))
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
