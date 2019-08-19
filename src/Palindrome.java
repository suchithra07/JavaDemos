import javax.swing.*;

public class Palindrome {

    public static void main(String[] args) {
        // write your code here
        //System.out.println();

        String s1="madam";
        String rev="";

        for(int i=s1.length()-1;i>=0;i--)
        {
            rev=rev+s1.charAt(i);

        }
        if(s1.equalsIgnoreCase(rev))
                System.out.println(s1+ " is a Palindrome ");
        else
        System.out.println(s1+ " is not a Palindrome ");
    }
}
