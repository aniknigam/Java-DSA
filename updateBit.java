//update the 2nd bit (position = 1) of a number n to 1 number = 0101

//if we want to update a bit to 0 we perform clear operation
//if we want to update a bit to 1 we perform set operation

public class updateBit {
    public static void main(String[] args){
          int n = 5; //0101
          int pos = 1;
          int bitMask = 1<<pos;
          int number = bitMask | n;
          System.out.print(number);
          
    }
}
