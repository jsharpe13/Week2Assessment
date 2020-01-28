import java.util.Random;

public class skelatonPlayer 
{
	private int playerHealth;
	private int goldEarned;
	
	Random randomNumber = new Random();
	
	public skelatonPlayer()
	{
		playerHealth = 500;
		goldEarned = 0;
	}
	public int getPlayerHealth()
	{
		return playerHealth;
	}
	public void changeHealth(int damage)
	{
		playerHealth = playerHealth - damage;
		if(playerHealth < 0)
		{
			playerHealth = 0;
		}
	}
	public int getPlayerAttack()
	{
		int attack = randomNumber.nextInt(550) + 50;
		return attack;
	}
	public void changeGold(int goldGained)
	{
		goldEarned = goldEarned + goldGained;
	}
	public int getGold()
	{
		return goldEarned;
	}
}
