class Fazenda{
	int numeroVacas;
    public Vaca[] container;
    public Fazenda() {
    	this.container = new Vaca[50];
    	for (int i =0;i<50;i++) {
    		this.container[i]=null;
    	}
    }
    public void addVacas(Vaca[] remessa) {
    	for (int i =0;i<50;i++) {
    		if (remessa[i]!=null) {
    			this.container[i] = remessa[i];
    			this.numeroVacas++;
    		}
    	}
    }
    public void cleanRepeated(Fazenda fazenda) {
    	for (int i =0;i<50;i++) {
    		if (fazenda.container[i]!=null) {
    			this.container[i]=null;
    		}
    	}
    }
}