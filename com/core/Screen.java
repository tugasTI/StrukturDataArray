package com.core;
import java.util.Scanner;

public class Screen{
	public static Scanner scan;
	public static void clear(){
		
		try{
	        final String os = System.getProperty("os.name");

	        if(os.contains("Windows"))
	            Runtime.getRuntime().exec("cls");
	        else{
	        	System.out.print("\033[H\033[2J");
				System.out.flush();
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e){
	        //  Pengecualian dikosongkan
	    }
	}

	public static void pause(){
	scan = new Scanner(System.in);
	boolean pressed = false;
	int entered = 0;
	while(!pressed)
	{
		try{
	        entered=System.in.read();
	    }catch(java.io.IOException e){}
	        if(entered != 0)
	            pressed=true;
	}
}
}
