package com.tns.framework;

public class ShopAcc {
	
	/*Using 'private' access  modifier you hide the some data, but we are using them in other class which is outside the 'com.tns.framework' package.
	 * So, change them to 'protected'*/
	protected static int accNo;
	protected static String accNm;
	protected float charges;
	
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	
	
	//Using constructor we  can give access to the data which is essential for someone 
	public ShopAcc(int accNo, String accNm, float charges) {
		
		ShopAcc.accNo = accNo;
		ShopAcc.accNm = accNm;
		this.charges = charges;
	}
	
	//Use 'public' because they are used in other files also
	public void bookProduct(float charges) {
		System.out.println("Product booked and charges are:"+charges);
	}
	
	public void items(float charges) {
		System.out.println("Items are delivered with charges :"+charges);
	}
	
	//Use "toString()" to convert every input in string
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
