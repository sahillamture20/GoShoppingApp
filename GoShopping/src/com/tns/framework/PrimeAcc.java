package com.tns.framework;

public class PrimeAcc extends ShopAcc {
	
	protected boolean isPrime;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	/*The below 2 methods should be abstract, because class 'PrimeAcc' is an abstract.*/
	public void bookProduct(float charges) {
		System.out.println("Charges are: "+charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", isPrime()=" + isPrime()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
