package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book {
	private boolean coupon;		// 요리학원 쿠폰 유무

	public CookBook() {

	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}



	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook [" + super.toString() + ", coupon=" + coupon + "]";
	}


}
