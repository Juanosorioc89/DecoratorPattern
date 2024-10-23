package guerrero.armas;

import guerrero.armas.base.ArmasAbstracto;
import guerrero.base.GuerroAbstracto;

public class Hierro extends ArmasAbstracto{
	
	public Hierro (GuerroAbstracto guerro) {
		this.guerrero = guerro;
	}
	
	
	@Override
	public int getDaño() {
		return this.guerrero.getDaño() + 10;
	}

	@Override
	public String getArmas() {
		return this.guerrero.getArmas()+" de hierro";
	}


}

	