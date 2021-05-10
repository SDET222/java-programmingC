package day31_arrays;

public class CharArray {
    public static void main(String[] args) {

        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};

        for (char c : letters) {
            System.out.print(c);
        }

        String sentence = new String(letters);
        System.out.print("\nSentence: " + sentence);

        String item = "Baku";
        char[] itemArrray = item.toCharArray();
        System.out.println();

        System.out.println(itemArrray.length + " length");

        String[] items = {"ipad", "laptop", "monitor", "mouse", "hdd"};
        String itemsStr = "";
        for (String s : items) {
            itemsStr += s + "-";


        }
        System.out.print(itemsStr);


        String[] languages = {"java", "python","c++", "sql","ruby", "javascript"};

       String.join("|",languages);

        System.out.println("\n"+String.join("|",languages));

        String joined = String.join("<>",languages);

        System.out.println(joined);



    }
}
