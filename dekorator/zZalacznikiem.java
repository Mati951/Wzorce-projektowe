package decorator;

	class zZalacznikiem extends DekoratorWniosek {

		zZalacznikiem(InterfaceWniosek interfaceww) {
	        super(interfaceww);
	    }

	    @Override
	    public void zloz() {
	        super.zloz();
	        System.out.println("Z zalacznikiem");
	    }
	}
