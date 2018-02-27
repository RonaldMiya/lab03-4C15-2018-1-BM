package com.tecsup.lab2.git.view;

import javax.swing.JOptionPane;

public class StudentReport {
	
	public static void main(String []args) {
		

		String nombre, apellido, ciclo;
		
		nombre = JOptionPane.showInputDialog("ingrese el nombre"); 
		apellido = JOptionPane.showInputDialog("ingrese el apellido");
		ciclo = JOptionPane.showInputDialog("ingrese el ciclo");
		
		
		JOptionPane.showMessageDialog(null, "Resultados:" + "/t" + nombre +
										"/t" + apellido +
										"/t" + ciclo);
		
		
	}

}
