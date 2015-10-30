package com.practise.design_pattern.adapter;

public class PractiseAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublePinPlugSimpleFactory.Type201Plug plug = new DoublePinPlugSimpleFactory.Type201Plug();
		
		TripleHoleSocket socket = new TripleHoleSocket();
		
		DoublePin2TriplePinPlugAdapter adapter = new DoublePin2TriplePinPlugAdapter(plug);
		
		adapter.connectTripleHoleSocket(socket);
		
	}

}
