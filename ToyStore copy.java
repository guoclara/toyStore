package toyLabs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String str[] = toys.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		
		boolean in = false;
		
		for(int i = 0; i<str.length; i++) {
			list.add(str[i]);
		}
		for(int n = 0; n<list.size(); n++) { //cycle through list items
			for(int x = 0; x<toyList.size(); x++) { //check each list item to see if in toyList already
				if(list.get(n).equals(toyList.get(x).getName())) {
					toyList.get(x).setCount(toyList.get(x).getCount()+1); //increase count if in toyList
					in = true;
				}
			}
			if(!in) {
				toyList.add(new Toy(list.get(n), 1));}
				in = false;
			
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy t: toyList) {
  			if(t.getName().equals(nm)){
  				return t;
  			
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{

  		int max = 0;
  		int ind = 0;
  		for(int i = 0; i<toyList.size(); i++) {
  			if(toyList.get(i).getCount()>max) {
  				max = toyList.get(i).getCount();
  				ind = i;
  			}
  		}
  		return toyList.get(ind).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp;
  		for(int i = 1; i< toyList.size(); i++) {
  			if(toyList.get(i).getCount()>toyList.get(i-1).getCount()) {
  				temp = toyList.get(i-1);
  				toyList.set(i-1, toyList.get(i));
  				toyList.set(i, temp);
  			}
  		}
  	}  
  	  
	public String toString()
	{
		String str = "The store has ";
	   for(Toy t: toyList) {
		   str+= t.getCount()+" "+t.getName()+"(s) ";
	   }
	   return str;
	}

}