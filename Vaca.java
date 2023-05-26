package mainPackage;


public class Vaca  {
	public int numeroVacas = 0;
	public int startingPoint = 0;
    public boolean isParida = false;
    public float peso;
    public Vaca(float peso){
        this.peso = peso;
        		this.startingPoint = 0;
    }
    public float getPeso() {
        return this.peso;
    }
}