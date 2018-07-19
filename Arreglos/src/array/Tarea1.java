package array;

import java.util.Random;

public class Tarea1 {

	public static void main(String[] args) {
		
		int[] arreglo1=new int[10];
		int[] arreglo2=new int[10];
		Random nr=new Random();
		
		//Da valores aleatorios a cada elemento
		for(int i=0;i<arreglo1.length;i++) {
			arreglo1[i]=nr.nextInt(10);
			arreglo2[i]=nr.nextInt(10);
		}
		//imprime los arreglos originales
		System.out.println("Arreglos Originales");
		for(int i=0;i<arreglo1.length;i++)
			System.out.print(arreglo1[i]+"\t");
		System.out.println("\n");
		for(int i=0;i<arreglo1.length;i++)
			System.out.print(arreglo2[i]+"\t");
		
		//Aqui pasa las llamadas
		System.out.println("\n\n");
		sumar(arreglo1, arreglo2);
		restar(arreglo1, arreglo2);
		multiplicar(arreglo1, arreglo2);
		intercalar(arreglo1, arreglo2);

	}

	
	private static void intercalar(int[] arr1,int[] arr2) {
		System.out.println("\nIntercalar\n");
		int[] inter=new int[20];
		for(int i=0,x=1,y=0;i<arr1.length;i++,x+=2,y+=2) {
			inter[y]=arr1[i];
			inter[x]=arr2[i];
		}
		for(int i=0;i<inter.length;i++)
			System.out.print(inter[i]+"\t");	
	}

	private static void multiplicar(int[] arr1,int[] arr2) {
		System.out.println("\nMultiplicar\n");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]*arr2[i]+"\t");
		
	}

	private static void restar(int[] arr1,int[] arr2) {
		System.out.println("\nRestar\n");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]-arr2[i]+"\t");
		
	}

	private static void sumar(int[] arr1,int[] arr2) {
		System.out.println("\nSumar\n");
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i]+arr2[i]+"\t");
		
	}

}
