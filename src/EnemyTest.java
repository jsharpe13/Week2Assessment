import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnemyTest 
{
	skelatonEnemies enemy = new skelatonEnemies();

	@Before
	public void setUp() throws Exception
	{	
	}
	
	@Test
	public void notNull() 
	{
		assertNotNull(enemy);
	}
	@Test
	public void testZeroHealth()
	{
		enemy.changeEnemyHealth(5000);
		assertTrue(enemy.getHealth() == 0);
	}
	@Test
	public void EnemyHealthInital()
	{
		assertTrue(enemy.getHealth() >= 100);
	}

}
