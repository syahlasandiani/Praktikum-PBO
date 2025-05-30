/*  Nama File   : MapTest.java
 *  Deskripsi   : Class Map Test
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 8 Mei 2025 */

import java.util.*;
 
public class MapTest {
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemn kunci dan nilai
        map.put (1, "satu");
        map.put(2, "dua");
        map.put (89, "empat");
        map.put (99, "tiga");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        for (Integer i : key){
            System.out.println(i + " " + map.get(i));
        }
    }
}
