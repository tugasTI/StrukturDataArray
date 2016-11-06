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

    //input data
    Input in   = new Input();

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
          System.out.print("**DATA BARANG KELONTONG**");
          scan.nextLine();
          do{
            data[N] = new Data();
            System.out.println("Input Data Ke-"+(N+1)+" :");
            data[N].kodeBarang  = in.kode();
            data[N].namaBarang  = in.nama();
            data[N].distributor = in.dist();
            data[N].harga       = in.harga();
            System.out.print("Masukkan data lagi? (y/t) ");
            ulang = scan.next().charAt(0);
            scan.nextLine();
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
                        scan.nextLine();
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
                        scan.nextLine();
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
                        scan.nextLine();
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 6:
                break;
              default:
                error.salahMenu(pil.submenu);
                scan.nextLine();
            }
          }while(pil.submenu != 6);
          break;
        case 3: // 3. Menambah Data
          do{
            pil.menuTambah();
            switch(pil.submenu){
              case 1: // 3.1 Depan
                do{
                    switch(pil.subsubmenu){
                      case 1:break;
                      case 2:break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                        scan.nextLine();
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 2: // 3.2 Tengah
                do{
                    switch(pil.subsubmenu){
                      case 1:break;
                      case 2:break;
                      default:
                        error.salahMenu(pil.subsubmenu);
                        scan.nextLine();
                    }
                }while(pil.subsubmenu != 3);
                break;
              case 3: // 3.3 Belakang
                System.out.println(N);
                data[N+1]             = new Data();
                data[N+1].kodeBarang  = in.kode();
                data[N+1].namaBarang  = in.nama();
                data[N+1].distributor = in.dist();
                data[N+1].harga       = in.harga();

                System.out.println(data[N+1].kodeBarang);
                System.out.println(data[N+1].namaBarang);
                System.out.println(data[N+1].distributor);
                System.out.println(data[N+1].harga);
                break;
              case 4:
                break;
              default:
                error.salahMenu(pil.submenu);
                scan.nextLine();
            }
          }while(pil.submenu != 4);
          break;
        case 4: // 4. Mencari Data
        case 5: // 5. Mengedit Data
        case 6: // 6. Menghapus Data
        case 7: // 7. Mengurutkan Data
        case 8: // 8. Keluar
          System.out.println("Program selesai.");
          System.exit(0);
        default:
        error.salahMenu(pil.menu);
        scan.nextLine();

      }
    }while(pil.menu != 8);
  }
}
