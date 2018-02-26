package com.operaciones_basicas_sum_res.BM;

import javax.swing.JOptionPane;

public class Suma {
	
	public static void main(String []args) {
	

		int var1, var2, sum;
		
		var1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero")); 
		var2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero numero"));
		
		sum = var1 + var2;
		
		JOptionPane.showMessageDialog(null, "La suma de  " + var1 + " + " + var2 + " es: "+ sum);
		
		
	}

}
