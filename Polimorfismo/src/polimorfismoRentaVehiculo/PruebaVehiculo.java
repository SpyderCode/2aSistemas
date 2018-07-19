package polimorfismoRentaVehiculo;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaVehiculo {
	
	public static ArrayList<Vehiculo> integrantes=new ArrayList<Vehiculo>();

	public static void main(String[] args) {
		
		JTextArea Auto=new JTextArea();
		JTextArea Bus=new JTextArea();
		JTextArea Bike=new JTextArea();
		JTextArea moto=new JTextArea();
		
		String linea="\n_______________________________________________________\n";
		
		String Autos="Id\tMarca\tModelo\tColor\tTipo\t"
				+ "Precio\tNVelocidades\tNAsientos\t"
				+ "T Frenos\tAño\tcilindros\tNPuertas\tRendimiento"+linea;
		String camiones="Id\tMarca\tModelo\tColor\tTipo\t"
				+ "Precio\tNVelocidades\tNAsientos\t"
				+ "T Frenos\tAño\tVentilacion"+linea;
		String bicicletas="Id\tMarca\tModelo\tColor\tTipo\t"
				+ "Precio\tNVelocidades\tNAsientos\t"
				+ "T Frenos\tAño\tMaterial"+linea;
		String motocicletas="Id\tMarca\tModelo\tColor\tTipo\t"
				+ "Precio\tNVelocidades\tNAsientos\t"
				+ "T Frenos\tAño\tCC"+linea;
		
		//POLIMORFISMO
		Vehiculo minivan=new Automovil(321, "Honda", "Hippie", "Arcoiris", "Van", 25000, 5, 15, "ABS", 1987, 6, 3, "Bajo");
		Vehiculo sedan=new Automovil(231, "Yamaha", "A-213", "Azul","Hachback", 213.21, 23, 7, "ABS", 2007, 6, 3, "Alto");
		Vehiculo maruti=new Automovil(155, "Suziki", "Sedan", "Cafe", "4x4", 123343, 3, 5, "ABS", 2018, 4, 4, "Alto");
		Vehiculo ITZ=new Camion(7623, "Honda", "express", "Blanco", "Estudiantil", 250000, 10, 30, "ABS", 1960, 2);
		Vehiculo Uaz=new Camion(7623, "Suzuki", "Lo encontraron", "azul", "Estudiantil", 250000, 10, 30, "ABS", 1960, 2);
		Vehiculo UNAM=new Camion(7623, "Yamaha", "express", "Blanco y azul", "Estudiantil", 250000, 14, 30, "ABS", 1960, 2);
		Vehiculo montaña=new Bicicleta(874, "sepa", "Montaña", "Amarillo", "Montaña", 5000, 15, 1, "Pedales", 1000, "Madera");
		Vehiculo velocidad=new Bicicleta(8724, "sepa", "Velocidad", "Azul", "Velocidad", 9000, 23, 1, "Normales", 1000, "Titanio");
		Vehiculo estilo=new Bicicleta(1233, "sepa", "Montaña", "Negro", "Montaña", 5000, 15, 1, "sepa", 1000, "Oxigeno");
		Vehiculo MotoGx=new Motocicleta(4124, "Suzuki", "Ah-321", "Verde", "Deportiva", 60000, 5, 2, "ABS", 2018, 250);
		Vehiculo Honda=new Motocicleta(745, "Honda", "Cargo", "Rojo", "Carga", 21000, 5, 2, "Apenas", 2018, 150);
		Vehiculo Teraceria=new Motocicleta(86574, "Suzuki", "Ah-321", "Verde", "Deportiva", 60000, 5, 2, "ABS", 2018, 150);
		
		
		integrantes.add(minivan);
		integrantes.add(sedan);
		integrantes.add(maruti);
		integrantes.add(ITZ);
		integrantes.add(Uaz);
		integrantes.add(UNAM);
		integrantes.add(montaña);
		integrantes.add(velocidad);
		integrantes.add(estilo);
		integrantes.add(MotoGx);
		integrantes.add(Honda);
		integrantes.add(Teraceria);
		
		for(Vehiculo x:integrantes) {
			if(x instanceof Automovil) {
				Autos+=x;
			}
			else if(x instanceof Camion) {
				camiones+=x;
			}
			else if(x instanceof Bicicleta) {
				bicicletas+=x;
			}
			else
				motocicletas+=x;
		}
		Auto.setText(Autos);
		Bus.setText(camiones);
		Bike.setText(bicicletas);
		moto.setText(motocicletas);
		
		JOptionPane.showMessageDialog(null, Auto);
		JOptionPane.showMessageDialog(null, Bus);
		JOptionPane.showMessageDialog(null, Bike);
		JOptionPane.showMessageDialog(null, moto);
	}

}
