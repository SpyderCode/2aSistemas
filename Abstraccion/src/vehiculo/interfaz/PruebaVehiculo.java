package vehiculo.interfaz;

import javax.swing.JOptionPane;

public class PruebaVehiculo {

	public static void main(String[] args) {
		Acuatico s=new Submarino("Marinela",158.5);
		imprimeS(s);
	}

	private static void imprimeS(Acuatico s) {
		JOptionPane.showMessageDialog(null,"Nombre: "+
		s.getNomAcuatico()+"\n"+"Velocidad: "+
		s.getVelocidad()+"\n"+s.AplicaPlan()+"\n"+
		s.Transportar()+"\n"+s.navegar()+"\n"+
		((Submarino)s).emerge()+"\n"+((Submarino)s).sumerge(),
		"Submarino Marinela",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
