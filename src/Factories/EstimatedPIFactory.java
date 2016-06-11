package Factories;

import Common.SolutionType;
import Interfaces.IEstimatedPIService;
import Services.EstimatedPIService;

public class EstimatedPIFactory {
	public static IEstimatedPIService GetService(SolutionType type) {
		IEstimatedPIService estimatedPIService;
		switch (type) {
		default:
			estimatedPIService = new EstimatedPIService();
		}
		return estimatedPIService;
	}
}
