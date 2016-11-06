package com.core;

import com.core.Screen;

public class Menu{
  public static int menu;
  public static int submenu;
  public static int subsubmenu;
  public static String kodeBarangTertentu;
  public static int hargaTertentu;

  public static void on(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Silakan pilih menu :");
    System.out.println("1. Memasukkan data");
    System.out.println("2. Menampilkan Data");
    System.out.println("3. Menambah data (...)");
    System.out.println("4. Mencari data");
    System.out.println("5. Mengedit data");
    System.out.println("6. Menghapus data");
    System.out.println("7. Mengurutkan Data (...)");
    System.out.println("8. Keluar");
    System.out.print("Pilihan Anda (1-8) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    menu = scan.nextInt();
  }
  public static void menuTampil(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2 (Menampilkan Data) :");
    System.out.println("1. Semua ");
    System.out.println("2. Kode");
    System.out.println("3. Nama");
    System.out.println("4. Distributor");
    System.out.println("5. Harga");
    System.out.println("6. Kembali");
    System.out.print("Pilihan Anda (1-6) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    submenu = scan.nextInt();
  }

  // Kode
  public static void menuTampilKode(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.2 (Menampilkan Data Kode Barang) :");
    System.out.println("1. Semua ");
    System.out.println("2. Kode tertentu");
    System.out.println("3. Kembali");
    System.out.print("Pilihan Anda (1-3) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    subsubmenu = scan.nextInt();
  }
  public static void menuTampilKodeTertentu(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.2.2 (Menampilkan Data Kode Barang Tertentu) :");
    System.out.print("Masukkan Kode Barang : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    kodeBarangTertentu = scan.next();
  }

  // Nama
  public static void menuTampilNama(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.3 (Menampilkan Data Nama Barang) :");
    System.out.println("1. Semua ");
    System.out.println("2. Nama tertentu");
    System.out.println("3. Kembali");
    System.out.print("Pilihan Anda (1-3) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    subsubmenu = scan.nextInt();
  }
  public static void menuTampilNamaTertentu(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.3.2 (Menampilkan Data Nama Barang Tertentu) :");
    System.out.print("Masukkan Nama Barang : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    kodeBarangTertentu = scan.next();
  }

  // Distributor
  public static void menuTampilDist(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.4 (Menampilkan Data Distributor Barang) :");
    System.out.println("1. Semua ");
    System.out.println("2. Distributor tertentu");
    System.out.println("3. Kembali");
    System.out.print("Pilihan Anda (1-3) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    subsubmenu = scan.nextInt();
  }
  public static void menuTampilDistTertentu(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.4.2 (Menampilkan Data Distributor Barang Tertentu) :");
    System.out.print("Masukkan Nama Distributor : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    kodeBarangTertentu = scan.next();
  }

  // Harga
  public static void menuTampilHarga(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.5 (Menampilkan Data Harga Barang) :");
    System.out.println("1. Semua ");
    System.out.println("2. Harga tertentu");
    System.out.println("3. Kembali");
    System.out.print("Pilihan Anda (1-3) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    subsubmenu = scan.nextInt();
  }
  public static void menuTampilHargaTertentu(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 2.5.2 (Menampilkan Data Harga Barang Tertentu) :");
    System.out.print("Masukkan Harga Barang : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    hargaTertentu = scan.nextInt();
  }

  // Menu Tambah
  public static void menuTambah(){
    Screen screen = new Screen();
    screen.clear();

    System.out.println("**DATA BARANG KELONTONG**");
    System.out.println("Menu 3 (Menambah Data) :");
    System.out.println("1. Di Depan ");
    System.out.println("2. Di Tengah");
    System.out.println("3. Di Belakang");
    System.out.println("4. Kembali");
    System.out.print("Pilihan Anda (1-4) : ");
    java.util.Scanner scan = new java.util.Scanner(System.in);
    submenu = scan.nextInt();
  }
}
