package test;

import main.Computer;
import main.Move;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;

public class ComputerTest {

	@InjectMocks
	private Computer computer;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetMove() {
		assertEquals(Move.LIZARD, computer.getMove());
	}

}
