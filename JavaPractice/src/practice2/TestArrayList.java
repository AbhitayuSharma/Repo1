package practice2;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list2 = new ArrayList(); //any type of data can be added
		list.add("a");
		list.add("b");
//		list2.add(1);
//		list2.add("A");
		System.out.println(list.get(0));
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			if(list.get(i)=="b")
				System.out.println(i);
		}
		for(int j=0;j<10;j++) {
			list2.add(j);
		}
		System.out.println(list2);
		
	}

}
