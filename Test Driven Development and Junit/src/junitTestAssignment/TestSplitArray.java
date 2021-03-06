package junitTestAssignment;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestSplitArray{
	private int expected;
	private int[] input;

	public TestSplitArray(int[] input,int expected) {
		this.input=input;
		this.expected=expected;
	}

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{new int[]{1,1,1,2,1},3},{new int[]{2,1,1,2,1},-1},{new int[]{10,10},1}
		});
	}
	@Test
	public void evaluate(){
		//SplitArray test= new SplitArray();
		assertEquals(expected,ArrOperations.splitArray(input));
	}
}