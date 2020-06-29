package build;
import java.util.*;

/**
 * 
 */
public class GrupaSystemy extends Builder {

	private List<Student> studenci3 = new LinkedList<>();
    private List<Zajecia> zajecia3 = new LinkedList<>();
    private List<Wykladowca> wykladowcy3 = new LinkedList<>();
    
    public GrupaSystemy() {
    }
    
    public void setStudent(List<Student> studenci) {
        for(Student student:studenci) {
        	if(student.getGrupa().equals("GrupaSystemy") && student.getWGrupie() == false) {
        		student.setWGrupie(true);
        		studenci3.add(student);
        	}
        }
    	grupaDziekanska.createStudent(studenci3);
    }

    public void setZajecia(List<Zajecia> zajecia) {
    	Boolean istnieja[] = {false,false,false};
    	for(Zajecia zajecie:zajecia) {
    		if(zajecie.getTyp().equals("Laboratorium") && zajecie.getIstnieja()[0] == false) {
    			istnieja[0]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia3.add(zajecie);
    		}
    		
    		if(zajecie.getTyp().equals("Wyklad") && zajecie.getIstnieja()[1] == false) {
    			istnieja[1]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia3.add(zajecie);
    		}
    		
    		if(zajecie.getTyp().equals("Projekt") && zajecie.getIstnieja()[2] == false) {
    			istnieja[2]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia3.add(zajecie);
    		}
    	}
    	grupaDziekanska.createZajecia(zajecia3);
    }

    public void setWykladowcy(List<Wykladowca> wykladowcy) {
        for(Wykladowca wykladowca:wykladowcy) {
        	if(wykladowca.getLiczba()< 1) {
        		wykladowcy3.add(wykladowca);
        	}
        }
        grupaDziekanska.setWykladowcy(wykladowcy3);
    }
    

}
