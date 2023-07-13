//Wap to get the pit at postion 3 of a number n = 0101

public class getBit {  

    public static void main(String[] args){
        int n = 5; //0101
        int pos = 3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0){
            System.out.print("bit was zero");
        } else{
            System.out.print("bit was one");
        }
    }
}
