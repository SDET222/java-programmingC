package repl_it.methods;

public class SimpleRoomBook {
    public static void main(String[] args) {

/**the room is already booked between 7/1/2018 - 7/8/2018 and not available
 accepting bookings only for year of 2018 */
        System.out.println(simpleRoomBook(true,2,1,2018));
        System.out.println(simpleRoomBook(true,7,2,2018));

    }

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year) {
         boolean res = false;
        if (month==7 && day>=1 && day<=8 && year==2018) {
            return false;
        }
        if (isAvailable && (month>=1 && day>=1 && day<=31 && year==2018)) {

            return true;
        }  return res;
    }

}
