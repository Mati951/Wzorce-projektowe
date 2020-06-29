package build;

import java.util.*;


public class GrupaDziekanska {

    private List<Student> studenci = new LinkedList<>();
    private List<Zajecia> zajecia = new LinkedList<>();
    private List<Wykladowca> wykladowcy = new LinkedList<>();
    
    public void createStudent(List<Student> studenci) {
    	this.studenci = studenci;
    }
    public void createZajecia(List<Zajecia> zajecia) {
    	this.zajecia = zajecia;
    }
    
    public void setWykladowcy(List<Wykladowca> wykladowcy) {
    	this.wykladowcy = wykladowcy;
    }
    
    public void wypisz() {
		System.out.println("Wykladowcy:  ");

		for (Wykladowca wykladowca : wykladowcy) {
			System.out.print(wykladowca.getImie());
			System.out.print(" ");
			System.out.print(wykladowca.getLiczba());

		}

		System.out.println("Studenci: ");
		for (Student student : studenci) {

			System.out.print(student.getImie());
			System.out.print(" ");
			System.out.print(student.getNazwisko());
			System.out.print(" ");
			System.out.println(student.getGrupa());
			System.out.print(" ");
			System.out.println(student.getIndex());
		}
		
		System.out.println("Zajecia: ");
		for (Zajecia zajeci : zajecia) {

			System.out.print(zajeci.getNazwa());
			System.out.print(" ");
			System.out.print(zajeci.getTyp());
		}
    }		
    
    public GrupaDziekanska() {
    }

}