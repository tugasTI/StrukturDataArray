package com.data;
import com.data.Data;

public class Edit{
	public static Data[] run(Data[] data, int N, String qc, String qe){
		Data[] hsl		= new Data[99999];
		int C 			= 0;
		String[] tokc	= qc.split("=");
		String[] toke	= qe.split("=");
		if(tokc[0].equals("kode")){
			C = 0;
			for(int i=0; i<N; i++){
				if(tokc[1].equals(data[i].kodeBarang)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tokc[0].equals("nama")){
			C =0;
			for(int i=0; i<N; i++){
				if(tokc[1].equals(data[i].namaBarang)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tokc[0].equals("dist")){
			C=0;
			for(int i=0; i<N; i++){
				if(tokc[1].equals(data[i].distributor)){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else if(tokc[0].equals("harga")){
			C=0;
			for(int i=0; i<N; i++){
				if(Integer.parseInt(tokc[1]) == data[i].harga){
					hsl[C]	= new Data();
					hsl[C] 	= data[i];
					C++;
				}
			}
		}else{
			System.out.println("Query "+tokc[0]+" salah.");
			return data;
		}

		if(C>0){
			if(C>1)
				System.out.println("Data, "+tokc[0]+" "+tokc[1]+" lebih dari satu. Anda akan mengedit data jamak.");
			if(toke[0].equals("kode")){
				for(int i=0; i<C; i++){
					hsl[i].kodeBarang = toke[1];
				}
			}else if(toke[0].equals("nama")){
				for(int i=0; i<C; i++){
					hsl[i].namaBarang = toke[1];
				}
			}else if(toke[0].equals("dist")){
				for(int i=0; i<C; i++){
					hsl[i].distributor = toke[1];
				}
			}else if(toke[0].equals("harga")){
				for(int i=0; i<C; i++){
					hsl[i].harga = Integer.parseInt(toke[1]);
				}
			}else{
				System.out.println("Query "+toke[0]+" salah.");
				return data;
			}
		}else{
			System.out.println("Maaf, "+tokc[0]+" "+tokc[1]+" tidak dapat ditemukan.");
		}
		System.out.println("Data "+tokc[0]+" "+tokc[1]+" telah diubah pada "+toke[0]+" menjadi "+toke[1]);
		return data;
	}	
}