package build;


import java.util.*;

/**
 * 
 */
public class Dziekan {

    private Builder builder;

    public void setGrupaBuilder(Builder builder) {
        this.builder = builder;
    }

    /**
     * 
     */
    public GrupaDziekanska getGrupa() {
        return builder.getGrupa();
    }

    /**
     * 
     */
    public void build(List<Student> studenci, List<Zajecia> zajecia, List<Wykladowca> wykladowcy) {
    	builder.newGrupa();
    	builder.setStudent(studenci);
    	builder.setZajecia(zajecia);
    	builder.setWykladowcy(wykladowcy);
    }

}