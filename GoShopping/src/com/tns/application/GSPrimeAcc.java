package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	/* It's a concrete class, which means the methods present in the abstract class is 
	overridden and implemented by the concrete class*/
	
	//'charges=0' because prime user, 'static'-> If there will be any delivery charges on some product even for prime user 
	private static final float charges = 0;
	
	private static boolean isPrime;

	public float getCharges() {
		return charges;
	}

	public GSPrimeAcc() 
	{
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: "+charges);
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}

	
}
