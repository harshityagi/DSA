package collection;

import java.util.ArrayList;

public class ArLst {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(3);
		list.add(9);
		System.out.println(list);
		//get element
		int element=list.get(0);
		System.out.println(element);
		
		//add element in between
		list.add(1,1);
		System.out.println(list);
		
		//set element
		list.set(0,5);
		System.out.println(list);
		
		//delete element
		list.remove(3);
		System.out.println(list);
		
		//size
		int size=list.size();
		System.out.println(size);
		
	}
}
