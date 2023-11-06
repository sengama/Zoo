public class Animal {

    private String nume;
    private int varsta;
    private String alimente;

    public Animal(String nume, int varsta, String alimente) {
        this.nume = nume;
        this.varsta = varsta;
        this.alimente = alimente;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getAlimente() {
        return alimente;
    }

    public void setAlimente(String alimente) {
        this.alimente = alimente;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", alimente='" + alimente + '\'' +
                '}';
    }
}
