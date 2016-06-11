package Services;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Interfaces.IRandomService;

public class RandomService implements IRandomService {
			
	@Override
	public Iterable<Integer> GetRandomList() {
		List<Integer> result = new ArrayList<Integer>();
		SecureRandom srand = new SecureRandom();
		List<Integer> list =
				new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
		
		for (int i = 10; i > 6; i--) {
			int index = srand.nextInt(i);
			result.add(list.get(index));
			list.remove(index);
		}
		return result;
	}

}
