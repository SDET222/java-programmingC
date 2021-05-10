package day27_loops;

public class IndexOf {
    public static void main(String[] args) {


        String word = "githubg";
        char letter = 'g';
        int index = -1;

        for (int i = 0; i <word.length(); i++) {

            if (word.charAt(i)==(letter)) {
                index=i;
                System.out.println(letter+" is found at index "+index);
                //break;
            }


            } if (index==-1) {
            System.out.println("not found");
        }







        }
    }

