package com;

public class LambdaMentalTry implements Mental{
	
	
	

	public static void main(String[] args) {
		String a[];
		a = new String[8];
		int [] ans = null;
		LambdaMentalTry m = new LambdaMentalTry();
		for(int i=0;i<8;i++) {
			a[i]="Mental";
		}
		a[3] = "Not Mental";
		a[5] = "Not Mental";
		
		
		ans = m.mentalStatus(a);
		for(int j=0;j<ans.length;j++) {
			System.out.println(ans[j]);
		}
		// TODO Auto-generated method stub
//		int a[];
//		a = new int[8];
//		LambdaMentalTry m = new LambdaMentalTry();
	}

	@Override
	public int[] mentalStatus(String[] a) {
		// TODO Auto-generated method stub
		int [] index = new int[2];
		int elements=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!="Mental") {
				index[elements]=i;
				elements++;
			}
		}
		return index;
	}

	
	
	
}
