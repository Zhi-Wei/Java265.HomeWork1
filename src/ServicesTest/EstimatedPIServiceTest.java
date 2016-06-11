package ServicesTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Interfaces.IEstimatedPIService;
import Services.EstimatedPIService;

public class EstimatedPIServiceTest {

	private IEstimatedPIService _estimatedPIService;

	@Before
	public void setUp() throws Exception {
		if (_estimatedPIService == null) {
			_estimatedPIService = new EstimatedPIService();
		}
	}

	@After
	public void tearDown() throws Exception {
		if (_estimatedPIService != null) {
			_estimatedPIService = null;
		}
	}

	@Test
	public void ComputeEstimatedPI_圓周率近似值_應近似3點14容許誤差正負0點1() {
		// Arrange
		double expected = 3.14;

		// Act
		double actual = this._estimatedPIService.ComputeEstimatedPI();

		// Assert
		assertEquals(expected, actual, 0.1d);
	}

}
