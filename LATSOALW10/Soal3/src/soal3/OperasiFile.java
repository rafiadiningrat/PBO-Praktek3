/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

/**
 *
 * @author DELL
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class OperasiFile {
    public static void main(String[] args) {
        File file = new File("C://10//praktikum//filepbo.txt");
        try{
            // Following file does not exist
            FileReader fr = new FileReader(file);
            System.out.println("File ditemukan!");
        } 
        catch (FileNotFoundException e) {
           System.out.println("File tidak ditemukan!");
        }
    }
}
