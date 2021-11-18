package ListaColects;

public class Estoque {
	
	private String equip1;

	public Estoque(String equip1) {
		super();
		this.equip1 = equip1;
	}

	public String getEquip1() {
		return equip1;
	}

	public void setEquip1(String equip1) {
		this.equip1 = equip1;
	}
   
	public String toString() {
		return this.equip1+" | ";
	}

}
