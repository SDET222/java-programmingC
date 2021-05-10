package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main (String [] args) {
        int selection = 5;
        String result="";
        System.out.println("Choose your language");
        if (selection==1) {
            result="Hello, thank you for your call";
        } else if (selection==2) {
            result="Hola, gracias para llamar";
        } else if (selection==3) {
            result="Merhaba, aradiginiz uchun teshekkurler";
        } else if (selection==4) {
            result="Privet! Spasibo za zvonok";
            } else if (selection==5) {
            result="Salam! Zenginiz uchun sagolun";
        } else {
            result="Lets talk JAVA";
        }
        System.out.println(result);






    }



}
