package office_hours.may19;

public class Birds {

    private String species;
    private boolean canFly;
    private double beakLength;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public double getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(double beakLength) {
        this.beakLength = beakLength;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "species='" + species + '\'' +
                ", canFly=" + canFly +
                ", beakLength=" + beakLength +
                '}';
    }
}
