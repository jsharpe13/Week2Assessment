import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTest 
{
	skelatonPlayer player = new skelatonPlayer();

	@Before
	public void setUp() throws Exception
	{	
	}
	
	@Test
	public void notNull() 
	{
		assertNotNull(player);
	}
	@Test
	public void goldEarned()
	{
		player.changeGold(500);
		assertEquals(500, player.getGold());
	}

}
