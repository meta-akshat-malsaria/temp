package junitTestAssignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class FixXYTest {

	@Test
	public void test() {
			int arr[] = {5, 4, 9, 4, 9, 5};
			int expected[] = {9, 4, 5, 4, 5, 9};
			int x = 4;
			int y = 5;
			int actual[] = ArrOperations.fixXY(arr, x, y);
			assertArrayEquals(expected, actual);
	
	}

}
