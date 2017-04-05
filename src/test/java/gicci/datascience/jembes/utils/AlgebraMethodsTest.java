package gicci.datascience.jembes.utils;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AlgebraMethodsTest {

	private static final Integer[] numbers0 = {4, 3, 8, 9, 2, 5, 1};
	private static final Integer[] numbers1 = {1, 3, 2, 7, 5, 6, 9};
	
	@Test
	public void testSumBetweenVectors() {
		Integer[] sumresult = {5, 6, 10, 16, 7, 11, 10};
		List<Integer> vec0 = new ArrayList<Integer>();
		vec0.addAll(Arrays.asList(numbers0));
		List<Integer> vec1 = new ArrayList<Integer>();
		vec1.addAll(Arrays.asList(numbers1));
		
		assertArrayEquals(sumresult, Algebra.sumVectors(vec0, vec1).toArray());
	}
}
