package Factories;

import Common.SolutionType;
import Interfaces.IRandomService;
import Services.RandomService;

public class RandomFactory {
	public static IRandomService GetService(SolutionType type) {
		IRandomService randomService;
		switch (type) {
		default:
			randomService = new RandomService();
		}
		return randomService;
	}
}
