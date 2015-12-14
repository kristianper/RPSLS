package test;

import main.Game;
import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GameTest {

	@InjectMocks
	private Game game;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

}
