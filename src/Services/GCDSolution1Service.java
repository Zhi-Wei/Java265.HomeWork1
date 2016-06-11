package Services;

import Interfaces.IGCDService;

public class GCDSolution1Service implements IGCDService {
	
	@Override
	public int ComputeGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
