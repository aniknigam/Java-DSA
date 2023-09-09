package ExceptionHandling;

import java.io.*;

class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("d:/xyc.txt");
    }
}

class Check {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
