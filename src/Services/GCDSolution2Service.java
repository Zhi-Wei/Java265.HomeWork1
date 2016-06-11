package Services;

import Interfaces.IGCDService;

public class GCDSolution2Service implements IGCDService {

	@Override
	public int ComputeGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return ComputeGCD(b, a % b);
	}

}
