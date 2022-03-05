package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//8.(a) = instance of GSShopFactory to ShopFactory reference.
		GSShopFactory gsshopfactory = new GSShopFactory();
		gsshopfactory.getNewPrimeAccount(101, "Sahil", 500, true);
		gsshopfactory.getNewNormalAccount(102, "Rahil", 500, 75);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		gsprime.bookProduct(500);
		gsprime.toString();
		
		
		GSNormalAcc gsnormal = new GSNormalAcc();
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharge();
		gsnormal.bookProduct(500);
		gsnormal.toString();
		
	
	}
}