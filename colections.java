package satishit;

public class Demo1 {
	public static void main (String[] args)
	{
		//java.util.ArrayList<Integer>al=new java.util.ArrayList<>();
		//al.add(10);
		//al.add(20);
		//al.add(30);
		//al.add(40);
		//System.out.println(al);
	//}

//}
		java.util.LinkedList<Integer>ll=new java.util.LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
	}
}
package satishit;

public class ArrayList {
	public static void main (String[] args)
	{

	java.util.ArrayList al=new java.util.ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
		
	}

}
package satishit;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Satish");
		queue.add("Pujitha");
		queue.add("zmma");
		queue.add("bbb");
		System.out.println(queue);
		System.out.println(queue.element());
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			queue.remove();
			queue.poll();

		}
	}

}
package maait;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = (name) -> name.length();
		System.out.println(f.apply("satishit"));
		System.out.println(f.apply("hyd"));
	                                                                                                                                                         	System.out.println(f.apply("Dhoni"));
		BiFunction<Integer, Integer, Integer> bifunction = (a, b) -> a + b;
		System.out.println(bifunction.apply(10, 20));
	}
}
package sattishit;

import java.util.Iterator;

public class HashSet {
	public static void main(String[] args) {
	java.util.HashSet<String> hs = new java.util.HashSet<>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("four");
		hs.add("five");
		hs.add("five");
		// System.out.println(hs);
	//}

	Iterator<String> iterator=hs.iterator();
	//while(iterator.hasNext())
	//{
		//System.out.println(iterator.next());
	//}
//}
//}
package sattishit;

public class LinkedHashSet {
	public static void main (String[] args)
	{
		java.util.LinkedHashSet<String>lhs=new java.util.LinkedHashSet();
	lhs.add("Satish");
	lhs.add("Rajesh");
	lhs.add("Satish");
	lhs.add("Amma");
	lhs.add("Rajesh");
	lhs.add("Akka");
	//System.out.println(lhs);
	//}
//}
	//java.util.Iterator iterator=lhs.iterator();
	//while(iterator.hasNext())
	//{
		//System.out.println(iterator.next());
	
	//}
	//}
//}
																															package sattishit;

public class Stack {
	public static void main (String[] args)
	{
		java.util.Stack<Integer> s=new java.util.Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		//System.out.println(s);
		//System.out.println(s.peek());
		System.out.println(s.pop());
	}

}
