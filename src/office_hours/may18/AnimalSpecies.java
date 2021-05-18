package office_hours.may18;

public class AnimalSpecies {

    String name;
    int population;
    int growthRate;

    public void setInfo(String setName, int setPopulation, int setGrowthRate) {
        name = setName;
        population = setPopulation;
        growthRate = setGrowthRate;

    }
    public String getName () {

        if (name==null)
            name= "No name defined";
        return name;
    }
    public int getPopulation () {
        return population;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population = " + population + " million"+
                ", growthRate = " + growthRate + " %"+
                '}';
    }

    public int getGrowthRate() {
        return growthRate;
    }

}
