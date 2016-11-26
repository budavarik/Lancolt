package tusi.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import tusi.com.Node; ;


public class Main {

	static Node nodeRoot = new Node();
	
	
	public static void main(String[] args) {
	    
	    InputStreamReader in=new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(in);
	    String a = "";
	    nodeRoot = null;
	    	    
	    System.out.println("f - insert new first tag");
	    System.out.println("n - insert new last tag");
	    System.out.println("d - delete tag from position");
	    System.out.println("v - delete value");
	    System.out.println("l - lqist tags");
	    System.out.println("q - quit");
	    System.out.println("");
	    
	    try {
	    	while (!(a=br.readLine()).equals("q")) {
	    		if (a.equals("f")) {
	    			System.out.print(" Mennyit irjunk bele? ");
	    			firstInsert (Integer.valueOf(br.readLine()));	    			
	    		}
	    		if (a.equals("n"))  {
	    			System.out.print(" Mennyit irjunk bele? ");
	    			lastInsert (Integer.valueOf(br.readLine()));	    			
	    		}
	    		if (a.equals("v"))  {
	    			System.out.print(" Melyik értéket töröljem? ");
	    			deleteValue (Integer.valueOf(br.readLine()));	    			
	    		}
	    		
	    		if (a.equals("l")) list ();
	    		
	    		
	    	}	    	
    	}
	    catch(Exception e){}		
	}
	
	public static void firstInsert (int ujertek) {
		Node ujElem = new Node();
		ujElem.value = ujertek;
		ujElem.nextValue = nodeRoot;
		nodeRoot = ujElem;		
	}
	
	public static void lastInsert (int ujertek) {
		Node elem = nodeRoot;
		do {
			elem = elem.nextValue;
		} while (elem.nextValue != null);
		
	
		Node ujElem = new Node();
		elem.nextValue = ujElem ;
		ujElem.value = ujertek;
		ujElem.nextValue = null;
		
	}
	
	public static boolean deleteValue (int delValue) {
		Node elem = nodeRoot;
		Node lastElem = nodeRoot ; 
		Node nextElem = nodeRoot;
		boolean megvan = false;
		//ha az elsõt kell törölni, akkor végig kell menni minden elemen
		if (elem.value == delValue) {
			megvan = true ;
			do {
				elem.value = elem.nextValue.value ;
				elem.nextValue = elem.nextValue.nextValue;
				elem = elem.nextValue;
			} while (elem.nextValue.nextValue != null);
		}
		
		//ha nem az elsõ, akkor elég átírni egy helyen
		do {
			lastElem = elem ;
			if (elem.nextValue.value == delValue) {
				lastElem.nextValue = elem.nextValue.nextValue ;
				megvan = true;
			} else {
				elem = elem.nextValue;
			}
		} while ((elem.nextValue != null) && !(megvan));
		return megvan;
	}
	
	public static void list () {
		Node elem = nodeRoot;
		do {
			System.out.print(elem.value+", ");
			elem = elem.nextValue;
		} while (elem.nextValue != null);
		System.out.print(elem.value+", ");		
	}
	
	
}
