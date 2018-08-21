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
public class Tes {
 int kelas [][] = {{10}, {11}, {12}};
     String jurusan [][] = {{"RPL"}, {"TKJ"}}; 
     public void tampil(String n) {
         System.out.println("Identitas Siswa SMK Moklet");
     }
     public void jurusankelas (int n) {
         for (int i = 0; i < 1; i++) {
             for (int j = 0; j < 1; j++) {
                 System.out.println(kelas[2][i] + " : " + jurusan [0][j]);
             }
         }
     }
     public static void main(String[] args) {
        Tes siswa = new Tes();
        siswa.tampil(null);
        siswa.jurusankelas(0);
    }
}
