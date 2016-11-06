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

    //Membuat error
    Error error = new Error();

    //Pengaturan layar
    Screen screen = new Screen();

    //tampil data
    Tampil tampil = new Tampil();

    do{
      //bersihkan layar
      screen.clear();

      //aktifkan pilihan
      pil.on();

      switch(pil.menu){
        case 1: //1. Input Data
          screen.clear();
          char ulang;
          N=0;
          System.out.println("**DATA BARANG KELONTONG**");
          do{
            System.out.println("Input Data Ke-"+(N+1)+" :");

            data[N] = new Data();

            System.out.print("Kode Barang : "); data[N].kodeBarang = scan.nextLine();
            System.out.print("Nama Barang : "); data[N].namaBarang = scan.nextLine();
            System.out.print("Distributor : "); data[N].distributor= scan.nextLine();
            System.out.print("Harga (Rp)  : "); data[N].harga      = scan.nextLong();


            System.out.print("Masukkan data lagi? (y/t) ");
            ulang = scan.next().charAt(0);
            N++;
          }while(ulang == 'y');
          break;
        case 2: //2. Tampilkan Data
          do{
            pil.menuTampil();
            switch(pil.submenu){
              case 1: // 2.1 Semua
                tampil.semua(data, N);
                break;
              case 2: // 2.2 Kode
                do{
                    pil.menuTampilKode();
                    switch(pil.subsubmenu){
                      case 1:
                        tampil.kodeSemua(data, N);
                        break;
                      case 2:
                        pil.menuTampilKodeTertentu();
                        tampil.kodeTertentu(data, N, pil.kodeBarangTertentu);
                        break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 3: // 2.3 Nama
                do{
                    pil.menuTampilNama();
                    switch(pil.subsubmenu){
                      case 1:
                        tampil.namaSemua(data, N);
                        break;
                      case 2:
                        pil.menuTampilNamaTertentu();
                        tampil.namaTertentu(data, N, pil.kodeBarangTertentu);
                        break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 4:
                do{
                    pil.menuTampilDist();
                    switch(pil.subsubmenu){
                      case 1:
                        tampil.distSemua(data, N);
                        break;
                      case 2:
                        pil.menuTampilDistTertentu();
                        tampil.distTertentu(data, N, pil.kodeBarangTertentu);
                        break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 5:
                do{
                    pil.menuTampilHarga();
                    switch(pil.subsubmenu){
                      case 1:
                        tampil.hargaSemua(data, N);
                        break;
                      case 2:
                        pil.menuTampilHargaTertentu();
                        tampil.hargaTertentu(data, N, pil.hargaTertentu);
                        break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 6:
                break;
              default:

            }
          }while(pil.submenu != 6);
          break;
        case 3: // 3. Menambah Data
        case 4: // 4. Mencari Data
        case 5: // 5. Mengedit Data
        case 6: // 6. Menghapus Data
        case 7: // 7. Mengurutkan Data
        case 8: // 8. Keluar
          System.exit(0);
        default:
        error.salahMenu(pil.menu);
      }
    }while(pil.menu != 8);
  }
}
