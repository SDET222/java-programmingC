package day61_exceptions_collections.checked_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {

        String filePath = "src/day61_exceptions_collections/checked_exceptions/data.txt";

        List<String> data =Files.readAllLines(Paths.get(filePath));
        System.out.println(data);

        for (String line:data){
            System.out.println(line);
        }

        try {
            int[] nums = {2,4,5};
            System.out.println(nums[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("<><><><><><><><><><><><><><>");
    }
}
