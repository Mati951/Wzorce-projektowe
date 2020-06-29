package Strategy;

public class Egzamin {

    private EgzaminStrategy egzaminStrategy;
    private Integer termin;

    void ustawEgzaminStrategy(EgzaminStrategy egzaminStrategy) {
        this.egzaminStrategy = egzaminStrategy;
    }

    public void ustawTermin(Integer termin) {
        this.termin = termin;
    }

    public void przeprowadzEgzamin() {
        System.out.print("Termin " + termin + ": ");
        egzaminStrategy.przeprowadzEgzamin();
    }
}
