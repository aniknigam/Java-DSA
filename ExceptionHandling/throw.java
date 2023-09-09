package ExceptionHandling;

class YoungerAgeException extends RuntimeException {

    YoungerAgeException(String msg) {
        super(msg); // super is used and msg is passed in it so that it message is available to
                    // default exception handler in parent class.
    }
}

class Voting {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new YoungerAgeException("You are not eligible for voting");
                // System.out.println("hello");
                // always remember this line never run becuase after writing throw keyword
                // you cannot right anyother line
            } else {
                System.out.println("You are eligible");
            }
        } catch (YoungerAgeException e) {
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
