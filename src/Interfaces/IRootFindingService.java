package Interfaces;

import java.util.function.Function;

public interface IRootFindingService {
	double FindRootByBisection(double endpointA, double endpointB);

	double FindRootByBisection(double endpointA, double endpointB, double eps);

	double FindRootByBisection(double endpointA, double endpointB, double eps, Function<Double, Double> func);
}
