package office_hours.may19;

public class MyBackYards {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();

        birdOne.setSpecies("eagle");
        birdOne.setCanFly(true);
        System.out.println(birdOne);

        System.out.println(birdTwo.canFly());
        birdTwo.setBeakLength(5);

        System.out.println(birdTwo.getBeakLength());





    }
}
