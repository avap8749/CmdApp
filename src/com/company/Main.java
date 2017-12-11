package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        int[] i = {1,2,3,4,4};

        List<String> l = Files.readAllLines(Paths.get("C:\\Temp\\a.txt"));

        for (String s:l)
            System.out.println(s);

        String[] s = {"aaa", "bbb", "ccc"};
        for (String str:s)
            System.out.println(str);



        try (InputStream is = new FileInputStream("C:\\Temp\\pic.jpeg");
                OutputStream os = new FileOutputStream("C:\\Temp\\pic2.jpeg");
                MyAutoClosable mac = new MyAutoClosable()) {
            int val;
            byte[] b = new byte[10];
            while ((val = is.read(b)) > 0){
                os.write(b, 0, val);
                System.out.print(b);
            }
        }
        catch (FileNotFoundException fnfe)  {
            throw  fnfe;
        }
        System.out.print("done");

        Base.print();
        Child.print();

        (new Base()).printObj();
        (new Child()).printObj();
    }
}

