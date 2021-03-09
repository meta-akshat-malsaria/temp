package junitTestAssignment;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LargestMirrorTest {
	private int[] input;
	private int expected;
	
	public LargestMirrorTest(int []input,int expected){
		this.input=input;
		this.expected=expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> parameters(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,2,3,8,9,3,2,1},3},{new int[]{7,1,4,9,7,4,1},2},{new int[]{1,2,1},3},{new int[]{1,4,5,3,5,4,1},7}
		});
	}
	@Test
	public void test() {
		//LargestMirror test = new LargestMirror();
		assertEquals(expected,ArrOperations.maxMirror(input));
	}

}
