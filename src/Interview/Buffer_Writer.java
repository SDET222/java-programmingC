package Interview;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer {
    public static void main(String[] args) throws Exception {

        FileWriter file2 = new FileWriter("src/Interview/file2.txt");


        BufferedWriter writer = new BufferedWriter(file2);
        writer.write("Buffered writer");
        writer.write("\nnew");
        writer.write("\n");
        writer.write("\nnew 2");
        writer.write("\nnew 3");

        writer.close();





    }
}
