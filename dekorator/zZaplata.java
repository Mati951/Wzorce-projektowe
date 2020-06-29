package decorator;

	public class zZaplata extends DekoratorWniosek {

		zZaplata(InterfaceWniosek interfaceww) {
	        super(interfaceww);
	    }

	    @Override
	    public void zloz() {
	        super.zloz();
	        System.out.println("Z zaplata");
	    }

	}
