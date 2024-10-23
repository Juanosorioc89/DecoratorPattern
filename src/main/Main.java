package main;
import guerrero.Infanteria;
import guerrero.base.GuerroAbstracto;
import guerrero.armas.Madera;
import guerrero.armas.Fuego;

public class Main {

	public static void main(String[] args) {
		
		GuerroAbstracto infanteria = new Infanteria();
		infanteria = new Madera(infanteria);
		infanteria = new Fuego(infanteria);
		
		System.out.println(infanteria.getArmas());
		System.out.println(infanteria.getDaño());

	}

}
