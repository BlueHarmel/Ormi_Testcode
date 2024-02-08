package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
//        String filePath = System.getProperty("user.dir") + "\\java-project\\src\\Exception\\test.txt";
//        String filePath = "./java-project/src/Exception/test.txt";
        String filePath = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("예외처리로직");
            e.printStackTrace();
        }
    }
}