package com.practise.design_pattern.simple_factory;

public class InstrumentSimpleFactory {
	public Instrument getInstrument(String name){
		switch (name){
			case "piano":
				return new Piano();
			case "violin":
				return new Violin();
			default:
				return new Piano();
		}
	}
}
