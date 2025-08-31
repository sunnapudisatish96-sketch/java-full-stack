package pujithait;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 2, 1, 4, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);

			}
		}
	}
}package core_java_concept;
public class Demo {
	public static void main (String[] args)
	{
		//System.out.println("Welcom to satish it");
	
	//}
	//int[] arr= {20,20,30};
	//System.out.println(Arrays.toString(arr));
	//date d=new Date();
	//File Reader f=new File Reader(abc.txt);
	
//double[] values=new double[100];
//values[0]=1000;
//values[1]=99;
//System.out.println(values[1]);
//int[] values=new int[100];
//values[0]=100;
//values[1]=199;
//values[101]=90;
//System.out.println(values[56]);
//System.out.println(values[0]);
//System.out.println(values[101]);
		//String[] words=new String[3];
	
		//words[0]="Satish";
		//words[1]="My";
		//words[2]="is";
		//System.out.println(words[0]);
		//words=new String[10];
		//System.out.println(words[2]);
	}
}
