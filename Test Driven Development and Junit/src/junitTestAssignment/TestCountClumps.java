package junitTestAssignment;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestCountClumps {
	private int[] input;
	private int expected;
	
	public TestCountClumps(int []input,int expected){
		this.input=input;
		this.expected=expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> parameters(){
		return Arrays.asList(new Object[][]{
				{new int[]{1,2,2,3,4,4},2},{new int[]{1,1,2,1,1},2},{new int[]{1,1,1,1,1},1}
		});
	}

	@Test
	public void test() {
		//Clumps test=new Clumps();
		assertEquals(expected,ArrOperations.countClumps(input));
	}

}
