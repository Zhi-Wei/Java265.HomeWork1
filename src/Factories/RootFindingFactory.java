package Factories;

import Common.SolutionType;
import Interfaces.IRootFindingService;
import Services.RootFindingService;

public class RootFindingFactory {
	public static IRootFindingService GetService(SolutionType type) {
		IRootFindingService rootFindingService;
		switch (type) {
		default:
			rootFindingService = new RootFindingService();
		}
		return rootFindingService;
	}
}
