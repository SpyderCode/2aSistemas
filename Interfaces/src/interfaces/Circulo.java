package interfaces;

import javax.swing.JOptionPane;

public class Circulo implements Figuras {
	private double radio;
	private double area;
	private double perimetro;

	// Metodos Gets
	public double getRadio() {
		return radio;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}

	// Metodos Sets
	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public void area() {
		setRadio(Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor del radio")));
		JOptionPane.showMessageDialog(null, Math.PI * Math.pow(radio, 2));
	}

	public void perimetro() {
		setRadio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio")));
		JOptionPane.showMessageDialog(null, 2 * Math.PI * radio);
	}

}
