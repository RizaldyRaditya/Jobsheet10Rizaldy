/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayMultiDimensi;

/**
 *
 * @author Rudi Erwanto
 */
public class Array3 {
     int nis [][] = {{210651}, {210651}, {210652}};
     String nama [][] = {{"Rizaldy"}, {"Raditya"}, {"Erwanto"}};
     public void tampil(String n) {
         System.out.println("Identitas Siswa Angkatan 27");
     }
     public void namanis (int n) {
         for (int i = 0; i < 1; i++) {
             for (int j = 0; j < 1; j++) {
                 System.out.println(nama[1][i] + " : " + nis [1][j]);
             }
         }
     }
     public static void main(String[] args) {
        Array3 siswa = new Array3();
        siswa.tampil(null);
        siswa.namanis(0);
    }
}
