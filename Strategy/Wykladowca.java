package Strategy;

public class Wykladowca {

    private void przeprowadzEgzaminn() {
        Egzamin egzamin = new Egzamin();
        egzamin.ustawTermin(1);
        egzamin.ustawEgzaminStrategy(new wFormiePytanOtwartych());
        egzamin.przeprowadzEgzamin();

        egzamin.ustawTermin(2);
        egzamin.ustawEgzaminStrategy(new wFormieTestu());
        egzamin.przeprowadzEgzamin();
    }

    public static void main(String[] args) {
        Wykladowca wykladowca = new Wykladowca();
        wykladowca.przeprowadzEgzaminn();
    }

}
