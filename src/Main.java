public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elefant elefant = new Elefant("Elefantul Dumbrava", 10, "frunze, fructe, iarbă");
        Lup lup = new Lup("Lupul Lupoaică", 5, "carne");
        Leu leu = new Leu("Leul Simba", 12, "carne");
        Jaguar jaguar = new Jaguar("Jaguarul Jaguar", 7, "carne");
        Zebra zebra = new Zebra("Zebra Zebra", 4, "ierburi");

        zoo.adaugaAnimal(elefant);
        zoo.adaugaAnimal(lup);
        zoo.adaugaAnimal(leu);
        zoo.adaugaAnimal(jaguar);
        zoo.adaugaAnimal(zebra);

        zoo.afiseazaAnimale();
    }
}
