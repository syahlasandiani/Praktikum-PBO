/*  Nama File   : ExceptionOnArray.java
 *  Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 06 Maret 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } 
        catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } 
        finally {
            System.out.println("clean up code...");
        }
    }
}
