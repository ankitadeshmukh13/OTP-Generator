package com.otpGenerator;

import java.util.Random;
import java.util.Scanner;

public class OTPGenerator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans;
		
		System.out.println("Generate OTP In java using Random class");
		System.out.println("Can We send you an OTP");
		ans=sc.next();
		if(ans.equalsIgnoreCase("yes")) {
			Random rd=new Random();
			int otp=rd.nextInt(1000,9999);
			System.out.println("Your OTP IS :-"+otp);
			
		}
		else if (ans.equalsIgnoreCase("no")){
			System.out.println("OTP is not will be sent");
			
		}else {
			System.out.println("Invalid Input");
		}
		
}
}
