package Services;

import java.math.BigDecimal;
import java.security.SecureRandom;
import Interfaces.IEstimatedPIService;

public class EstimatedPIService implements IEstimatedPIService {

	@Override
	public double ComputeEstimatedPI() {
		double n = 1e6, m = 0, i, x, y;
		SecureRandom srand = new SecureRandom();

		for (i = 0; i <= n; i++) {
			x = new BigDecimal(srand.nextDouble())
					.setScale(16, BigDecimal.ROUND_HALF_UP)
					.doubleValue();
			y = new BigDecimal(srand.nextDouble())
					.setScale(16, BigDecimal.ROUND_HALF_UP)
					.doubleValue();
			
			if ((Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
				m++;
			}
		}
		return 4 * m / n;
	}

}
