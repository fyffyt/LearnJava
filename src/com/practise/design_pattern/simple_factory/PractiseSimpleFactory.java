package com.practise.design_pattern.simple_factory;



public class PractiseSimpleFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstrumentSimpleFactory fc = new InstrumentSimpleFactory();
		
		Instrument i1 = fc.getInstrument("piano");
		i1.play();
		
		Instrument i2 = fc.getInstrument("violin");
		i2.play();
		
		Object i3 = fc.getInstrument("xx");
		
		System.out.println(i3.getClass());
		
	}

}
