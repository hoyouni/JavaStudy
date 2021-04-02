package chap07_ObjectOrientiedProgrammingTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> kyo = new ArrayList<Integer>();
		List<Integer> cha = new ArrayList<Integer>();
		List<Integer> hap = new ArrayList<Integer>();
		
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		for(int i = 0; i < list1.size(); i++) {
			if(list1.contains(list2.get(i))) {
				kyo.add(list2.get(i));
			} 
			if(!list2.contains(list1.get(i))) {
				cha.add(list1.get(i));
			}
			if(!hap.contains(list1.get(i)) && !hap.contains(list2.get(i)))
			hap.add(list1.get(i));
			hap.add(list2.get(i));
		}
		Collections.sort(hap);
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println("kyo : " + kyo);
		System.out.println("cha : " + cha);
		System.out.println("hap : " + hap);
	}
}






















