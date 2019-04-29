package google26;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> nums = new LinkedList<Integer>();
		LinkedList<String> things = new LinkedList<String>();
		
		
		nums.add(1);
		nums.add(2);
		nums.addFirst(3);
		nums.add(4);
		nums.addLast(5);
		nums.add(6);
		System.out.println("nums = "+ nums );
		
		nums = deleteFromLinkedList(nums, 4);
		
		System.out.println("new list = " + nums);
		
		things.add("apples");
		things.add("bananas");
		things.add("pen");
		things.add("keys");
		things.add("lamp");
		things.addFirst("juice");
		System.out.println("things = " + things);
		
		things = deleteFromLinkedList(things, 2);
		
		System.out.println("new list = " + things);
		

	}

	private static <T> LinkedList<T> deleteFromLinkedList(LinkedList<T> lst, int i) {
		
		int x = lst.size()-i;
		lst.remove(x);
		return (LinkedList<T>) lst;
	}

}
