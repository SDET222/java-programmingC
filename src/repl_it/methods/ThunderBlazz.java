package repl_it.methods;

public class ThunderBlazz {
    public static void main(String[] args) {
/**There are a few ways to get this galacticly popular drink, if its available at the
 *  store you can buy it. or you can get it as a gift. The third option is to mix its
 *  ingredients (its a secret formula):

 1 from ingredient1 ,2 from ingredient2 and 3 from ingredient3.

 or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.

 You need to have exact amount of ingredients for making the drink. not less or more */
        System.out.println(getThunderBlazz(true,false,1,2,3));
        System.out.println(getThunderBlazz(false,false,1,2,3));
        System.out.println(getThunderBlazz(false,false,1,5,3));


    }

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3) {

        if (available || gift || (ingredient1==1 && ingredient2==2 && ingredient3==3) ||
                (ingredient1==3 && ingredient2==1 && ingredient3==2)) {
            return true;
        } else {
            return false;
        }

    }

}
