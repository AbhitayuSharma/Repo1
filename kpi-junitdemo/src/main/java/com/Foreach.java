package com;

import java.util.ArrayList;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> gameList = new ArrayList<String>();
		gameList.add("Football");
		gameList.add("Cricket");
		gameList.add("Chess");
		gameList.add("Hockey");
		gameList.add("Tennis");
		gameList.add("Basketball");
		
		gameList.forEach(games -> System.out.println(games));   //Lambda

	}

}
