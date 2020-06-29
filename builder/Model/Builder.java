package build;


import java.util.*;


public abstract class Builder {

	protected GrupaDziekanska grupaDziekanska;
	
	
    public void newGrupa() {
        grupaDziekanska = new GrupaDziekanska();
    }

    public GrupaDziekanska getGrupa() {
        return grupaDziekanska;
    }
    
    public abstract void setStudent(List<Student> studenci);
    public abstract void setZajecia(List<Zajecia> zajecia);
    public abstract void setWykladowcy(List<Wykladowca> wykladowcy);


}