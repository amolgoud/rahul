package day5;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class ForLoop {

	
	public static void main(String[] args) {
		int[] a={10,20,30,40,50,60};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		///////////////////////////
		for (int b : a) 
		{
			System.out.println(b);
		}
		System.out.println("################");
		int[] c=new int[4];
		c[0]=100;
		c[1]=200;
		c[2]=300;
		c[3]=400;
		for (int b : c) {
			System.out.println(b);
		}
		
		
	}

}





