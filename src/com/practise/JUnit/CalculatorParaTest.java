package com.practise.JUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class CalculatorParaTest {
	private static Calculator calc;
	private int param;
	private int result;
	public int tee;
	
	@BeforeClass
	public static void InitData(){
		calc = new Calculator();
		System.out.println("tag1:"+calc.getResult());
	}
	
	@Before
	public void setUp(){
		calc.clear();
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][] {
				{2, 4},
				{3, 9},
				{0, 0},
				{1, 1},
				{4, 16},
				{-5, 25}
		});
	}
	
	public CalculatorParaTest(int param, int result){
		this.param = param;
		this.result = result;
		System.out.println("tag2:"+calc.getResult());
	}
	
	@Test
	public void inspector(){
		calc.square(param);
		assertEquals(result,calc.getResult());
	}
	
	@Test
	public void inspector2(){
		calc.add(param);
		assertEquals(result,calc.getResult());
	}
}
