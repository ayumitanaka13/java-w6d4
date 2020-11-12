package ca.java.list.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Driver {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("John");
		names.add("Jane");
		names.add("Sarah");
		names.add("Allen");
		names.add("Jane");
		//Collections.sort(names);
		//System.out.println(names.size()); //4
		
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println(names.get(2)); //Sarah
		System.out.println(names.indexOf("Jane")); //1
		System.out.println(names.lastIndexOf("Jane")); //4
		
		names.add(4, "Ann");
		names.set(2, "Sophie");
		
		System.out.println();
		Iterator iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while(iterator.hasNext()) {
			if (iterator.next().equals("Jane")) {
				iterator.remove();
			}
		}

		System.out.println();
		for (String s : names) {
		System.out.println(s);
		}
		
//		List<String> otherNames = new ArrayList<>();
//		otherNames.add("Sophie");
//		otherNames.add("Ann");
//		
//		//names.removeAll(names);
//		names.addAll(otherNames);
//		System.out.println();
//		for (String s : names) {
//			System.out.println(s);
//		}
//		
//		//names.clear();
//		//System.out.println();
//		//for (String s : names) {
//		//	System.out.println(s);
//		//}
//		
//		System.out.println();
//		System.out.println(names.contains("Allen")); //true
//		
//		Object[] arrayNames = names.toArray();
//		//System.out.println(arrayNames.length);
//		names.removeAll(names);
//		
//		System.out.println(names.equals(otherNames)); //false
		
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		for (Integer i : v) {
			System.out.println(i);
		}
		Stack <Double> stack =new Stack<Double>();
		stack.push(5.5);
		stack.push(10.5);
		stack.push(15.5);
		for (Double d : stack) {
			System.out.println(d);
		}
		stack.pop();
		System.out.println("remove last item with pop method");
		for (Double d : stack) {
			System.out.println(d);
		}
		System.out.println(stack.search(5.5)); //2
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.addFirst("DDD");
		ll.addLast("FFF");
		for (String s : ll) {
			System.out.println(s);
		}
	}
}
