package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {

        int [] data = {22, 33, 55, 90, 105, 116, 127, 128, 259, 300};

        for (int i = 0 ; i< data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("============================================");
        for (int each:data) {
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("Last value: "+data[data.length-1]);
        System.out.println("==================PRINT BACK=======================");

            for (int j = data.length-1; j>=0; j--) {
                System.out.print(data[j]+" ");
            }




    }
}
