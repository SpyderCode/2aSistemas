package Polimorfismo.futbol;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class PruebaFutbol {

	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		JTextArea players=new JTextArea();
		JTextArea coach=new JTextArea();
		JTextArea massage=new JTextArea();
		String linea="\n________________________________________________________________\n";
		
		String jugadores="Id\tNombre\tApellido\tEdad\tNumero\tPosicion"+linea;
		String entrenadores="Id\tNombre\tApellido\tEdad\tIdentificador"+linea;
		String masajistas="Id\tNombre\tApellido\tEdad\tEspecialidad\tExperiencia"+linea;

		/// Polimorfismo
		SeleccionFutbol hugo = new Futbolista(123, "Hugo", "Sanchez", 45, 9, "Delantero");
		SeleccionFutbol chicharrito = new Futbolista(999, "Javier", "Hernandez", 26, 14, "Delantero");
		SeleccionFutbol tuca=new Entrenador(1,"Ricardo","Ferreti",60,456);
		SeleccionFutbol violeta=new Masajista(14,"Violeta","Figueroa",22,"Espalda Baja",4);
		SeleccionFutbol conejo=new Futbolista(12,"Oscar","Perez",49,1,"Portero");
		SeleccionFutbol piojo=new Entrenador(22,"Miguel","Herrera",55,56);
		SeleccionFutbol sheyla=new Masajista(12,"Sheyla","Martinez",24,"Piernas",3);
		SeleccionFutbol oswaldo=new Futbolista(89,"Oswaldo","Sanchez",33,1,"Portero");

		integrantes.add(chicharrito);
		integrantes.add(hugo);
		integrantes.add(tuca);
		integrantes.add(violeta);
		integrantes.add(conejo);
		integrantes.add(piojo);
		integrantes.add(sheyla);
		integrantes.add(oswaldo);
		
		for(SeleccionFutbol x:integrantes) {
			if(x instanceof Futbolista) {
				jugadores+=x;
			}
			else if(x instanceof Entrenador) {
				entrenadores+=x;
			}
			else
				masajistas+=x;
		}
		
		players.setText(jugadores);
		coach.setText(entrenadores);
		massage.setText(masajistas);

		JOptionPane.showMessageDialog(null,players );
		JOptionPane.showMessageDialog(null,coach );
		JOptionPane.showMessageDialog(null,massage );

	}

}
