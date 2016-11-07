package com.data;

import com.data.Data;
import java.util.Scanner;

public class Cari{
	public static int C;
	public static void run(Data[] data, String q, int N){
		Scanner scan 	= new Scanner(System.in);
		Data[] hsl 		= new Data[99999];
		String[] tok = q.split("=");
		if(tok[0].equals("kode")){
			C = 0;
			for(int i=0; i<N; i++){
				if(tok[1].equals(data[i].kodeBarang)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tok[0].equals("nama")){
			C =0;
			for(int i=0; i<N; i++){
				if(tok[1].equals(data[i].namaBarang)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tok[0].equals("dist")){
			C=0;
			for(int i=0; i<N; i++){
				if(tok[1].equals(data[i].distributor)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tok[0].equals("harga")){
			C=0;
			for(int i=0; i<N; i++){
				if(Integer.parseInt(tok[1]) == data[i].harga){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}

		if(C>0){
			for(int i=0; i<C; i++){
				System.out.println((i+1)+"\t"+hsl[i].kodeBarang+"\t\t"+hsl[i].namaBarang+"\t\t"+hsl[i].distributor+"\t\t"+hsl[i].harga);
			}
		}else{
			System.out.println("Maaf, "+tok[0]+" "+tok[1]+" tidak dapat ditemukan.");
		}
	}
}