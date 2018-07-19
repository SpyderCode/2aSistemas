package abstraccion;

public abstract class Animal {
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//metodos concretos
	public void comer() {
		System.out.println("El "+getName()+" come");
	}
	//Metodo Abstracto
	public abstract void moverse();
}
