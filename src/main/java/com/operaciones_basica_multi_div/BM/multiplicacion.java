package com.operaciones_basica_multi_div.BM;

import javax.swing.JOptionPane;

public class multiplicacion {
	

	 public static void main( String[] args )
	    {
	       int var1, var2, multi;
	       
	       var1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
	       var2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
	       
	       multi = var1 * var2;
	       
	       JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multi);
	       
	    }
}
