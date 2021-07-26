package Interview;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileReader_From_txt {
    public static void main(String[] args) throws IOException {

        List<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(5);
        n.add(7);
        n.add(9);

        FileReader file1 = new FileReader("src/Interview/file1.txt");
        BufferedReader read = new BufferedReader(file1);

        //System.out.println(read.readLine());

        Scanner scan = new Scanner(file1); //new FileReader("src/Interview/file1.txt")

        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }

        System.out.println("=================================");











    }
}
