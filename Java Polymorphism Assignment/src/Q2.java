class Monster{
	protected String name;
	Monster(String name){
		this.name=name;
	}
	
	public String attack() {
		return"Attacking Monster" + name;
	}
}

class FireMonster extends Monster{
	FireMonster(String name){
		super(name);
	}
	@Override
	public String attack() {
		return "Attacking fire monster" + name;
	}
}

class WaterMonster extends Monster{
	WaterMonster(String name){
		super(name);
	}
	
	@Override
	public String attack() {
		return "Attacking Water Monster" +name;
	}
}

class StoneMonster extends Monster{
	StoneMonster(String name){
		super(name);
	}
	
	@Override
	public String attack() {
		return "Attacking Stone Monster" +name;
	}
}
public class Q2 {

	public static void main(String[] args) {
		Monster m1=new FireMonster("Dinasour");
		
		Monster m2=new WaterMonster("Lion");
		
		Monster m3=new StoneMonster("Tiger");
		
		System.out.println(m1.attack());
		
		System.out.println(m2.attack());
		
		System.out.println(m3.attack());

	}

}
