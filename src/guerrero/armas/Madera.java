package guerrero.armas;

import guerrero.base.GuerroAbstracto;

import guerrero.armas.base.ArmasAbstracto;

public class Madera extends ArmasAbstracto{
	
	public Madera(GuerroAbstracto guerro) {
		this.guerrero = guerro;
	}

	@Override
	public int getDaño() {
		return this.guerrero.getDaño()+5;
	}

	@Override
	public String getArmas() {
		return this.guerrero.getArmas() + "de madera";
	}

}
