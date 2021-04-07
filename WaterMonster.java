package creatingMonster;

public class WaterMonster extends Monster {
	
	
	
	private String attack;
	
	public WaterMonster(String attack) {
		super(attack);
		
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}
	
	
	public String attack() {
	return ( "Attack with water!");
	
			
	}
	



	
	
	

}
