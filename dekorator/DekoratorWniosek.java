package decorator;

	abstract class DekoratorWniosek implements InterfaceWniosek {

	    private InterfaceWniosek interfaceww;

	    DekoratorWniosek(InterfaceWniosek interfaceww) {
	        this.interfaceww = interfaceww;
	    }

	    @Override
	    public void zloz() {
	    	interfaceww.zloz();
	    }
	}

