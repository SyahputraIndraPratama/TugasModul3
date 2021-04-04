package Searching;

import java.util.Scanner;

public class TugasSequential {
    public static void main(String[] args){
        System.out.println(" ***** SEQUENTIAL SEARCH ***** "+"\n" );
        String data[] = {"Galileo", "Archimedes", "Alkhawarizi", "Aljabar", "Nama Mahasiswa", "Tesla"};
        String key;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan data yang dicari : ");
        key = input.nextLine();
        
        System.out.print("isi data adalah : ");
        for (int i = 0; i < data.length; i++){
                  
            System.out.print(data[i] + " ");
        }    
        System.out.println("");
        
        
        for (int i = 0; i<= data.length; i++)  {
            if (key.equalsIgnoreCase(data[i])) {
                System.out.print("Data "+key+" berada pada indeks ke - " + i);
                break;
            }
            
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("Syahputra Indra Pratana");
        System.out.println("2B");
        System.out.println("20090124");
        System.out.println(" ***** Terima kasih ***** ");
    }    
}
