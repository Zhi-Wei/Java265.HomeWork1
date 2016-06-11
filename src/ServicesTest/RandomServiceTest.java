package ServicesTest;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Interfaces.IRandomService;
import Services.RandomService;

public class RandomServiceTest {

	private IRandomService _randomService;

	@Before
	public void setUp() throws Exception {
		if (this._randomService == null) {
			this._randomService = new RandomService();
		}
	}

	@After
	public void tearDown() throws Exception {
		if (this._randomService != null) {
			this._randomService = null;
		}
	}

	@Test
	public void GetRandomList_取得一個整數集合_應只有4個元素() {
		// Arrange
		int expected = 4;

		// Act
		Collection<Integer> actual = (Collection<Integer>) this._randomService.GetRandomList();

		// Assert
		assertEquals(expected, actual.size());
	}
	
	@Test
	public void GetRandomList_取得一個整數集合_與參考集合取差集後_參考集合應只有6個元素() {
		// Arrange
		int expected = 6;
		List<Integer> reference =
				new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

		// Act
		Collection<Integer> actual = (Collection<Integer>) this._randomService.GetRandomList();

		// Assert
		reference.removeAll(actual);
		assertEquals(expected, reference.size());
	}

}
