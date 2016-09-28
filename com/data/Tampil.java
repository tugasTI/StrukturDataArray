package com.data;
import com.data.Data;
public class Tampil{
  public static void semua(Data[] data, int N){
    System.out.println("================================================================");
    System.out.println("NO\tNama Barang\tKode Barang\tDistributor\tHarga");
    System.out.println("----------------------------------------------------------------");
    for(int i=0; i < N; i++){
      System.out.println((i+1)+"\t"+data[i].namaBarang+"\t\t"+data[i].kodeBarang+"\t\t"+data[i].distributor+"\t\t"+data[i].harga);
    }
  }
}
