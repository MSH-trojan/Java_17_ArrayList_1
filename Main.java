package main;

import java.util.ArrayList;

public class Main{

public static void main(String[] args){

ArrayList<Integer> first = new ArrayList<>();

for(int i = 1; i <= 5 ; i++){

first.add(i);

}

	System.out.println(first);

first.remove(1);

	System.out.println();

	System.out.println("After removing the second element:");
	
	System.out.println();
	
	System.out.println(first);

}}