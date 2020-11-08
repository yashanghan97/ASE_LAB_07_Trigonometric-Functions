package Trigonometric_JUnit_Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Trigonometric.Factorial_Exception_Handler;
import Trigonometric.Power_Exception_Handler;
import Trigonometric.Trigonometric_Functions;

public class Tests_Tan {

	double decimalpoints = 0.0001;
	
	@Test
	public void testTan1_Positive() throws Power_Exception_Handler, Factorial_Exception_Handler
	{
		// this test is used for checking tan(x) value compare to Math.tan(x)
		assertEquals(Math.tan(2), Trigonometric_Functions.tan(2), decimalpoints);
	}

}