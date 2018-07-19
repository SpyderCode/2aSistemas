package archivos;

import java.io.File;
import java.io.IOException;

public class Operaciones {

	public static void main(String[] args) {
		File archivo=new File("ejemplo.txt");
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				System.out.println("Archivo creado");
				e.printStackTrace();
			}
		}//fin del if
		System.out.println("Nombre del Archivo: "+archivo.getName());
		System.out.println("Attributo de lectura: "+archivo.canRead());
		System.out.println("Atributo de escritura: "+archivo.canWrite());
		System.out.println("Atributo de ejecucuion: "+archivo.canExecute());
		System.out.println("Tamaño del archivo: "+archivo.length());
		System.out.println("Es directorio: " +archivo.isDirectory());
		System.out.println("Es fichero: "+archivo.isFile());
	
	}

}
