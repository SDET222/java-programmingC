package day28_loops;

public class JavaCity {
    public static void main(String[] args) {


        String city = "JavaCity";
        int totalCases=0;

        for (int day=1; day <=30; day++) {
            if(day%7==0) {
                totalCases+=500;
            }else {
                totalCases+=200;
            }
            System.out.println("day - "+day+ " total cases: "+totalCases);
        }
        System.out.println("JavaCity November 2021 Total cases: "+totalCases);








    }
}
