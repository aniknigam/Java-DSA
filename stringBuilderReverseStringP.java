//wap to reverse the stringbuilder

public class stringBuilderReverseStringP {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Aniket Nigam");

        //method 1 

        // for (int i = name.length() -1  ; i >= 0; i--) {
        //     System.out.print(name.charAt(i));
        // }

        //method 2


        // the loop will move till the half of the string and the other half of the string will automatically be  replaced
        for(int i = 0; i< name.length()/2 ; i++){
            

            //we are taking out the index of the each character
            
            //we are taking out the index of the first half
            int front = i;
            // this will take out the index of the  last half of the string
            int back = name.length() - i - 1;

            //here we are taking out each character by charAt method
            char frontchar = name.charAt(front);
            char backchar = name.charAt(back);

            //here wer are replacing the characters with the setCharAt method

            //front is the index and backchar are the values that will be set
            name.setCharAt(front, backchar);    

            //back is the index and frontchar are the values that will be set
            name.setCharAt(back,frontchar);
        }
        System.out.println(name);
    }
}
