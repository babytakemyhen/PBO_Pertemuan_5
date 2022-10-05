import java.util.Scanner;

public class TP_5 {

public class Segitiga {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

public class Lingkaran {
    private int r;
    public void setJariJari(int r) {
        this.r = r;
    }

    public double hitungLuas() {
        double luas;
        double phi = 3.14;
        luas = phi*r*r;
        return luas;
    }
}

public class LuasSegitigaDanLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Segitiga segitiga = new Segitiga();

        System.out.println("Masukan alas segitiga: ");
        segitiga.setAlas(sc.nextInt());

        System.out.println("Masukan tinggi segitiga: ");
        segitiga.setTinggi(sc.nextInt());

        System.out.println("Luas segitiga: " + segitiga.hitungLuas());

        Lingkaran lingkaran = new Lingkaran();

        System.out.println("Masukan jari-jari lingkaran: ");
        lingkaran.setJariJari(sc.nextInt());

        System.out.printf("Luas lingkaran: ", lingkaran.hitungLuas());
        sc.close();
    }
 }
}
