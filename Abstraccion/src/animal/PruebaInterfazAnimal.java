package animal;

import javax.swing.JOptionPane;

public class PruebaInterfazAnimal {

	public static void main(String[] args) {
		AnimalAb o=new Tortuga("Pedro", 12.5, 150, "M", "Agua", "grande", "Tortugisis", 200);
		imprime(o);
	}

	private static void imprime(AnimalAb o) {
		JOptionPane.showMessageDialog(null, "Nombre: "+o.getNombre()+"\n"+"Peso: "+o.getPeso());
		
	}

}
