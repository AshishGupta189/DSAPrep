package prob3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	/*
	 * Q3/- Create a List of Integers and Map each integer to their square inside
	 * another List. Print both the List using Lambda expressions.
	 */
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		
		List<Integer> sqint=list.stream().map(s->s*s).collect(Collectors.toList());
		list.forEach(s->System.out.println(s));
		sqint.forEach(s->System.out.println(s));
	}
}
