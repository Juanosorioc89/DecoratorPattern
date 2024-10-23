package guerrero;

import guerrero.base.GuerroAbstracto;

public class Infanteria extends GuerroAbstracto{

	@Override
	public int getDaño() {
		return 10;
	}

	@Override
	public String getArmas() {
		return "espada";
	}
	

}
