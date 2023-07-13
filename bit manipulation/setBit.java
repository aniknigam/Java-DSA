// WAP to set the bit to position 1 of a number 0101

public class setBit {
    public static void main(String[] args){
        int n = 5; // 0101
        
        //this is the position
        int pos = 1;
        
        //we are taking out the bitmask by left shifting
        int bitmask = 1<<pos;

        //performing the OR operation
        int setBit = bitmask | n;
        System.out.print(setBit);

    }
}
