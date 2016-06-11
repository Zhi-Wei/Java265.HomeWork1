import java.util.StringJoiner;
import Common.SolutionType;
import Factories.EstimatedPIFactory;
import Factories.GCDFactory;
import Factories.RandomFactory;
import Factories.RootFindingFactory;

public class Main {

	public static void main(String[] args) {
		int gcd = GCDFactory.GetService(SolutionType.Normal).ComputeGCD(54, 32);
		System.out.println("GCD: " + gcd);

		double pi = EstimatedPIFactory.GetService(SolutionType.Normal).ComputeEstimatedPI();
		System.out.println("Estimated PI: " + pi);

		double root = RootFindingFactory.GetService(SolutionType.Normal).FindRootByBisection(0, 2, 1e-16);
		System.out.println("Root: " + root);

		StringJoiner joiner = new StringJoiner(", ", "[", "]");
		RandomFactory.GetService(SolutionType.Normal).GetRandomList()
			.forEach(x -> joiner.add(x.toString()));
		System.out.println("Random List: " + joiner.toString());
	}
}
