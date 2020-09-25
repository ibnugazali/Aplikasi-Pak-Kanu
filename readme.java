/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author bintu
 */
import java.util.Scanner;
public class test_java {
     public static void main (String[] args){
       String nim,nama,huruf="",ket="";
        int imk=0,jmk=0, jnilai=0,jsks=0;
        double total_nilai,bobot=0 ,total_bobot=0, hasil_akhir=0;
        String matkul[]=new String[10];
        int matsks[]=new int[10];
   //     int nilai[]=new int[10];
        int absensi[]= new int[10];
        int uts[]=new int[10] ;
        int tugas[]=new int[10];
        int uas[]=new int[10];
        String sLagi;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("--------------MULAI--------------");
        System.out.println("###PEMROGRAMAN VISUAL###");
        System.out.println("###   REVIED JAVA   ###");
        System.out.println("#Program Kartu Hasil Studi#");
        System.out.println("----------  INPUT  ----------");
        System.out.print("NIM : "); nim = keyboard.nextLine();
        System.out.print("Nama : "); nama = keyboard.nextLine();
        
        do {
            jmk++;
            System.out.print("Mata Kuliah #" + jmk + " : "); matkul[imk] = keyboard.nextLine();
            System.out.print("SKS : "); matsks[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Masukan Nilai Absensi (10%) : "); absensi[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Masukan Nilai Tugas (20%) : "); tugas[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Masukan UTS (30%) : "); uts[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Masukan UAS (40%): "); uas[imk] = Integer.parseInt(keyboard.nextLine());
            System.out.print("Input Lagi (y/t? "); sLagi = keyboard.nextLine();
            imk++;
            
              
        } while (sLagi.equals("y"));
        
        System.out.println("---------Hasil----------");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama );
        System.out.println("---------Daftar Nilai--------");
        System.out.println("No\t MK\t SKS\t huruf\t bobot\t ket ");
        System.out.println("-----------------------------");
         
        
        
        for (imk=0; imk<jmk; imk++){
            
            total_nilai = (absensi[imk] * 0.1) + (tugas[imk] * 0.2)+ (uts[imk]* 0.3) + (uas[imk]*0.4);
            if (total_nilai > 81){
                huruf ="A" ; bobot = 4; ket="LULUS";
            } else if  (total_nilai <= 81  && total_nilai > 76) {
                huruf ="A-"; bobot= 3.75; ket="LULUS";
            } else if (total_nilai <= 76 && total_nilai > 71){
                huruf ="B+"; bobot= 3.50; ket="LULUS";
            } else if (total_nilai <= 71  &&  total_nilai > 65){
                huruf = "B"; bobot =3.25; ket="LULUS";
            } else if  (total_nilai <= 65 && total_nilai > 60) {
                huruf ="B-"; bobot = 3.00; ket="LULUS";
            } else if (total_nilai <= 60 && total_nilai > 51){
                huruf ="C"; bobot = 2.75; ket="LULUS";
            } else if (total_nilai <= 51){
                huruf = "C-"; bobot = 2.50 ; ket=" Tidak LULUS";
            }
             
              total_bobot = bobot + total_bobot;
              jsks = jsks + matsks[imk];
              hasil_akhir = total_bobot / jsks ;
           // jnilai = jnilai[imk]*matsks[imk];
            
            System.out.println(imk+1 + "\t" + matkul[imk]+ "\t" + matsks[imk] + "\t" + huruf +"\t" + bobot +"\t" + ket);
        } 
       
        System.out.println("-------------------------------");
        System.out.println("Jumlah :" + "\t"+ jsks +"\t"  +"\t" + total_bobot);
        //System.out.println("total bobot = " + total_bobot);
        System.out.println("IP Semester : " + hasil_akhir);
        
        System.out.println("-----------SELESAI--------------");
    }
}
