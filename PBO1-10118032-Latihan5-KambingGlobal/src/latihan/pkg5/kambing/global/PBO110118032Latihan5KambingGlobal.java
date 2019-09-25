/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambing.global;

/**
 *
 * @author 
 * NAMA  : Guntur Maulana Ibrahim
 * Kelas : PBO1
 * NIM   : 10118032
 * Deskripsi Program : Program ini berisi untuk menampilkan Kambing yang sudah ditambkan
 */
public class PBO110118032Latihan5KambingGlobal {
    
    // Var jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
     public void getJumlahKambing(){
         System.out.println("Jumlah Kambing: " +jumlahKambing);
        
     }
     
     public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
         System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
     }
    public static void main(String[] args) {
        PBO110118032Latihan5KambingGlobal kambingSusu = new PBO110118032Latihan5KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
