package main.java.com.stackroute.junit;

public class Program2 {

    public String checkOddEvenNumber(int number){
        String str = " ";
        if(number>20 && number<30){

            if(number%2 == 0)
            {
                str = "Tom";
            }
            else{
                str = "Jerry";
            }
        }
        else{
            str = "Out of range : Number Should be between 20 to 30";
        }
       return str;
    }
}
