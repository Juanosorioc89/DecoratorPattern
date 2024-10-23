package guerrero;

import guerrero.base.GuerroAbstracto;

public class Arquero extends GuerroAbstracto {

	@Override
	public int getDaño() {
		return 5;
	}

	@Override
	public String getArmas() {
		return "Arco";
	}

}
