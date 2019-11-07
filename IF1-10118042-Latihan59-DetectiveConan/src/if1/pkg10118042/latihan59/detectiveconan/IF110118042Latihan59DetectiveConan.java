
package if1.pkg10118042.latihan59.detectiveconan;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk Menampilkan Keterangan Character Detective Conan
 */
public class IF110118042Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainCharacter shinichi = new MainCharacter("Detektif SMA yang Terkenal , namun tubuh nya menjadi kecil karena obat APTX 4869", "Mencari Organisasi yang membuat tubuh nya menjadi kecil","Shinichi Kudo","Tokyo",false);
        MainCharacter conan = new MainCharacter("versi kecil shinichi kudo,sekarang tinggal bersama Ran Mouri dan Ayah nya", "Mencari Organisasi yang membuat tubuh nya menjadi kecil","Conan Edogawa","Tokyo",true);
        MainCharacter ran = new MainCharacter("Teman masa kecil nya Shinichi Kudo,ahli karate, dia tidak tahu bahwa conan adalah shinichi ", "Memenangi kejuaraan karate","Ran Mouri","Tokyo",false);
        MainCharacter kogoro = new MainCharacter("Detektif terkenal dan ayahnya Ran,Menjadi terkenal setelah digunakan conan untuk menyelesaikan kasus", "Ingin Menjadi Kaya","Ran Mouri","Tokyo",false);
        SupportCharacter ayumi = new SupportCharacter("salah satu anggota dari grup detektif cilik, menyukai conan","Ayumi Yoshida","Tokyo",false);
        SupportCharacter genta = new SupportCharacter("salah satu anggota dari grup detektif cilik, hobinya makan  ","Genta Kojima","Tokyo",false);
        SupportCharacter mitsuhiko = new SupportCharacter("salah satu anggota dari grup detektif cilik, bisa diandalkan ","Mitsuhiko Tsuburaya","Tokyo",false);
        SupportCharacter ai = new SupportCharacter("salah satu anggota dari grup detektif cilik ,Pembuat obat APTX 4869 yang membuat tubuh jadi kecil","Haibara Ai / Shiho Miyano (Sherry)","Tokyo",false);
        SupportCharacter agasa = new SupportCharacter("Professor yang suka menciptakan barang aneh","Hiroshi Agasa","Tokyo",true);
        SupportCharacter eri = new SupportCharacter("Pengacara Terkenal dan ibunya ran namun memilih untuk hidup terpisah dengan Kogoro Mouri","Eri Kisaki","Tokyo",true);
        SupportCharacter sonoko = new SupportCharacter("sahabatnya ran dan anak bungsu dari keluarga konglomerat Suzuki","Sonoko Suzuki","Tokyo",false);
        SupportCharacter heiji = new SupportCharacter("detektif SMA yang terkenal dari barat dan rival nya Shinichi,ahli Kendo, dan orang pertama yang berhasil mendeduksi identitas conan","Heiji Hattori","Osaka",false);
        SupportCharacter kazuha = new SupportCharacter("teman masa kecil nya heiji,ahli aikido","Kazuha Toyama","Osaka",false);
        
        shinichi.displayCharacter();
        conan.displayCharacter();
        ran.displayCharacter();
        kogoro.displayCharacter();
        ayumi.displayCharacter();
        genta.displayCharacter();
        mitsuhiko.displayCharacter();
        ai.displayCharacter();
        agasa.displayCharacter();
        eri.displayCharacter();
        sonoko.displayCharacter();
        heiji.displayCharacter();
        kazuha.displayCharacter();
        
    }
    
}
