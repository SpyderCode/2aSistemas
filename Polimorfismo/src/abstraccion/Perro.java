package abstraccion;

public class Perro extends Animal{


	public Perro(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void moverse() {
		System.out.println("El "+super.getName() +" se mueve");
		
	}
	public void ladra() {
		System.out.println("Gau gau gau");
	}

}
