package archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {

	public static void main(String[] args) {
		try {
		File archivo=new File("Prueba.txt");	
		FileWriter w=new FileWriter(archivo,true);
		BufferedWriter wr=new BufferedWriter(w);
		wr.write("Esta es la primer linea del archivo\n ");
		wr.append("Este es la segunda linea\n ");
		wr.append("Ultima linea del archivo");
		wr.close();
		if(archivo.createNewFile()) {
			System.out.println("Archivo creado con exito");
		}
		
		} catch (IOException e) {
			System.err.println("ERROR"+e);
		}

	}

}
