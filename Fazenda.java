package mainPackage;
class Fazenda{
	int numeroVacas;
    public Vaca[] container;
    public Fazenda() {
    	
    }
    public void addVacas(Vaca[] remessa) {
    	for (int i =0;i<40;i++) {
    		if (remessa[i]!=null) {
    			this.container[numeroVacas] = remessa[i];
    			this.numeroVacas++;
    		}
    	}
    }
}