//WAP to clear the bit (position = 2) of a number n = 0101

public class clearBit {
    public static void main(String[] args){
          int n = 5; // 0101
          
        //position of the operation
          int pos = 2;
        //  step 1 - taking out the bitmask
          int bitMask = 1<<pos;
        //  step 2 - performing the NOT operation 
          int newbitMask = ~(bitMask);
        //  step 3 - performing the AND operation
          int newNumber = newbitMask & n;

          System.out.print(newNumber);


    }
}
