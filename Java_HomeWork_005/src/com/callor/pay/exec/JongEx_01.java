package com.callor.pay.exec;

import com.callor.pay.service.JongService;

public class JongEx_01 {

	public static void main(String[] args) {

		JongService jong = new JongService();
		int pay = 3_878_989;
		jong.solution(pay);
		
	}

}