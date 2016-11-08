# TUGAS STRUKTUR DATA
Tugas struktur data semester III, tema barang kelontong.
Membuat program komputer untuk memanajemen data pada suatu domain.

## Kompilasi
1. Masuk pada direktori utama (terdapat file Main.java dan Main.class)
2. Buka CMD/terminal dan masuk ke direktori utama, kemudian ketikkan:
    a. javac com/data/*.java
    b. javac com/core/*.java
    c. javac Main.java
3. Atau dengan menginstal "make", kemudian ketikkan "make all"

## Running
1. Masuk pada direktori utama (terdapat file Main.java dan Main.class)
2. Buka CMD/terminal dan masuk ke direktori utama, kemudian ketikkan:
    java Main
    
## Penggunaan
1. Pastikan melakukan input data ketika pertama kali running program.
2. Query pencarian dan edit data:

    ### Penggunaan:

        <nama field>=<nilai yang dicari>
   
    ### Mis:

      kode=abc
      
      nama=ember
      
    ### Nama Field:
    
      kode    Mencari berdasarkan kode
      
      nama    Mencari berdasarkan nama
      
      dist    Mencari berdasarkan distributor
      
      harga   Mencari berdasarkan harga
      
3. Query urutkan data:

    ### Penggunaan:
        
        <nama field>><jenis pengurutan>
      
    ### Mis:
    
      kode>asc
      
      nama>desc
      
    ### Nama Field:
    
      Sama dengan field yang ada pada pencarian
