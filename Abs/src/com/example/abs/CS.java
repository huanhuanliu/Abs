package com.example.abs;

//import java.util.Iterator;
//
//public class CS {
//	public static void main(String[] args) {
//		a();
//		
//	}
//
//	private static void a() {
//		System.out.println("打印等腰三角形");
//		int i,j;
//		 for (i=1;i<=5;i++){
//			 for(j=5;j>i;j--){
//				 System.out.println("");
//			 }
//			 for(j=0;j<i*2-1;j--){
//				 System.out.println("*");
//			 }
//			System.out.println();
//		 }
//	}
//}
	public class CS{
		public static void main(String[] args) {
			a();
		}
	
	private static void a(){
		System.out.println("打印等腰三角形");
		int i,j;
		for(i=1;i<=5;i++){
			for(j=5;j>i;j--){
				System.out.println("");
			}
			for(j=0;j<i*2-1;j--){
				System.out.println("*");
			}
			System.out.println();
		}
	}
	}
