package com.operaciones_basica_multi_div.BM;

import javax.swing.JOptionPane;

public class division {

	 public static void main( String[] args )
	    {
	       int var1, var2, divi;
	       
	       var1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
	       var2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
	       
	       divi = var1/var2;
	       
	       JOptionPane.showMessageDialog(null, "La division es: " + divi);
	    }
}
