package office_hours.may18;

public class Earth {
    public static void main(String[] args) {



        AnimalSpecies dogs = new AnimalSpecies();

        System.out.println(dogs.getName());

        dogs.setInfo("dogs", 50, 10);

        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies();

        cats.setInfo("cats", 100, 15);

        System.out.println(cats);

        AnimalSpecies birds = cats;

        cats.setInfo("birds", 200, 20);

        System.out.println(birds);








    }
}
