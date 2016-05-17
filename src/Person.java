/**
 * Created by jamesyburr on 5/16/16.
 */
public class Person {
    static int familySize = 10;
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person [familySize];

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (isValidName (newName)) {
            name = newName;
        }
    }

    public int getAge () {
        return age;
    }

    public void setAge (int newAge) {
        age = newAge;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive (boolean newIsAlive) {
        isAlive = newIsAlive;
    }

    public boolean isValidName(String newName) {
        return newName.contains(" ");
    }
}

