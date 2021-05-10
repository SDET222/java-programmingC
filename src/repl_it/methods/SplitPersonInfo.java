package repl_it.methods;
import java.util.*;
public class SplitPersonInfo {
    public static void main(String[] args) {
person("Jon,Mack,90");
    }
    public static void person (String info) {

   String[] arr= info.split(",");
        System.out.println("person name: "+arr[0]);
        System.out.println("last name: "+arr[1]);
        System.out.println("age: "+arr[2]);

    }
}
