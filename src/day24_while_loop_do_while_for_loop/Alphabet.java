package day24_while_loop_do_while_for_loop;

public class Alphabet {
    public static void main(String[] args) throws InterruptedException {

        char letter = 'a';
        System.out.println("letter = " + letter);
        //letter++;
        System.out.println(letter);

        while (letter<='z') {
            System.out.print(letter++ + ", ");
            Thread.sleep(200);
        }
        System.out.println();
        letter='z';
        while (letter >= 'a') {
            System.out.print(letter-- + ", ");
            Thread.sleep(200);
        }

    }
}
