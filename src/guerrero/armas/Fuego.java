package guerrero.armas;

import guerrero.armas.base.ArmasAbstracto;
import guerrero.base.GuerroAbstracto;

public class Fuego extends ArmasAbstracto {
	
	public Fuego (GuerroAbstracto guerro) {
		
	}

	@Override
	public int getDaño() {
		return this.guerrero.getDaño() + 30;
	}

	@Override
	public String getArmas() {
		// TODO Auto-generated method stub
		return this.guerrero.getArmas() + " Con fuego";
	}

}
