/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author DELL
 */
import java.io.FileReader;
    import java.util.ArrayList;
    import com.google.gson.Gson;
    import com.google.gson.JsonIOException;
    import com.google.gson.JsonSyntaxException;
    import com.google.gson.reflect.TypeToken;
    import java.io.FileNotFoundException;

public class JsonToObj {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            ArrayList<Barang> produk = gson.fromJson(
              new FileReader("D:\\bacup desktop\\PBO\\PBO-Praktek3\\LATSOALW12\\JavaCollections\\src\\javacollections\\barang.json"), 
              new TypeToken<ArrayList<Barang>>() {}.getType()
            );
            for(int i=0;i<produk.size();i++){
                System.out.println("Barang ke- "+(i+1)+": "+produk.get(i).toString());
            }
        }catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
