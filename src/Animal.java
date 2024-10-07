import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public boolean CanWalk() {
        return false;
    }
    public boolean CanSwin() {
        return false;
    }

}
public class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }

    public boolean CanWalk() {
        return true;
    }
}
public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    public boolean CanWalk() {
        return true;
    }

    public boolean CanSwin() {
        return true;
    }
}
public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    public boolean CanSwin() {
        return true;
    }
}

public class Farm {
    private List<Animal> animals;

    public Farm() {
        animals = new ArrayList<>();
    }

    public void Add(Animal animal) {
        animals.add(animal);
    }

    public void printCanSwinandCanWalk() {
        List<Animal> animalCanSwinAndWalk = new ArrayList<>();
        for (Animal animal : animals) {
            if(animal.CanSwin() || animal.CanWalk() ) {
                animalCanSwinAndWalk.add(animal);
            }
        }
        for(Animal animal : animalCanSwinAndWalk) {
            System.out.println(animal.name + " can swim: " + animal.CanSwin() + ", can walk: " + animal.CanWalk());
        }
    }
}
