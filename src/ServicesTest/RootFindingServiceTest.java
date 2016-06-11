package ServicesTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Interfaces.IRootFindingService;
import Services.RootFindingService;

public class RootFindingServiceTest {

	private IRootFindingService _rootFindingService;

	@Before
	public void setUp() throws Exception {
		if (this._rootFindingService == null) {
			this._rootFindingService = new RootFindingService();
		}
	}

	@After
	public void tearDown() throws Exception {
		if (this._rootFindingService != null) {
			this._rootFindingService = null;
		}
	}

	@Test
	public void FindRootByBisection_當輸入endpointA為0_endpointB為2_應回傳1點5214() {
		// Arrange
		double expected = 1.5214;

		// Act
		double actual = this._rootFindingService.FindRootByBisection(0, 2);

		// Assert
		assertEquals(expected, actual, 0);
	}

	@Test
	public void FindRootByBisection_當輸入endpointA為0_endpointB為2_eps為1e負9_應回傳1點5214() {
		// Arrange
		double expected = 1.5214;

		// Act
		double actual = this._rootFindingService.FindRootByBisection(0, 2, 1e-9);

		// Assert
		assertEquals(expected, actual, 0);
	}

	@Test
	public void FindRootByBisection_當輸入endpointA為0_endpointB為2_eps為1e負9_func為x的3次方減x減2_應回傳1點5214() {
		// Arrange
		double expected = 1.5214;

		// Act
		double actual = this._rootFindingService.FindRootByBisection(0, 2, 1e-9, x -> Math.pow(x, 3) - x - 2);

		// Assert
		assertEquals(expected, actual, 0);
	}

}
