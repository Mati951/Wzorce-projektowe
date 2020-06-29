package build;

import java.util.*;


class Wykladowca{
	private int id;
	private int liczbaZajec;
	private String imie;

	public Wykladowca(int id, int liczbaZajec, String imie) {
		this.id = id;
		this.liczbaZajec = liczbaZajec;
		this.imie = imie;
	
	}
	public int getId() {
		return id;
	}
	public int getLiczba() {
		return liczbaZajec;
	}
	public String getImie() {
		return imie;
	}
	public void setLiczba(int liczba) {
		this.liczbaZajec += liczba;
	}
}

class Zajecia{
	private String nazwa;
	private String typ;
	private Boolean istnieja[];
	public Zajecia(){};
	
	public Zajecia(String nazwa,String typ, Boolean istnieja[]) {
		this.nazwa =nazwa;
		this.typ = typ;
		this.istnieja = istnieja;
	}
	public String getNazwa() {
		return nazwa;
	}public String getTyp() {
		return typ;
	}

	public Boolean[] getIstnieja() {
		return istnieja;
	}

	public void setIstnieja(Boolean istnieja[]) {
		this.istnieja = istnieja;
	}
	
	
}

class Student{
	private String imie;
	private String nazwisko;
	private int index;
	private String grupa;
	private Boolean czyWGrupie;
	
	public Student(String imie, String nazwisko, int index, String grupa, Boolean czyWGrupie) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.index = index;
		this.grupa = grupa;
		this.czyWGrupie = czyWGrupie;
	}
	
	public int getIndex() {
		return index;
	}
	public String getImie() {
		return imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public String getGrupa() {
		return grupa;
	}
	public Boolean getWGrupie() {
		return czyWGrupie;
	}
	public void setWGrupie(Boolean czyWGrupie) {
		this.czyWGrupie = czyWGrupie;
	}
	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}

}

public class Main {
    public static List<Wykladowca> wykladowcy;
	public static List<Student> studenci;
	public static List<Zajecia> zajecia;

	public static void main(String[] args)

	{
	List<Wykladowca> wykladowcy = new LinkedList<>();
	wykladowcy.add(new Wykladowca(1, 5, "Piotr"));
	wykladowcy.add(new Wykladowca(2,3, "Artur"));
	wykladowcy.add(new Wykladowca(3,2, "Maciej"));
	wykladowcy.add(new Wykladowca(4, 6,"Daniel"));
	wykladowcy.add(new Wykladowca(5,4, "Pawel"));
		
		List<Student> studenci = new LinkedList<>();
		studenci.add(new Student( "Jan", "Nowacki", 80476,"GrupaGrafika", false));
		studenci.add(new Student( "Marcin", "Nowak", 84590,"GrupaGrafika", false));
		studenci.add(new Student( "Karolina", "Pijus", 87510,"GrupaSystemy", false));
		studenci.add(new Student( "Monika", "Rzadkowska", 81234,"GrupaSystemy", false));
		studenci.add(new Student( "Alicja", "Markowska", 89874,"GrupaGrafika", false));
		studenci.add(new Student( "Tomasz", "Siwak", 83642,"GrupaSystemy", false));
		studenci.add(new Student( "Mariusz", "Goleniec", 85209,"GrupaGrafika", false));
		studenci.add(new Student( "Krzysztof", "Mark", 84593,"GrupaGrafika", false));
		studenci.add(new Student( "Anna", "Wajda", 88588,"GrupaSystemy", false));
		studenci.add(new Student( "Felicja", "Maj", 87103,"GrupaSystemy", false));
		
		Boolean tab[]= {false,false,false};
		List<Zajecia> zajecia = new LinkedList<>();
		zajecia.add(new Zajecia( "Podstawy Inzynierii Programowania", "laboratorium",tab));
		zajecia.add(new Zajecia( "Podstawy Grafiki Komputerowej", "projekt",tab));
		
		Dziekan dziekan = new Dziekan();
		Builder builder = new GrupaSystemy();
		Builder builder2 = new GrupaGrafika();
		
		dziekan.setGrupaBuilder(builder);
		dziekan.build(studenci,zajecia,wykladowcy);
		GrupaDziekanska systemy = dziekan.getGrupa();

		dziekan.setGrupaBuilder(builder2);
		dziekan.build(studenci,zajecia,wykladowcy);
		GrupaDziekanska grafika = dziekan.getGrupa();

		System.out.println("\nGrupa Systemy");
		systemy.wypisz();
		System.out.println("\n\nGrupa Grafika");
		grafika.wypisz();
}
}
