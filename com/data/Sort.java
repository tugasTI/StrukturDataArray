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
			else{
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");
				return data;
			}

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
			else{
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");
				return data;
			}

		else if(tok[0].equals("dist"))
			if(tok[1].equals("asc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].distributor.compareTo(data[i+1].distributor) > 0){
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
						if(data[i].distributor.compareTo(data[i+1].distributor) < 0){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else{
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");
				return data;
			}
		
		else if(tok[0].equals("harga"))
			if(tok[1].equals("asc")){
				indexTerakhir = N-1;
				for(int j=0; j<=indexTerakhir-1;j++){
					for(int i=0; i<=indexTerakhir-1-j; i++){
						if(data[i].harga > data[i+1].harga){
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
						if(data[i].harga < data[i+1].harga){
							newdata = data[i];
							data[i]	= data[i+1];
							data[i+1]	= newdata;
						}
					}
				}
			}
			else{
				System.out.println("Maaf, pengurutan jenis "+tok[1]+" tidak tersedia.");
				return data;
			}

		else{
			System.out.println("Maaf, jenis data "+tok[0]+" tidak tersedia.");
			return data;
		}
		System.out.println("Pengurutan data telah dilakukan, silakan periksa data pada menu tampil.");
		return data;
	}
}