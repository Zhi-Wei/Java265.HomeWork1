package Factories;

import Common.SolutionType;
import Interfaces.IGCDService;
import Services.GCDSolution1Service;
import Services.GCDSolution2Service;

public class GCDFactory {

	public static IGCDService GetService(SolutionType type) {
		IGCDService gcdService;
		switch (type) {
		case Solution1:
			gcdService = new GCDSolution1Service();
			break;
		case Solution2:
			gcdService = new GCDSolution2Service();
			break;
		default:
			gcdService = new GCDSolution1Service();
		}
		return gcdService;
	}

}
