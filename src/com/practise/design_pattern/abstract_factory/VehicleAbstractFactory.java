package com.practise.design_pattern.abstract_factory;

import java.util.MissingResourceException;
import java.util.Vector;

public abstract class VehicleAbstractFactory {
	 public static abstract class Vehicle{
		 //
	 }

	 protected abstract Vehicle produceVehicle(TyreSimpleFactory.Tyre tyre,
			 EngineSimpleFactory.Engine engine,
			 ChassisSimpleFactory.Chassis chassis);
	 
	 public abstract Vehicle buyVehicle();

}

class CarFactory extends VehicleAbstractFactory{
	 public static class Car extends Vehicle{
		 //
	 }
	 protected Vehicle produceVehicle(TyreSimpleFactory.Tyre tyre,
			 EngineSimpleFactory.Engine engine,
			 ChassisSimpleFactory.Chassis chassis){
		 Vehicle car = new Car();
		 //
		 System.out.println("Manufactoring a car.");
		 return car;
	 }	
	 
	 private String name = "";
	 private Vector<TyreSimpleFactory.Tyre> tyreStock = new Vector<TyreSimpleFactory.Tyre>(10);
	 private Vector<EngineSimpleFactory.Engine> engineStock = new Vector<EngineSimpleFactory.Engine>(10);
	 private Vector<ChassisSimpleFactory.Chassis> chassisStock = new Vector<ChassisSimpleFactory.Chassis>(10);
	 private Vector<Car> carStock = new Vector<Car>(10);
	 
	 CarFactory(String name){
		 this.name = name;
		 stockMaterial(10, 10 , 10);
		 for(int i = 0; i < 10; i++){
			 TyreSimpleFactory.Tyre tyre = tyreStock.get(9-i);
			 EngineSimpleFactory.Engine engine = engineStock.get(9-i);
			 ChassisSimpleFactory.Chassis chassis = chassisStock.get(9-i);
			 tyreStock.removeElementAt(9-i);
			 engineStock.removeElementAt(9-i);
			 chassisStock.removeElementAt(9-i);
			 
			 //TODO chk materials
			 
			 carStock.add((Car)produceVehicle(tyre, engine, chassis));
		 }
		 
	 }
	 
	 private void stockMaterial(int tyreNum, int engineNum, int chassisNum){
		 for (int i = 0; i < tyreNum; i++){
			 tyreStock.add(TyreSimpleFactory.produceTyre("tyre001"));
		 }
		 for (int i = 0; i < engineNum; i++){
			 engineStock.add(EngineSimpleFactory.produceEngine("engine001"));
		 }
		 for (int i = 0; i < chassisNum; i++){
			 chassisStock.add(ChassisSimpleFactory.produceChassis("chassis001"));
		 }
	 }
	 
	 public Vehicle buyVehicle() throws MissingResourceException{
		 if(! carStock.isEmpty()){
			 Vehicle vehicle = carStock.lastElement();
			 carStock.remove(carStock.size() - 1);
			 return vehicle;
		 }
		 else throw new MissingResourceException("carStock empty.", "Car", "None");
	 }
}

class TruckFactory extends VehicleAbstractFactory{
	 public static class Truck extends Vehicle{
		 //
	 }	

	 protected Vehicle produceVehicle(TyreSimpleFactory.Tyre tyre,
			 EngineSimpleFactory.Engine engine,
			 ChassisSimpleFactory.Chassis chassis){
		 Vehicle car = new Truck();
		 //
		 System.out.println("Manufactoring a truck.");
		 return car;
	 }	
	 
	 private String name = "";
	 private Vector<TyreSimpleFactory.Tyre> tyreStock = new Vector<TyreSimpleFactory.Tyre>(10);
	 private Vector<EngineSimpleFactory.Engine> engineStock = new Vector<EngineSimpleFactory.Engine>(10);
	 private Vector<ChassisSimpleFactory.Chassis> chassisStock = new Vector<ChassisSimpleFactory.Chassis>(10);
	 private Vector<Truck> truckStock = new Vector<Truck>(10);
	 
	 TruckFactory(String name){
		 this.name = name;
		 stockMaterial(10, 10 , 10);
		 for(int i = 0; i < 10; i++){
			 TyreSimpleFactory.Tyre tyre = tyreStock.get(9-i);
			 EngineSimpleFactory.Engine engine = engineStock.get(9-i);
			 ChassisSimpleFactory.Chassis chassis = chassisStock.get(9-i);
			 tyreStock.removeElementAt(9-i);
			 engineStock.removeElementAt(9-i);
			 chassisStock.removeElementAt(9-i);
			 
			 //TODO chk materials
			 
			 truckStock.add((Truck)produceVehicle(tyre, engine, chassis));
		 }
		 
	 }
	 
	 private void stockMaterial(int tyreNum, int engineNum, int chassisNum){
		 for (int i = 0; i < tyreNum; i++){
			 tyreStock.add(TyreSimpleFactory.produceTyre("tyre002"));
		 }
		 for (int i = 0; i < engineNum; i++){
			 engineStock.add(EngineSimpleFactory.produceEngine("engine002"));
		 }
		 for (int i = 0; i < chassisNum; i++){
			 chassisStock.add(ChassisSimpleFactory.produceChassis("chassis002"));
		 }
	 }
	 
	 public Vehicle buyVehicle() throws MissingResourceException{
		 if(! truckStock.isEmpty()){
			 Vehicle vehicle = truckStock.lastElement();
			 truckStock.remove(truckStock.size() - 1);
			 return vehicle;
		 }
		 else throw new MissingResourceException("truckStock empty.", "Truck", "None");
	 }
}

