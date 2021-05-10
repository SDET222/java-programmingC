package saim_tasks;

public class April26tasks {
    public static void main(String[] args) {

        String str = "Apple tree";
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char eachOtherLetter = str.charAt(j);
                if (eachLetter== eachOtherLetter){
                    count++;
                }

            } if (!result.contains(""+eachLetter)){
                result+=count+" - "+eachLetter+"\n";
               // str=str.replace(""+eachLetter,"");
            }


        } System.out.println(result);






    }
}
