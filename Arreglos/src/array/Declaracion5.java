package array;

public class Declaracion5 {

	public static void main(String[] args) {
		int [] numeros=new int[20];
		for(int i=0;i<numeros.length;i++)
			numeros[i]=i;
		for(int i=0;i<numeros.length;i+=2)
			System.out.println(numeros[i]);

	}

}
