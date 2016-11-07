package com.data;
import com.data.Data;
import com.data.Input;
import java.util.Scanner;

public class Tambah{
	public static Data insert(){
		Input in 		 = new Input();
        Data data 		 = new Data();
	    data.kodeBarang  = in.kode();
	    data.namaBarang  = in.nama();
	    data.distributor = in.dist();
	    data.harga       = in.harga();
	    return data;
	}

	public static Data depan(){
	    System.out.println("**DATA BARANG KELONTONG**");
	    System.out.println("Menu 3.1 (Menambah Data di Depan) :");
	    return insert();
	}

	public static Data tengah(){
	    System.out.println("**DATA BARANG KELONTONG**");
	    System.out.println("Menu 3.1 (Menambah Data di Tengah) :");
	    return insert();
	}

	public static Data belakang(){
	    System.out.println("**DATA BARANG KELONTONG**");
	    System.out.println("Menu 3.3 (Menambah Data di Belakang) :");
	    return insert();
	}
}