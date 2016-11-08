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

    // tambah data
    Tambah add  = new Tambah();

    // cari data
    Cari cari   = new Cari();

    // edit data
    Edit edit   = new Edit();

    // delete data
    Delete hapus  = new Delete();

    // pengurutan data
    Sort urutbukanpijat   = new Sort();

    do{
      //bersihkan layar
      screen.clear();

      //aktifkan pilihan
      pil.on();

      switch(pil.menu){
        case 1: //1. Input Data
          screen.clear();
          char ulang;
          System.out.println("**DATA BARANG KELONTONG**");
          do{
            data[N] = new Data();
            System.out.println("Input Data Ke-"+(N+1)+" :");
            data[N].kodeBarang  = in.kode();
            data[N].namaBarang  = in.nama();
            data[N].distributor = in.dist();
            data[N].harga       = in.harga();
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
                        scan.nextLine();
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
                data[N]   = new Data();
                for(int i = N-1; i >= 0; i--){
                  data[i+1] = data[i];
                }
                data[0]  = add.depan();
                N++;
                break;
              case 2: // 3.2 Tengah
                data[N]   = new Data();
                System.out.print("Masukkan data pada urutan ke: ");
                int posisi = scan.nextInt();
                for (int i=posisi-1; i<N; i++) {
                  data[i+1] = data[i];
                }
                data[posisi-1]  = add.tengah();
                N++;
                break;
              case 3: // 3.3 Belakang
                data[N]   = new Data();
                data[N]   = add.belakang();
                N++;
                break;
              case 4:
                break;
              default:
                error.salahMenu(pil.submenu);
            }
          }while(pil.submenu != 4);
          break;
        case 4: // 4. Mencari Data
          String q;
          System.out.print("Query pencarian (mis: kode=123): ");
          q   = scan.next();
          cari.run(data, q, N);
          screen.pause();
          break;
        case 5: // 5. Mengedit Data
          String qc;
          String qe;
          System.out.print("Cari data yang akan diedit (mis: kode=123): ");
          qc  = scan.next();
          System.out.print("Query data yang diedit (mis: kode=123)    : ");
          qe  = scan.next();
          edit.run(data, N, qc, qe);
          screen.pause();
          break;
        case 6: // 6. Menghapus Data
          int index;
          System.out.print("Masukkan urutan data yang akan dihapus : ");
          index  = scan.nextInt() - 1;
          data = hapus.run(data, N, index);
          N = hapus.Nd;
          screen.pause();
          break;
        case 7: // 7. Mengurutkan Data
          String qs;
          System.out.print("Query pengurutan (mis: kode>asc)    : ");
          qs = scan.next();
          data = urutbukanpijat.run(data, N, qs);
          screen.pause();
          break;
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
