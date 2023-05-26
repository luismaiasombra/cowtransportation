package mainPackage;

public class Caminhao {
	
    private String tipo;
    public int vacasTransportadas = 0;
    
    public Vaca[] makeRemessa(Vaca[] vacas) {
    
    	float soma = 0;
    	Vaca[] remessa = new Vaca[40];
    	float media = 0;
    	float nextMedia = 0;
    	int tamanhoRemessa = 0;
    	int[] numeroMaximo = new int[] {40,35,30,25,20,18,16};
    	for (int i = this.vacasTransportadas;i<40;i++) {
    		nextMedia = (soma+vacas[i].peso)/(i+2);
    		if (nextMedia<200 && tamanhoRemessa+1<40) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    			
    		}
    		else if (nextMedia<250 && tamanhoRemessa+1<35) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		}
    		else if (nextMedia<300 && tamanhoRemessa+1<30) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		}
    		else if (nextMedia<360 && tamanhoRemessa+1<25) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		}
    		else if (nextMedia<400 && tamanhoRemessa+1<20) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		}
    		else if (nextMedia<460 && tamanhoRemessa+1<18) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		}
    		else if (nextMedia<500 && tamanhoRemessa+1<16) {
    			remessa[i] = vacas[i];
    			tamanhoRemessa++;
    			this.vacasTransportadas++;
    			soma+=vacas[i].peso;
    		} else {
    			break;
    		}
    		
    	}
    	return remessa;
    }
}



