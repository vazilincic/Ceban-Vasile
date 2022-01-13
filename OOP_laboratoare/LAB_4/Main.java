package ex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws Exception {
        String content = new String(Files.readAllBytes(Paths.get("File2.txt")));

        System.out.println(content);

        char[] chars = content.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') counter++;
            if (chars[i] == ')') counter--;
        }
        if (counter == 0)

            System.out.println("Expresion is correct");
        else if (counter < 0) {
            System.out.println("That expresion is not correct");
            System.out.println("Too much closed parenthesis=" + abs(counter));}
        else{
            System.out.println("That expresion is not correct");
            System.out.println("Too much opened parenthesis=" + counter);
        }

    }
}