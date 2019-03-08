package toyLabs;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore ts = new ToyStore();
		ts.loadToys("jenga jenga cards hotwheel jenga hotwheel");
		System.out.println(ts.toString());
		

	}
}