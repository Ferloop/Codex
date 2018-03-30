//By Fer Lopez E

package modelo;

public class Cubo extends Cuadrado{
	public int volumen;
	
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumenC) {
		this.volumen = volumenC;
	}

	

	
	public int CalcularVolumen(){
		volumen=(int) Math.pow(lado, 3);
		
		return volumen;
	}
	

}
