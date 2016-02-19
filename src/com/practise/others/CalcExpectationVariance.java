package com.practise.others;

/**used to calculate expected value and variance of a sequence of random number
 * 
 * @author jolyon
 * @since 2016-02-19
 * 
 */
public class CalcExpectationVariance {
	private double ev;
	private double var;
	private long total;
	
	public CalcExpectationVariance(){
		ev = 0;
		var = 0;
		total = 0;
	}
	
	public void feed(double d){
		ev = (total*ev + d) / (total + 1);
		var = (java.lang.Math.pow(d - ev, 2) + total*var) / (total + 1);
		total ++;
	}

	public String query(){
		return "ev: " + ev + "\nvar: " + var + "\n";
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
