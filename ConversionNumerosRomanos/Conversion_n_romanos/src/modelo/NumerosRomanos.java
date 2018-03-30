package modelo;

import javax.swing.JOptionPane;

public class NumerosRomanos {

	public static void main(String[] args) {
		      int num;
		      int op;
		      do{
		    	  do {
		    		  num=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entero Rango( 1 al 1000)"));
		    		  
			      } while (num < 1 || num > 1000);
		    	    JOptionPane.showMessageDialog(null, "El numero "+ num +" convertido a numero romano es: "+ ConvertirRomanos(num));
		    	  
			      op=JOptionPane.showConfirmDialog(null,"Desea realizar una nueva conversion ",null,JOptionPane.YES_NO_OPTION);
		      }while(op==JOptionPane.YES_OPTION);
		    	  
		      }
		      
		     
		      
			  
		  public static String ConvertirRomanos(int n) {
		      int i, u,d,c,um ;
		      String numRom = "";
		      um = n / 1000;
		      c = n / 100 % 10;
		      d = n / 10 % 10;
		      u = n % 10;
		      
		      // UM
		      for (i = 1; i <= um; i++) {
		    	  numRom = numRom + "M";
		      }
              
		      //C
		      if (c == 9) {
		    	  numRom = numRom + "CM";
		      } else if (c >= 5) {
		    	  numRom = numRom + "D";
                  for (i = 6; i <= c; i++) {
                         numRom = numRom + "C";
                  }
		      } else if (c == 4) {
		                      numRom = numRom + "CD";
		      } else {
		    	  for (i = 1; i <= c; i++) {
                      numRom = numRom + "C";
                   }        
		      }

              
		      if (d == 9) {
		           numRom = numRom + "XC";
		      } else if (d >= 5) {
		                      numRom = numRom + "L";
		                      for (i = 6; i <= d; i++) {
		                            numRom = numRom + "X";
		                      }
		      } else if (d == 4) {
		                      numRom = numRom + "XL";
		      } else {
		                    for (i = 1; i <= d; i++) {
		                           numRom = numRom + "X";
		                    }
		      }

		      
		      if (u == 9) {
		           numRom = numRom + "IX";
		      } else if (u >= 5) {
		    	  numRom = numRom + "V";
                  for (i = 6; i <= u; i++) {
                         numRom = numRom + "I";
                  }
		      } else if (u == 4) {
		    	  numRom = numRom + "IV";
		      } else {
		    	  for (i = 1; i <= u; i++) {
                      numRom = numRom + "I";
               }        
		      }
		      return numRom;
		     }	
}

