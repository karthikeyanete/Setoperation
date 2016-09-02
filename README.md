package org.creators;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import org.creators.coll.SetOpt;

public class Solution{
	static BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
	  static SetOpt obj = new SetOpt();
  public static void main(String args[]) {
	  //System.out.println("Enter your choice");
	 /* int opt = Integer.parseInt( bf.readLine());
	  switch(opt)
	  {
	  case 1:obj.union();
		  break;
	  case 2:obj.intersection();
		  break;
	  case 3:obj.difference();
		  break;
	  case 4:obj.symDifference();
		  break;
		  default:
			  System.out.println("enter proper choice");
	  }*/
	  SetOpt<String> set1 = new SetOpt<String>();
		SetOpt<String> set2 = new SetOpt<String>();
    set1.add("a");
    set1.add("b");
    set1.add("c");
    set1.add("d");
    set2.add("c");
    set2.add("a");
    set2.add("e");
    set2.add("f");

    System.out.println("set1: " + set1);
    System.out.println("set2: " + set2);
    System.out.println("Union: " + obj.union( set1, set2));
    System.out.println("Intersection: " + obj.intersection(set1, set2));
    System.out.println("Difference (set1 - set2): " + obj.difference(set1, set2));
    System.out.println("Symmetric Difference: " + obj.symDifference(set1, set2));

  }
}
