import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaMascota {
	public static ArrayList<Mascota> integrantes=new ArrayList<Mascota>();

	public static void main(String[] args) {
		
		JTextArea PezSalado=new JTextArea();
		JTextArea PezDulce=new JTextArea();
		String linea="\n________________________________________________\n";
		
		String salado="Name\tEdad\tSexo\tHabitat"+linea;
		String dulce="Name\tEdad\tSexo\tHabitat"+linea;
		
		//Polimorfismo
		Mascota Salmon=new Salado("Salmon", 12, "Macho", "Mar");
		Mascota Pinguino=new Salado("Rey Pinguino",27,"Hembra","Polo norte");
		Mascota Viejita=new Dulce("Viejita Doloris",10,"Macho","Rio");
		Mascota PezGato=new Dulce("Garfield",50,"Macho","Lasagna Landia");
		
		integrantes.add(Salmon);
		integrantes.add(Pinguino);
		integrantes.add(Viejita);
		integrantes.add(PezGato);
		
		for (Mascota x:integrantes) {
			if(x instanceof Dulce) {
				dulce+=x;
			}
			else
				salado+=x;
		}
		
		PezDulce.setText(dulce);
		PezSalado.setText(salado);
		
		JOptionPane.showMessageDialog(null,PezDulce);
		JOptionPane.showMessageDialog(null,Viejita.respirar()+"\n"+Viejita.enferma()+
				"\n"+((Dulce)Viejita).Nadar()+"\n"+((Dulce)Viejita).Sumerge()+"\n"+
				((Dulce)Viejita).Aletear()+"\n"+((Dulce)Viejita).Saltar()+"\n"+Viejita.Duerme()+"\n"+Viejita.Come(), "Viejita", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,PezGato.respirar()+"\n"+PezGato.enferma()+
				"\n"+((Dulce)PezGato).Nadar()+"\n"+((Dulce)PezGato).Sumerge()+"\n"+
				((Dulce)PezGato).Aletear()+"\n"+((Dulce)PezGato).Saltar()+"\n"+PezGato.Duerme()+"\n"+PezGato
				.Come(), "PezGato", JOptionPane.INFORMATION_MESSAGE);
		
		
		JOptionPane.showMessageDialog(null,PezSalado);
		JOptionPane.showMessageDialog(null,Salmon.respirar()+"\n"+Salmon.enferma()+
				"\n"+((Salado)Salmon).Nadar()+"\n"+((Salado)Salmon).Sumerge()+"\n"+
				((Salado)Salmon).Aletear()+"\n"+((Salado)Salmon).Cazar()+"\n"+Salmon.Duerme()+"\n"+Salmon.Come(), "Salmon", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,Pinguino.respirar()+"\n"+Pinguino.enferma()+
				"\n"+((Salado)Pinguino).Nadar()+"\n"+((Salado)Pinguino).Sumerge()+"\n"+
				((Salado)Pinguino).Aletear()+"\n"+((Salado)Pinguino).Cazar()+"\n"+Pinguino.Duerme()+"\n"+Pinguino.Come(), "Pinguino", JOptionPane.INFORMATION_MESSAGE);
	}

}
