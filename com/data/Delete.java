package com.data;
import com.data.Data;

public class Delete{
	public static int Nd;
	public static Data[] run(Data[] data, int N, int index){
		for(int i = index; i < N-1; i++){
			data[i] = data[i+1];
		}
		N--;
		Nd = N;
		System.out.println("Data urutan ke-"+(index+1)+" telah dihapus.");
		return data;
	}	
}