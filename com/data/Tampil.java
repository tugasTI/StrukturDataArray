package com.data;

import com.data.Data;
import com.core.Screen;

public class Tampil{
  public static int jumlahBarang;
  public static String enter;
  public static java.util.Scanner scan = new java.util.Scanner(System.in);

  public static void semua(Data[] data, int N){
    Screen screen = new Screen();
    screen.clear();
    int total = 0;
    System.out.println("===========================================================================");
    System.out.println("NO\tKode Barang\tNama Barang\tDistributor\t\tHarga");
    System.out.println("---------------------------------------------------------------------------");
    for(int i=0; i < N; i++){
      System.out.println((i+1)+"\t"+data[i].kodeBarang+"\t\t"+data[i].namaBarang+"\t\t"+data[i].distributor+"\t\t"+data[i].harga);
      total++;
    }
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);
    enter = scan.nextLine();
  }

  //KODE BARANG
  public static void kodeSemua(Data[] data, int N){
    Screen screen = new Screen();
    screen.clear();
    int total = 0;
    System.out.println("=======================");
    System.out.println("NO\tKode Barang");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      System.out.println((i+1)+"\t"+data[i].kodeBarang);
      total++;
    }
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);
    enter = scan.nextLine();
  }
  public static void kodeTertentu(Data[] data, int N, String kode){
    Screen screen = new Screen();
    screen.clear();

    int total = 0;

    System.out.println("=======================");
    System.out.println("Kode Barang");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      if(data[i].kodeBarang.equals(kode)){
        total++;
      }
    }
    System.out.println(kode);
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);

    enter = scan.nextLine();
  }

  // NAMA BARANG
  public static void namaSemua(Data[] data, int N){
    Screen screen = new Screen();
    screen.clear();
    int total = 0;
    System.out.println("=======================");
    System.out.println("NO\tNama Barang");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      System.out.println((i+1)+"\t"+data[i].namaBarang);
      total++;
    }
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);
    enter = scan.nextLine();
  }
  public static void namaTertentu(Data[] data, int N, String nama){
    Screen screen = new Screen();
    screen.clear();

    int total = 0;

    System.out.println("=======================");
    System.out.println("Nama Barang");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      if(data[i].namaBarang.equals(nama)){
        total++;
      }
    }
    System.out.println(nama);
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);

    enter = scan.nextLine();
  }

  // DISTRIBUTOR
  public static void distSemua(Data[] data, int N){
    Screen screen = new Screen();
    screen.clear();
    int total = 0;
    System.out.println("=======================");
    System.out.println("NO\tDistributor");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      System.out.println((i+1)+"\t"+data[i].distributor);
      total++;
    }
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);
    enter = scan.nextLine();
  }
  public static void distTertentu(Data[] data, int N, String dist){
    Screen screen = new Screen();
    screen.clear();

    int total = 0;

    System.out.println("=======================");
    System.out.println("Distributor");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      if(data[i].distributor.equals(dist)){
        total++;
      }
    }
    System.out.println(dist);
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);

    enter = scan.nextLine();
  }

  // HARGA
  public static void hargaSemua(Data[] data, int N){
    Screen screen = new Screen();
    screen.clear();
    int total = 0;
    System.out.println("=======================");
    System.out.println("Kode\tHarga");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      System.out.println(data[i].kodeBarang+"\t"+data[i].harga);
      total++;
    }
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);
    enter = scan.nextLine();
  }
  public static void hargaTertentu(Data[] data, int N, int harga){
    Screen screen = new Screen();
    screen.clear();

    int total = 0;

    System.out.println("=======================");
    System.out.println("Harga");
    System.out.println("-----------------------");
    for(int i = 0; i < N; i++){
      if(data[i].harga==harga){
        total++;
      }
    }
    System.out.println(harga);
    System.out.println("-----------------------");
    System.out.println("Total\t\t: "+total);

    enter = scan.nextLine();
  }
}
