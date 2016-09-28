package com.core;

public class Menu{
  public static int yes;
  public static void on(){
    System.out.println("**DATA BATANG KELONTONG**");
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
    yes = scan.nextInt();
  }
}
