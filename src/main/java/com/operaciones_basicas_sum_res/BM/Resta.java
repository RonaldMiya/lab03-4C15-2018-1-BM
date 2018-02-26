package com.operaciones_basicas_sum_res.BM;

import javax.swing.JOptionPane;

public class Resta {
	
	public static void main(String []args) {
		

		int var1, var2, res;
		
		var1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero")); 
		var2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero numero"));
		
		res = var1 - var2;
		
		JOptionPane.showMessageDialog(null, "La resta de  " + var1 + " - " + var2 + " es: "+ res);
		
		
	}

}
