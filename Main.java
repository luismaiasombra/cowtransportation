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
    	
    
    	//populando a fazenda 1 com vacas
    	for (int i=0;i<50;i++) {
            //fazenda1.container[i] = new Vaca(random.nextFloat()*(500-160)+160);
            fazenda1.container[i] = new Vaca(random.nextFloat()*(500-400)+400);
        }
    	int contador = 0;
    	
    	
    	
    	//create first farm
      
        Remessa remessa = new Remessa();
       
        while (contador<50) {
        	//vamos reunir as vacas umas perto das outras
        	Vaca[] vacas = caminhao.makeRemessa(fazenda1.container);
        	fazenda1.cleanRepeated(fazenda2);
        	fazenda2.addVacas(vacas);
        	
        	//////////TRANSPORTANDO VACAS///////////////////////////
        	for (int i =contador;i<50;i++) {
        		if (fazenda2.container[i]!=null) {
        			System.out.println(fazenda2.container[i].peso);
        			contador++;
        		}
        	}
        	remessa.container = vacas;
        	//////////////////////////////////////////////////////////
        	
        	
        	System.out.printf("Quantidade transportada: %d. Peso total: %.0f kg. Peso medio:%.1f kg",remessa.getQuantidadeTransportado(),remessa.getPesoTotal(),remessa.getPesoMedio());
        	System.out.println("");
        	System.out.println("-------------------------");
        	
        }
        
        System.out.println("Foram feitas "+caminhao.viagens+" viagens");
        
    }
    
}