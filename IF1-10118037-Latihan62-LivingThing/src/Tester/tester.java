/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menampilkan kegiatan manusia sehari-hari
 */
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human manusia = new Human();
        manusia.setNama("Muhammad Ihsan");
        manusia.walk(manusia.getNama());
        manusia.breath(manusia.getNama());
        manusia.eat(manusia.getNama());
    }
    
}
