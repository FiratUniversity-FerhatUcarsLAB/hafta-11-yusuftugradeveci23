//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:29.11.2025
//Açıklama: Bu ödevde, verilen Java programının çalışma sırasını bilgisayarda çalıştırmadan
// analiz ettik. Öncelikle, ping() metodunun ilk çağrıldığı anda programın çağrı
// yığını (stack) üzerinde hangi metodların aktif olduğunu ve hangi metodun kimi
// çağırdığını gösteren bir stack diyagramı oluşturduk. Ardından, programın ekrana
// ürettiği çıktıyı adım adım takip ederek, tüm boşlukları, noktaları ve satır sonlarını
// birebir doğru şekilde yazdık. Kodun kendisine hiçbir değişiklik yapmadan yalnızca
// yorum satırları ekleyerek bu analizleri sunduk.



public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

//Stack Diyagramı:main()
 // → zoop()
       //→ baffle()
           // → ping()

//Çıktısı:No, I wug.
//You wugga wug.
//I wug.

