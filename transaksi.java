import java.util.Scanner;

public class transaksi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan Nomor Faktur: ");
            String invoiceNumber = scanner.next();

            System.out.print("Masukkan Nama Pelanggan: ");
            String customerName = scanner.next();

            System.out.print("Masukkan Nama Barang: ");
            String itemName = scanner.next();

            System.out.print("Masukkan Harga Barang: ");
            double price = scanner.nextDouble();

            System.out.print("Masukkan Jumlah Barang: ");
            int quantity = scanner.nextInt();

          
            faktur invoice = new faktur(invoiceNumber, customerName, itemName, price, quantity);

           
            System.out.println("\nInformasi Transaksi:");
            System.out.println("Nomor Faktur: " + invoice.getInvoiceNumber());
            System.out.println("Nama Pelanggan: " + invoice.getCustomerName());
            System.out.println("Nama Barang: " + invoice.getItemName());
            System.out.println("Harga Barang: " + invoice.getPrice());
            System.out.println("Jumlah Barang: " + invoice.getQuantity());
            System.out.println("Total Bayar: " + invoice.calculateTotal());
        } catch (Exception e) {
            System.err.println("Input tidak valid. Pastikan input sesuai dengan tipe data yang diminta.");
        } finally {
            scanner.close();
        }
    }
}