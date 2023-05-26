
public class Remessa {
	Vaca[] container;
	private float pesoMedio;
	private int quantidadeTransportado = 0;
	private float pesoTotal = 0;
	public Remessa() {
		container = new Vaca[50];
		for (int i =0;i<50;i++) {
			this.container[i] = null;
		}
	}
	public void setContainer(Vaca[] vacas) {
		this.container = vacas;
	}
	public void setPesoMedio(Vaca[] vacas) {
		float soma =0;
		for (int i =0;i<vacas.length;i++) {
			soma+=vacas[i].peso;
		}
		float media =soma/vacas.length;
		this.pesoMedio=media;
	}
	public float getPesoTotal() {
		float soma = 0;
		for (int i =0;i<container.length;i++) {
			if (container[i]!=null) {
				soma+=container[i].peso;
			}
		}
		return soma;
	}
	public float getPesoMedio() {
    	return this.getPesoTotal() / (float) this.getQuantidadeTransportado();
	}
	public Vaca[] getContainer() {
		return this.container;
	}
	public int getQuantidadeTransportado() {
		quantidadeTransportado = 0;
		for (int i =0;i<container.length;i++) {
			if (container[i]!=null) {
				quantidadeTransportado++;
			}
		}
		return quantidadeTransportado;
	}
	
}
