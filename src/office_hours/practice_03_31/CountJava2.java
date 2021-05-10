package office_hours.practice_03_31;

public class CountJava2 {
    public static void main(String[] args) {


        String str = "java is fun. java class today, javascript";
        int count = 0;

        while (str.contains("java")) {
            count++;
            str=str.replaceFirst("java","");

        }
        System.out.println(count);





    }
}
