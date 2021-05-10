package saim_tasks.beforeTasks;

public class CybertekClasses {
    public static void main(String[] args) {


//        In Cybertek we have three batch types: US morning, US evening, EU.
//                Depending on a batch type (String) print information about the batch.
//
//        First figure out is is a US batch or EU batch
//
//                - for US batches:
//
//        > Figure out is it a morning batch or evening batch
//            > morning - print: Class times are 10-5 EST. M, T, Th, F.
//                > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S
//
//                - for EU batches:
//
//        > print: Class times are  10-5 EST. M, T, W, Th, F.


            String batchType = "US";
            String batchTime ="morni";

            if (batchType.equals("US")) {
                if (batchTime.equals("morning")) {
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.1");
                } else if (batchTime.equals("evening")) {
                    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S 2");
                } else {
                    System.out.println("Invalid time");
                }
            } else {
                if (batchType.equals("EU")) {
                    System.out.println("Class times are  10-5 EST. M, T, W, Th, F. 3");
                } else {
                    System.out.println("Invalid region");
                }
            }






    }

}
