
public class Peces extends Mascota{
	private String habitat;
	public Peces(String name, int edad, String sexo,String habitat) {
		super(name, edad, sexo);
		this.habitat=habitat;
		// TODO Auto-generated constructor stub
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return "el "+getName()+" respira";
	}

	@Override
	public String enferma() {
		// TODO Auto-generated method stub
		return "El "+getName()+" se enferma";
	}

	@Override
	public String Duerme() {
		// TODO Auto-generated method stub
		return "El "+getName()+" se Duerme";
	}

	@Override
	public String Come() {
		// TODO Auto-generated method stub
		return "El  "+getName()+"  se Come";
	}
	
	public String Nadar() {
		return "El  "+getName()+"  nada";
	}
	public String Sumerge() {
		return "El "+getName()+"  sumerge";
	}
	public String Aletear() {
		return "El  "+getName()+"  Aletea";
	}
	
	public String toString() {
		return super.toString()+this.habitat+"\n";
	}

}
