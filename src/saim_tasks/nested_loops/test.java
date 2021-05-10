package saim_tasks.nested_loops;

public class test {
    public static void main(String[] args) {
        String str = "AKBCCDEEFAKAA";
        String dup = "";
        String result = "";

        int count =0;

        for (int i = 0; i < str.length(); i++) {
            count= 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;

                    if (count>1) {
                        dup += str.charAt(i);
                    }

                }
            }

        }

        for(int i=0; i<dup.length(); i++){

            if (!result.contains(dup.charAt(i)+"")) {
                result+=dup.charAt(i);
            }

        }
        System.out.println(result);

    }
}
