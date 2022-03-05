package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{
	/* It's a concrete class on it's own, but it extends the parent 'ShopFactory' class which is abstract so, it get it's features 
	 * As it is the concrete class, the methods present in the abstract ''ShopFactory' class is overridden and implemented by the concrete class.
	 * And concrete class cannot have unimplemented methods, but still we get the suggestion from the eclipse which says "Add unimplemented methods",
	 * which is wrong.
	 * Plus, this class contains the abstract methods from the 'PrimeAcc' & 'NormalAcc' class.*/
	
	
	@Override
	public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharge) {
		// TODO Auto-generated method stub
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharge, deliveryCharge);
		return gsnormal;
	}
	
}
