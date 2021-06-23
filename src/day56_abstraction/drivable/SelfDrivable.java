package day56_abstraction.drivable;

public interface SelfDrivable {

 void autoPiloting();
public default void selfPark() { // only for interface!
 System.out.println("Self parking in progress...");
}


}
