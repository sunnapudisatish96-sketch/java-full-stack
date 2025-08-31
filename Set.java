package sattishit;

public class TreeMap {
	public static void main(String[] args) {
		java.util.TreeMap<Integer, String> map = new java.util.TreeMap<>();
		map.put(103, "Satish");
		map.put(104, "Rajesh");
		map.put(105, "Pradeep");
		map.put(106, "Akka");
		map.put(107, "Amma");
		map.put(104, "Akka");
		System.out.println(map);
	}

}
package sattishit;

import java.util.Enumeration;

public class Vector {
	public static void main (String[] args)
	{
		java.util.Vector<Integer> v= new java.util.Vector<>();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	//System.out.println(v);
	Enumeration<Integer>elements=v.elements();
	while(elements.hasMoreElements())
	{
		System.out.println(elements.nextElement());
	}
	}

}
