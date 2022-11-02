/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

/**
 *
 * @author usert
 */
public class Ifstatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilai = 80;
        int absen = 30;
        
       int lulusNilai = nilai = 75;
       int lulusAbsen = absen = 75;
       
       int lulus = lulusNilai & lulusAbsen;
       
       if (nilai >= 75 & absen <= 75) {
           System.out.println("Selamat Anda Lulus");
       }
       else {
           System.out.println("sialkan coba lagi tahun depan");
       }
       if (nilai >= 80 & absen >= 80){
           System.out.println("Nilai Anda A");
       }
       else if (nilai >= 70 & absen >= 70){
           System.out.println("Nilai Anda B");
       }
       else if (nilai >= 60 & absen >= 60){
           System.out.println("Nilai Anda c");
       }
       else if (nilai >= 50 & absen >= 50){
           System.out.println("Nilai Anda D");
       }
       else{
           System.out.println("Nilai Anda E");
       }
    }
    
}
