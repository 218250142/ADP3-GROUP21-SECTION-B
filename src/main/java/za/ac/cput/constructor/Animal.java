package za.ac.cput.constructor;

public class Animal {
    /**
     *
     */

    private String species;

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" + "species=" + species + '}';
    }
}