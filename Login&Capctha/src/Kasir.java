import java.util.Scanner;

//Pengaplikasian Inheritance
public class Kasir extends Pelanggan {
    String namaKasir;

    Scanner scanner = new Scanner(System.in);

    // Construktor
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    // Method untuk menampilakan data barang
    public void cetakStruk(Barang barang) {
        System.out.println("DATA PEMBELIAN BARANG");
        System.out.println("---------------------");
        System.out.println("Kode Barang\t: " + barang.kodeBarang);
        System.out.println("Nama Barang\t: " + barang.namaBarang);
        System.out.println("Harga Barang\t: Rp" + barang.hargaBarang);

        System.out.print("Jumlah Beli\t: ");
        barang.jumlahBeli = scanner.nextInt();
        barang.totalBayar = barang.hargaBarang * barang.jumlahBeli;

        System.out.println("TOTAL BAYAR\t: Rp" + barang.totalBayar);
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kasir\t\t: " + namaKasir);
        System.out.println("");
    }
}
