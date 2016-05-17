/**
 * Created by jamesyburr on 5/16/16.
 */
public class Animal {
    String name;
    String species;
    double weight;

    public Animal (String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
public String getName () {
    return name;
}
    public String setName (String newName) {
        return newName;
        }

    public String getSpecies () {
        return species;
    }

    public String setSpecies (String newSpecies) {
        return newSpecies;
    }

    public double getWeight () {
        return weight;
    }

    public double setWeight (double newWeight) {
        return newWeight;
    }

}

