package build;

import java.util.*;

/**
 * 
 */
public class GrupaGrafika extends Builder {

	private List<Student> studenci2 = new LinkedList<>();
    private List<Zajecia> zajecia2 = new LinkedList<>();
    private List<Wykladowca> wykladowcy2 = new LinkedList<>();
	
    
    public GrupaGrafika() {
    }
    
    public void setStudent(List<Student> studenci) {
        for(Student student:studenci) {
        	if(student.getGrupa().equals("GrupaGrafika") && student.getWGrupie() == false) {
        		student.setWGrupie(true);
        		studenci2.add(student);
        	}
        }
    	grupaDziekanska.createStudent(studenci2);
    }

    public void setZajecia(List<Zajecia> zajecia) {
    	Boolean istnieja[] = {false,false,false};
    	for(Zajecia zajecie:zajecia) {
    		if(zajecie.getTyp().equals("Laboratorium") && zajecie.getIstnieja()[0] == false) {
    			istnieja[0]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia2.add(zajecie);
    		}
    		
    		if(zajecie.getTyp().equals("Wyklad") && zajecie.getIstnieja()[1] == false) {
    			istnieja[1]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia2.add(zajecie);
    		}
    		
    		if(zajecie.getTyp().equals("Projekt") && zajecie.getIstnieja()[2] == false) {
    			istnieja[2]=true;
    			zajecie.setIstnieja(istnieja);
    			zajecia2.add(zajecie);
    		}
    	}
    	grupaDziekanska.createZajecia(zajecia2);
    }

    public void setWykladowcy(List<Wykladowca> wykladowcy) {
        for(Wykladowca wykladowca:wykladowcy) {
        	if(wykladowca.getLiczba()< 1) {
        		wykladowcy2.add(wykladowca);
        	}
        }
        grupaDziekanska.setWykladowcy(wykladowcy2);
    }


}