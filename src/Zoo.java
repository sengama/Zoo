import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animale;

    public Zoo() {
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal) {
        this.animale.add(animal);
    }

    public void afiseazaAnimale() {
        for (Animal animal : animale) {
            System.out.println(animal);
        }
    }
}
