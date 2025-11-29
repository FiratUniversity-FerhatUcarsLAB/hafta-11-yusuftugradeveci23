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

    public static void zoop() {//4
        baffle();//5
        System.out.print("You wugga ");//11
        baffle();//12
    }

    public static void main(String[] args) {//1
        System.out.print("No, I ");//2
        zoop();//3
        System.out.print("I ");//18
        baffle();//19
    }

    public static void baffle() {//6  //13  //20
        System.out.print("wug");//7  //14   //21
        ping();//8  //15  //22
    }

    public static void ping() {//9  //16  //23
        System.out.println(".");//10  //17  //24
    }
}
//ping metodu ilk kez ¸cağrıldığında programın durumunu gösteren bir
//stack diyagramı çizin:

//Stack Diyagramı:main()
 // → zoop()
       //→ baffle()
           // → ping()

//Çıktısı:No, I wug.
//You wugga wug.
//I wug.

