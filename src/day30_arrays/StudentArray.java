package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = {"007", "James", "Bond", "B-22", "917-917-9999"};

        System.out.println("Student1 ID: " + student1[0]);
        System.out.println("Student1 First Name: " + student1[1]);
        System.out.println("Student1 Last Name: " + student1[2]);
        System.out.println("Student1 Batch #: " + student1[3]);
        System.out.println("Student1 Phone #: " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: student1 data array has correct length");
        } else {
            System.out.println("FAIL: student1 data array has incorrect length");
        }

        System.out.println("==========STUDENT 2 DATA=========");

        String[] student2 = {"008", "Joe", "Brick", "B-22", "918-917-9999"};

        System.out.println("Student1 ID: " + student2[0]);
        System.out.println("Student1 First Name: " + student2[1]);
        System.out.println("Student1 Last Name: " + student2[2]);
        System.out.println("Student1 Batch #: " + student2[3]);
        System.out.println("Student1 Phone #: " + student2[4]);

        System.out.println("student data length: " + student2.length);
        System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");

        if (student2.length == student1.length) {
            System.out.println("PASS: matching");
        } else {
            System.out.println("FAIL: doesn't match");
        }

        System.out.println((student1[1]+" "+student1[2]).toUpperCase());


        String mobNumber= student1[4];
        System.out.println("mobNumber = " + mobNumber);



    }
}
