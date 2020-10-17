/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan3.memasukannilaidarikeyboard;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama      : Mochammad Faishal
 * Kelas     : IF2
 * NIM       : 10119048
 * Deskripsi : Memasukan Nilai dari Keyboard
 */
public class PBOIF210119048Latihan3MemasukanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah :" +nama);
    }
    
}
