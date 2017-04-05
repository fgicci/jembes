package gicci.datascience.jembes.utils;

import java.util.List;
import java.util.Vector;

public class Algebra {

	public static List<Integer> sumVectors(List<Integer> vector0, List<Integer> vector1) throws IllegalArgumentException {
		if (vector0.size() != vector1.size()) throw new IllegalArgumentException("Both vectors must be the same size.");
		List<Integer> result = new Vector<Integer>();
		for (int i = 0; i < vector0.size(); i++) {
			result.add(vector0.get(i) + vector1.get(i));
		}
		return result;
	}
}
