package day32_arrays_split;
import java.util.Arrays;
public class CountusingString {
    public static void main(String[] args) {

        String cats = "bengal cat baku cat persian cat russian cat here";

        String [] arr = cats.split("cat");
        System.out.println("Length is: "+arr.length);
        System.out.print("Cat count: ");
        System.out.println(arr.length-1);

        for (String type:arr) {
            System.out.println(type);
        }




    }
}
