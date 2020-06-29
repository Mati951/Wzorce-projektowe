package decorator;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<InterafaceWniosek> interfacew = new ArrayList<>();

    private void zlozWniosek() {
    	interfacew.forEach(InterafaceWniosek::zloz);
    }

    private void dodajWniosek(InterafaceWniosek interfaceww) {
        this.interfacew.add(interfaceww);
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.dodajWniosek(new zZalacznikiem(new Wniosek()));
        student.dodajWniosek(new zZalacznikiem(new zZaplata(new Wniosek())));
        student.zlozWniosek();

    }
}
