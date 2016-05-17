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
    public void setName (String newName) {
        name = newName;
        }

    public String getSpecies () {
        return species;
    }

    public void setSpecies (String newSpecies) {
        species = newSpecies;
    }

    public double getWeight () {
        return weight;
    }

    public void setNewWeight (double newWeight) {
        if (newWeight < 100)
            weight = newWeight;
    }

}

