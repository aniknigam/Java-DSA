import java.util.*;
public class stringParseInt {

    //While operating upon strings, there are times when we need to convert a number represented as a string into an integer type. The method generally used to convert String to Integer in Java is parseInt(). This method belongs to Integer class in java.lang package. 

    
    public static void main(String [] args){
        String name = "213";
        int number = Integer.parseInt(name);
        System.out.println(number);
    }
}
