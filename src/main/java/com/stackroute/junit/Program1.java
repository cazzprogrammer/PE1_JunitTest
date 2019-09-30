package main.java.com.stackroute.junit;

public class Program1 {

    public String isPalindrome(int number){

        int m = number;
        String str = " ";
        int rem=0,w=0,even = 0;
        while(m>0)
        {
            rem = m%10;
            if(rem%2 == 0)
            {
                even= even+rem;
            }
            w = w*10+rem;
            m = m/10;
        }

        if(w==number)
        {   //System.out.println(even);
            if(even >= 25)
            {
                str = number+" is palindrome and the sum of even numbers is greater than 25";
            }
            else{
                str= number +" is palindrome and the sum of even numbers is less than 25";
            }
        }
        else{
                str = number+" is not palindrome";
        }

        return str;
    }
}
