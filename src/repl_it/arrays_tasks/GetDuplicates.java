package repl_it.arrays_tasks;

public class GetDuplicates {
    public static void main(String[] args) {
        String [] a = {"1","2","aa","1","aa"};

        System.out.println(getDup(a));



    }
    public static int getDup (String[] arr) {
        //getDup(["1","2","aa"',"1", "aa"])

        int count = 0;
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            count =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j])) {
                     count++;
                }
            } if (count>1) {
                result++;
            }
        }
        return result;
    }
}
//TODO: do this task later