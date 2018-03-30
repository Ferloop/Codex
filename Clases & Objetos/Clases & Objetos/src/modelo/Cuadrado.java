//By Fer Lopez E

package modelo;

import javax.swing.JOptionPane;

public class Cuadrado{
	public int area;
	public int perimetro;
	public int lado;

	public int getArea() {
		return area;
	}


	public void setArea(int areaC) {
		this.area = areaC;
	}


	public int getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(int perimetroC) {
		this.perimetro = perimetroC;
	}

	

	public int getLado() {
		return lado;
	}


	public void setLado(int ladoC) {
		this.lado = ladoC;
	}

	

	public int CalcularArea(){
		area=lado*lado;
		
		return area;
	}

	
	public int CalcularPerimetro(){
		perimetro=4*lado;
		
		return perimetro;
	}
	
	
	
	
	
	
}
