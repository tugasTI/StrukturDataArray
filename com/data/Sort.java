package com.data;
import com.data.Data;

public class Sort{
	public static Data[] run(Data[] data, int N, String qs){
		Data newdata = new Data();
		String teksTerkecil="";
		int lokasi=0;
		String[] tok	= qs.split(">");
		int indexTerakhir;
		if(tok[0].equals("kode"))
			if(tok[1].equals("asc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].kodeBarang.compareTo(data[i+1].kodeBarang) > 0){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else if(tok[1].equals("desc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].kodeBarang.compareTo(data[i+1].kodeBarang) < 0){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");

		else if(tok[0].equals("nama"))
			if(tok[1].equals("asc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].namaBarang.compareTo(data[i+1].namaBarang) > 0){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else if(tok[1].equals("desc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].namaBarang.compareTo(data[i+1].namaBarang) < 0){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");
		
		System.out.println("Pengurutan data telah dilakukan, silakan periksa data pada menu tampil.");
		return data;
	}
}