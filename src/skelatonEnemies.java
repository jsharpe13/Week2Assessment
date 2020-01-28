
import java.util.Random;

public class skelatonEnemies 
{
	private final int LOWEST_HEALTH_POSSIBLE = 100;
	private int health;
	private String[] encounter = {"A skelaton appears!", "Oh no, a skelaton!", "Eeek! A skelaton!"};
	
	Random randomNumber = new Random();
	
	public skelatonEnemies()
	{
		int enemyHealth = randomNumber.nextInt(400) + LOWEST_HEALTH_POSSIBLE;
		setHealth(enemyHealth);
	}
	
	public String getEncounter()
	{
		String phrase = encounter[randomNumber.nextInt(encounter.length)];
		return phrase;
	}
	public void setHealth(int healthNumber)
	{
		health = healthNumber;
	}
	public int getHealth()
	{
		return health;
	}
	public void changeEnemyHealth(int damage)
	{
		health = health - damage;
		if(health < 0)
		{
			health = 0;
		}
	}
	public int getAttack()
	{
		int attack = randomNumber.nextInt(450) + 50;
		return attack;
	}
}
