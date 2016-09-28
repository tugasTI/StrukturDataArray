package com.core;

import com.core.*;
import com.data.*;
import java.util.Scanner;

public class App{
  public static int N = 0;
  public static void start(){
    //scanner
    Scanner scan = new Scanner(System.in);

    //buat data
    Data[] data = new Data[99999];

    //membuat pilihan
    Menu pil = new Menu();

    //tampil data
    Tampil tampil = new Tampil();

    do{
      //aktifkan pilihan
      pil.on();

      //pilihan no 1
      switch(pil.yes){
        case 1:
          char ulang;
          N=0;
          do{
            data[N] = new Data();

            System.out.print("Nama Barang : "); data[N].namaBarang = scan.next();
            System.out.print("Kode Barang : "); data[N].kodeBarang = scan.next();
            System.out.print("Distributor : "); data[N].distributor= scan.next();
            System.out.print("Harga (Rp)  : "); data[N].harga      = scan.nextLong();


            System.out.print("Masukkan data lagi? (y/t) ");
            ulang = scan.next().charAt(0);
            N++;
          }while(ulang == 'y');
          break;
        case 2:
          tampil.semua(data, N);
          break;
        case 8:
          System.exit(0);
        default:
          System.out.println("Menu tidak tersedia.");
      }
    }while(pil.yes != 8);
  }
}
