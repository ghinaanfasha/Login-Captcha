import java.util.Scanner;

public class Pelanggan implements DataPelanggan {
    String namaPelanggan;
    String noHp;
    String alamat;

    Scanner input = new Scanner(System.in);

    @Override
    public void inputDataPelanggan() {
        System.out.println("DATA PELANGGAN");
        System.out.println("--------------");
        System.out.print("Nama Pelanggan\t: ");
        namaPelanggan = input.next();

        System.out.print("No. HP\t\t: ");
        noHp = input.next();

        System.out.print("Alamat\t\t: ");
        alamat = input.next();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }
}
