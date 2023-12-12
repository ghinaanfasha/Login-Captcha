import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String username = "Ghina";
        String password = "2023";
        String captcha = "A1B2C3";

        Scanner Login = new Scanner(System.in);

        System.out.println("");
        System.out.println("SELAMAT DATANG DI ANFASHA SUPERMARKET");
        System.out.println("======================================");
        System.out.println("Log in");

        // Input username
        System.out.print("Username\t: ");
        String inputUsername = Login.next();

        // Input password
        System.out.print("Password\t: ");
        String inputPassword = Login.next();

        // Apabila username dan password benar
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            // Pesan berhasil login
            System.out.println("");
            System.out.println("Login Berhasil");
            System.out.println("");

            // Input Captcha
            System.out.println("Kode Captcha\t: " + captcha);
            System.out.print("Entry Captcha\t: ");
            String inputCaptcha = Login.next();
            System.out.println("--------------------------------------");

            // Apabila captcha benar
            if (inputCaptcha.equals(captcha)) {
                // Membuat format Date
                Date HariSekarang = new Date();
                SimpleDateFormat day = new SimpleDateFormat("EEEE',' dd/MM/yyyy");
                SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss z");

                // Menampilkan Date
                System.out.println("");
                System.out.println("ANFASHA SUPERMARKET");
                System.out.println("Tanggal\t: " + day.format(HariSekarang));
                System.out.println("Waktu\t: " + time.format(HariSekarang));
                System.out.println("======================================");

                try {
                    // Membuat objek pelanggan dan menampilkan data pelanggan
                    Pelanggan pelanggan = new Pelanggan();
                    pelanggan.inputDataPelanggan();

                    // Membuat objek barang dan menampilkan struk data barang
                    Barang barang = new Barang("M004", "Indomie", 3000);
                    Kasir kasir = new Kasir("Ghina");
                    kasir.cetakStruk(barang);
                }

                // Apabila input jumlah barang tidak berupa angka
                catch (InputMismatchException e) {
                    System.out.println("\n====================================");
                    System.out.println("\nInput Jumlah Barang tidak valid");
                    System.out.println("");
                }

                // Apabila input jumlah barang melebihi kapasitas
                catch (Exception e) {
                    System.out.println("\n====================================");
                    System.out.println("\nInput Jumlah Barang tidak valid");
                    System.out.println("");
                }
            }

            // Apabila captcha salah
            else {
                System.out.println("");
                System.out.println("Entry Captcha Invalid!");
                System.out.println("");
            }
        }

        // Apabila username atau password salah
        else {
            System.out.println("");
            System.out.println("Username atau Password Invalid!");
            System.out.println("");
        }

        // Scanner ditutup
        Login.close();
    }
}
