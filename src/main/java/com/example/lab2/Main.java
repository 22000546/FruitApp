package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> list = new ArrayList<Fruit>();
		
		list.add(new Fruit(101, "Apple", 1000));
		list.add(new Fruit(102, "Banana", 1600));
		list.add(new Fruit(103, "Lemon", 3200));
		list.add(new Fruit(104, "Kiwi", 1800));
		list.add(new Fruit(105, "Grape", 3200));
		list.add(new Fruit(201, "Blueberry", 3000));
		list.add(new Fruit(202, "Orange", 2000));
		list.add(new Fruit(203, "Strawberry", 2600));
		list.add(new Fruit(204, "Cherry", 1500));
		list.add(new Fruit(205, "Watermelon", 10000));
		
		System.out.println("Fruit List");
		for(Fruit obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\nFruit List (ordered by name)");
		Collections.sort(list, new FruitComparator());
		for(Fruit obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\nFruit List (reverse ordered by name)");
		Collections.sort(list, new FruitComparatorDesc());
		for(Fruit obj : list) {
			System.out.println(obj.toString());
		}
		
	}

}
