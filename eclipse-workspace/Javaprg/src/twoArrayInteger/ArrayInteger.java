package twoArrayInteger;

import javax.swing.SortOrder;

public class ArrayInteger {

	public static void main(String[] args) {

		Integer a[]= {1, 3, 15, 11, 2};
		Integer b[]={23, 127, 235, 19, 8};
		 int n=a.length;
		 int m= b.length;
		 int p1=0,p2=0;
		 
		 int min = Integer.MAX_VALUE;
		 
		 for (int i =0; i < n ; i++) {
			 
			 for (int j =0; j<m;j++) {
				 
				 if((a[i] -b[j]) > 0) {
					 if((a[i] -b[j]) < min) {
						 min = a[i] -b[j];
						 p1=a[i];
						 p2=b[j];
					 }
				 }
				 else if((b[j] -a[i]) > 0) {
					 if((b[j] -a[i]) < min) {
						 min = b[j] -a[i];
						 p1=b[j];
						 p2=a[i];
					 }
				 }
			}
				 
			 }
		 
		 
		 System.out.println(p1+" "+p2+" "+(p1-p2));
		 }
		
		               
	}


