package creatingMonster;

public class FireMonster extends Monster {
	
private String attack;
	
	public FireMonster(String attack) {
		super(attack);
		
	}

	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}
	
	
	public String attack() {
	return( "Attack with fire!");
	
	}
	
	

	
	
	

}
