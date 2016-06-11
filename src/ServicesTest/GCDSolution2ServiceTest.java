package ServicesTest;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Interfaces.IGCDService;
import Services.GCDSolution2Service;

public class GCDSolution2ServiceTest {

	private IGCDService _gcdService;

	@Before
	public void setUp() throws Exception {
		if (this._gcdService == null) {
			this._gcdService = new GCDSolution2Service();
		}
	}

	@After
	public void tearDown() throws Exception {
		if (this._gcdService != null) {
			this._gcdService = null;
		}
	}

	@Test
	public void ComputeGCD_輸入a_54和b_32_應回傳2() {
		// Arrange
		int a = 54, b = 32, expected = 2;
		
		// Act
		int actual = this._gcdService.ComputeGCD(a, b);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void ComputeGCD_輸入a_252和b_105_應回傳21() {
		// Arrange
		int a = 252, b = 105, expected = 21;
		
		// Act
		int actual = this._gcdService.ComputeGCD(a, b);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void ComputeGCD_輸入a_6和b_35_應回傳1() {
		// Arrange
		int a = 6, b = 35, expected = 1;
		
		// Act
		int actual = this._gcdService.ComputeGCD(a, b);
		
		// Assert
		assertEquals(expected, actual);
	}

}
