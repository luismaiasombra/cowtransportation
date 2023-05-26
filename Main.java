package mainPackage;
import java.util.Random;
import java.util.Scanner;

class Main{
	
    public static void main(String[] args) {
    	Random random = new Random();
    	//
        //Criando o caminhao
    	Caminhao caminhao = new Caminhao();
    	//criando as duas fazendas
    	Fazenda fazenda1 = new Fazenda();
    	Fazenda fazenda2 = new Fazenda();
    	//criação dos containers onde ficam as vacas
    	/*eu sei que poderia ter chamado de curral, mas 
   			não tive essa ideia antes
    	 */
    	fazenda1.container = new Vaca[40];
    
    	//populando a fazenda 1 com vacas
    	for (int i=0;i<40;i++) {
            //fazenda1.container[i] = new Vaca(random.nextFloat()*(500-160)+160);
            fazenda1.container[i] = new Vaca(random.nextFloat()*(500-160)+160);
        }
    	System.out.println("---------end of creation-------");
    	//criando o curral da fazenda dois
    	fazenda2.container = new Vaca[40];
    	
    	
    	//create first farm
        int contador =0;
        while (contador<40) {
        	Remessa remessa = new Remessa();
        	remessa.setContainer(new Vaca[40]);
        	remessa.setContainer(caminhao.makeRemessa(fazenda1.container));
        	fazenda2.addVacas(remessa.getContainer());
        	//////////TRANSPORTANDO VACAS///////////////////////////
        	for (int i =0;i<40;i++) {
        		if (fazenda2.container[i]!=null) {
        			fazenda1.container[i]=null;//apagamos a vaca que saiu da fazenda 1
        			System.out.printf("%.1f\n",fazenda2.container[i].peso);
        			contador++;
        		}
        	
        	}
        	//////////////////////////////////////////////////////////
        	
        	
        	System.out.printf("Quantidade transportada: %d. Peso total: %.0f kg. Peso medio:%.1f kg",remessa.getQuantidadeTransportado(),remessa.getPesoTotal(),remessa.getPesoMedio());
        	System.out.println("");
        	System.out.println("-------------------------");
        	
        }
        
        
    }
}