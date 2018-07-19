package abstraccion;

import javax.swing.JOptionPane;

public class PruebaAnimal {

	public static void main(String[] args) {
		String name;
		Animal p=new Perro("Fido");
		Animal a=new Ave("Piolin");
		Animal g=new Gato("Garfield");//Upcasting
		
		
		p.comer();
		p.moverse();
		((Perro)p).ladra();//Downcasting
		name=JOptionPane.showInputDialog("Ingresa el Nombre del perro");
		p.setName(name);
		p.comer();
		p.moverse();
		((Perro)p).ladra();//Downcasting
		
		a.comer();
		a.moverse();
		((Ave)a).pia();
		
		g.comer();
		g.moverse();
		((Gato)g).Maulla();
		

	}

}
