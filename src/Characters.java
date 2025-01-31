public class Characters {
	
	private int hp;
	private String name;
	private int strength;
	private int dmg;
	EnemyAI bot = new EnemyAI(100);
	private int xp;
	private int healingPotion;
	private int damagePotion;
	private int resistancePotion;
	private boolean dmgAmp;
	private boolean dmgResist;
	

	public Characters(int hp, String name, int strength, int xp, int healingPotion, int damagePotion, int resistancePotion) {
		
		this.hp = hp;
		this.name = name;
		this.strength= strength;
		this.xp = xp;
		this.healingPotion = healingPotion;
		this.damagePotion = damagePotion;
		this.resistancePotion = resistancePotion;
	}
	
	@Override
	public String toString() {
		return "Characters [hp=" + hp + ", name=" + name + ", strength=" + strength + ", dmg=" + dmg + ", xp=" + xp
				+ ", healingPotion=" + healingPotion + ", damagePotion=" + damagePotion + ", resistancePotion="
				+ resistancePotion + "]";
	}

	public void easyBattle() {
		FightClass easyfight = new FightClass (this.hp, this.dmg, this.healingPotion, this.damagePotion, this.dmgAmp, this.xp);
		easyfight.easy();
		this.healingPotion = easyfight.getHealingPotion();
		this.damagePotion = easyfight.getDamagePotion();
		this.xp = easyfight.getXP();
	}



	public void gotoShop() {
		Shop shopping = new Shop(this.xp, this.healingPotion, this.damagePotion, this.resistancePotion);
		shopping.Buy();
		this.healingPotion=shopping.getHealingPotion();
		this.xp=shopping.getXp();
		this.resistancePotion=shopping.getResistancePotion();
		this.damagePotion=shopping.getDamagePotion();
		
	}
	
	
}
