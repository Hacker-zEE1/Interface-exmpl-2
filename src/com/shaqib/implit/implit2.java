package com.shaqib.implit;

import com.shaqib.absit.abs1;
import com.shaqib.absit.absit2;
import com.shaqib.it.it2;

public class implit2 extends abs1 {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("method 3");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		it2 t = new implit2();     //The interface reference variables is able to hold child class objects.
		t.m1();
		t.m2();
		t.m3();
		abs1 t1 = new implit2();   //The abstract class reference variables is able to hold child class objects.
		t1.m1();
		t1.m2();
		t1.m3();
		absit2 t2 = new implit2();  //The abstract class reference variables is able to hold child class objects.
		t2.m1();
		t2.m2();
		t2.m3();
	}

}
