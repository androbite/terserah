public class tesException {

    public static void main(String[] args) {
        // TODO code application logic here
    Barang obj = new Barang();
           
    obj.setKode(null);
    obj.setNama("Penghapus");
     
    System.out.println("\nKode : " + obj.getKode());
    System.out.println("Nama   : " + obj.getNama());
   

    }
    
}
