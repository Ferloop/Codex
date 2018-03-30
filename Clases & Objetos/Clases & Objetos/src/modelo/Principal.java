//By Fer Lopez E

package modelo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int op;
		do {
			op=menu();
			switch (op) {
			case 1:
				int op1;
				do {
					int ladoa;
					Cubo cubo1=new Cubo();
					ladoa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del lado del cuadrado"));
					cubo1.setLado(ladoa);
					cubo1.CalcularArea();
					
					JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cubo1.getArea());
					
					op1=JOptionPane.showConfirmDialog(null,"Desea realizar un nuevo calculo",null,JOptionPane.YES_NO_OPTION);
				} while (op1==JOptionPane.YES_OPTION);
				
				break;
				
			case 2:
				int op2;
				do {
					int ladop;
					Cubo cubo2=new Cubo();
					ladop=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del lado del cuadrado"));
					cubo2.setLado(ladop);
					cubo2.CalcularPerimetro();
					
					JOptionPane.showMessageDialog(null, "El perimetro del cuadrado es: "+cubo2.getPerimetro());
					
					op2=JOptionPane.showConfirmDialog(null,"Desea realizar un nuevo calculo",null,JOptionPane.YES_NO_OPTION);
				} while (op2==JOptionPane.YES_OPTION);
				
				
				break;
				
			case 3:
				int op3;
				do {
					int ladov;
					Cubo cubo3=new Cubo();
					ladov=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del lado del cubo"));
					cubo3.setLado(ladov);
					cubo3.CalcularVolumen();
					
					JOptionPane.showMessageDialog(null, "El volumen del cubo es: "+cubo3.getVolumen());
					
					op3=JOptionPane.showConfirmDialog(null,"Desea realizar un nuevo calculo",null,JOptionPane.YES_NO_OPTION);
				} while (op3==JOptionPane.YES_OPTION);
				
				
				break;
				
			case 4:
				int op4;
				do {
					int ladop2;
					Cubo cubo4=new Cubo();
					ladop2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la dimension del lado del cubo"));
					cubo4.setLado(ladop2);
					cubo4.CalcularPerimetro();
					
					JOptionPane.showMessageDialog(null, "El perimetro del cubo es: "+cubo4.getPerimetro());
					
					op4=JOptionPane.showConfirmDialog(null,"Desea realizar un nuevo calculo",null,JOptionPane.YES_NO_OPTION);
				} while (op4==JOptionPane.YES_OPTION);
				
				
				break;
			}
			
		} while (op!=5);

	}
	
	private static int menu(){
		String menu="";
		int op;
		menu+="1.-Calcular Area Cuadrado\n";
		menu+="2.-Calcular Perimetro Cuadrado\n";
		menu+="3.-Calcular Volumen Cubo\n";
		menu+="4.-Calcular Perimetro Cubo\n";
		menu+="5.-Salir\n";
		menu+="Seleccione una opción\n";
		do{ 
		 op=Integer.parseInt(JOptionPane.showInputDialog(menu));
		}while(op<1||op>5);
		return op;
	}

}
