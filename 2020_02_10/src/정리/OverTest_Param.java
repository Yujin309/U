
package Á¤¸®;



import java.util.ArrayList;

import java.util.List;



public class OverTest_Param {

	static public void callAA(AA ref) {

		ref.m1();

	}

	static public void callAA(SubAA ref) {

		ref.m1();

	}

	static public void callAA(SubAASub ref) {

		ref.m1();

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		callAA(new SubAA());

		

		callAA(new BBAA());

		

		

		

	}



}





