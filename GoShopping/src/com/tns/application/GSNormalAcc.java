package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	

	/* It's a concrete class, which means the methods present in the abstract class is 
	overridden and implemented by the concrete class*/
	

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public GSNormalAcc() {
		// TODO Auto-generated constructor stub
		super(accNo, accNm, deliveryCharge, deliveryCharge);
	}



	public void bookProduct(float charges) {
		System.out.println("Dear Normal User, Your Charges are: "+charges+" with Delivery Charges is: "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + getAccNo() + ", charges=" + getCharges() + ", toString()=" + super.toString()
		+ ", getAccNm()=" + getAccNm() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
		
}
