package com.practise.design_pattern.abstract_factory;

public class PractiseAbstracFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleAbstractFactory erqi = new CarFactory("第二汽车制造厂");
		
		for(int i = 0; i < 10; i++){
			System.out.println(erqi.buyVehicle());
		}
	}

}
