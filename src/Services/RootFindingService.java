package Services;

import java.math.BigDecimal;
import java.util.function.Function;
import Interfaces.IRootFindingService;

public class RootFindingService implements IRootFindingService {

	@Override
	public double FindRootByBisection(double endpointA, double endpointB) {
		return this.FindRootByBisection(endpointA, endpointB, 1e-9);
	}

	@Override
	public double FindRootByBisection(double endpointA, double endpointB, double eps) {
		return this.FindRootByBisection(endpointA, endpointB, eps, x -> Math.pow(x, 3) - x - 2);
	}

	@Override
	public double FindRootByBisection(double endpointA, double endpointB, double eps, Function<Double, Double> func) {
		double fa = func.apply(endpointA);
		double fb = func.apply(endpointB);
		double midpoint = 0d;

		while (endpointB - endpointA > eps) {
			midpoint = (endpointA + endpointB) / 2;
			double fc = func.apply(midpoint);
			if (fc == 0) {
				break;
			} else if (fa * fc < 0) {
				endpointB = midpoint;
				fb = fc;
			} else {
				endpointA = midpoint;
				fa = fc;
			}
		}
		return new BigDecimal(midpoint).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
