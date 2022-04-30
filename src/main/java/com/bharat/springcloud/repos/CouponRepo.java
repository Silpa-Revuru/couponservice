package com.bharat.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharat.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
