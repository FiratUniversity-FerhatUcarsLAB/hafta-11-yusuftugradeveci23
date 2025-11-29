//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:29.11.2025
//Açıklama:"Exercise 4.1 çalışmasında, Java programlama dilinde metot tanımlama, parametre aktarımı ve kodun modüler yapıda tekrar kullanılabilirliği kavramları pekiştirilmiştir.
//Bu kapsamda, printAmerican ve printEuropean adında iki farklı metot geliştirilmiş; her iki metot da gün adı, sayısal tarih, ay adı ve yıl bilgisini parametre olarak almıştır.
//Uygulama içerisinde String birleştirme işlemleri kullanılarak, aynı veri setinin farklı kültürel standartlara (Amerikan formatında 'Gün, Ay Tarih, Yıl' ve Avrupa formatında 'Tarih Ay Yıl, Gün') uygun şekilde, noktalama işaretleri ve boşluk düzenine dikkat edilerek formatlanması ve ekrana yazdırılması sağlanmıştır."

public class exerciseTime {
 //Amerika tarih çağırma metodu
    public static void printAmerican(String day,int date,String month,int year) {
     System.out.println(day+","+month+","+date+","+year);
 }//Avrupa trih çağırma metodu
 public static void printEuropean(String day,int date,String month,int year) {
     System.out.println(date+","+month+","+year+","+day);

 }
 public static void main(String[] args) {
     String day="Cumartesi";
     String month="November";
     int date=29;
     int year=2025;
     //Amerika tarih yazdırma
    System.out.print("Amerika Tarih:");
    printAmerican(day,date,month,year);

    //Avrupa tarih yazdırma
    System.out.print("Avrupa Tarih:");
    printEuropean(day,date,month,year);

 }
}


//Çıktısı: Amerika Tarih:Cumartesi,November,29,2025
//Avrupa Tarih:29,November,2025,Cumartesi
