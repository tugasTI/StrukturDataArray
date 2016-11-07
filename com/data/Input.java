package com.data;
import com.data.Data;
import java.util.Scanner;

public class Input{
	public static Scanner scan = new Scanner(System.in);
	public static String kode(){
		System.out.print("Kode Barang : ");
		return scan.next();
	}
	
	public static String nama(){
		System.out.print("Nama Barang : ");
		return scan.next();
	}

	public static String dist(){
		System.out.print("Distributor : ");
		return scan.next();
	}
	
	public static long harga(){
		long harga;
		System.out.print("Harga (Rp)  : ");
		return scan.nextLong();
	}
}