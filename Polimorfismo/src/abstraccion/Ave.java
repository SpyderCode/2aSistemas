package abstraccion;

public class Ave extends Animal{

	public Ave(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void moverse() {
		System.out.println("El "+super.getName()+" Vuela");
	}
	public void pia() {
		System.out.println("Pio pio pio");
	}

}
