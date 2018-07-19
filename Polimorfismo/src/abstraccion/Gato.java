package abstraccion;

public class Gato extends Animal{

	public Gato(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void moverse() {
		System.out.println("El "+super.getName()+" se mueve");
		
	}
	public void Maulla() {
		System.out.println("Nyan nyan nyan");
	}

}
