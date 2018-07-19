package archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerDatos {

	public static void main(String[] args) {
		String tmp="",bre="";
		try {
			FileReader f=new FileReader("Prueba.txt");
			BufferedReader br=new BufferedReader(f);
			while((bre=br.readLine())!=null) {
				tmp+=bre+"\n";
			}
			System.out.println(tmp);
		} catch (IOException e) {
			System.err.println("ERROR"+e);
		}

	}

}
