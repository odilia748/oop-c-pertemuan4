/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] NMA = new String[5];
        
        NMA[0]="Dian";
        NMA[1]="Laura";
        NMA[2]="Vela";
        NMA[3]="Putry";
        NMA[4]="Delvi";
        
        Scanner inp = new Scanner(System.in);
        System.out.println("~~~~~Input Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ) {
            System.out.printf("Data Nama Pengunjung Ke-%d; ", idx+1);
            NMA[idx] = inp.nextLine();
        }
        System.out.println("~~~~~Output Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ) {
           System.out.println("Data Nama Pengunjung Ke-"+(idx+1)+": "+NMA[idx]);
        }
        System.out.println("~~~~~Output2 Data Ke Array~~~~~");
        int no=1;
        for(String isi : NMA){
            System.out.println(no+". "+isi);
            no++;
        }
    }
    
    }
