package com.String;

public class SBuffer {
		public static void main(String[] args) {
			
			String s = "Good";
			System.out.println("Orignal : " + s);
			
			String s3 = s.concat("Morning");
			s.toUpperCase();
			System.out.println("Updated : " + s);
			
			System.out.println("-------------------------------");
			  //Important - StringBuffer- 
			StringBuffer sb = new StringBuffer("Nice");
			System.out.println("Orignal : " + sb);
			
			sb.append("Morning");
			System.out.println("Updated :" + sb);
			
			sb.delete(2, 5);
			System.out.println("Updated :" + sb);
			
		}
	}

