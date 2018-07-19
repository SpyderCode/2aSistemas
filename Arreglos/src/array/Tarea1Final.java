package array;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tarea1Final {

	public static void main(String[] args) {
		menu();

	}

	private static void menu() {
		int[] x=new int[10];
		int[] y=new int[10];
		Random nr = new Random();
		int i, opc;
		// lenar los arreglos con numeros aleatorios
		for (i = 0; i < x.length; i++) {
			x[i] = nr.nextInt(10) + 1;
			y[i] = nr.nextInt(10) + 1;
		}//fin del for
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Suma\n2.-Multiplica\n3.-Intercala\n4.-Ordena"
					+ "\n5.-Salir","Operaciones con Arreglos", JOptionPane.INFORMATION_MESSAGE));
			
			switch(opc) {
			case 1:suma(x,y);
				break;
			case 2:restar(x,y);
				break;
			case 3:multiplicar(x,y);
				break;
			case 4:intercalar(x,y);
				break;
			case 5:System.exit(0);
				break;
			default:JOptionPane.showMessageDialog(null, "Opcion Invalida","ERROR",JOptionPane.ERROR_MESSAGE);
				break;
			}//fin del switch
			}while(opc!=5);
		
	}

	private static void intercalar(int[] x, int[] y) {
		// TODO Auto-generated method stub
		
	}

	private static void multiplicar(int[] x, int[] y) {
		// TODO Auto-generated method stub
		
	}

	private static void restar(int[] x, int[] y) {
		// TODO Auto-generated method stub
		
	}

	private static void suma(int[] x, int[] y) {
		JTextArea salida =new JTextArea();
		
		
	}

}
