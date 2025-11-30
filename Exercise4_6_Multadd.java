//Ad Soyad: Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:30.11.2025
//Açıklama:Bu çalışmada Java dilinde metot yazma ve matematiksel ifadeleri koda dönüştürme becerisi kazanılmıştır.
//İlk olarak a * b + c işlemini gerçekleştiren multadd metodu tanımlanmış ve farklı değerlerle test edilmiştir.
//Daha sonra sin(π/4) + cos(π/4)/2 ile log(10) + log(20) ifadeleri, Math sınıfındaki hazır matematiksel fonksiyonlar kullanılarak multadd metodu aracılığıyla hesaplanmıştır.
//Son aşamada ise x * e⁻ˣ + √(1 − e⁻ˣ) formülünü hesaplayan expSum metodu yazılarak daha karmaşık bir matematiksel ifade Java dilinde başarıyla modellenmiştir.
//Bu ödev sayesinde metot tanımlama, parametre kullanımı, geri dönüş değeri (return) kavramı ve Java’daki matematiksel fonksiyonların kullanımı pekiştirilmiştir.


public class Multadd {
    public static double multadd(double a, double b,double c) {
    return a*b+c;
    }
    public static double expSum(double x){
        return x*Math.exp(-x)+Math.sqrt(1-Math.exp(-x));
    }
    public static void main(String[] args) {
     //Basit Testler
     System.out.println("multadd(1.0,2.0,3.0)="+multadd(1.0,2.0,3.0));
     System.out.println("multadd(2.0,5.0,6.0)="+multadd(2.0,5.0,6.0));

     //1. İşlem
     double result1=multadd(1.0,Math.sin(Math.PI/4),Math.sin(Math.PI/4)/2);

     System.out.println("sin(pi/4)+cos(pi/4)/2="+result1);

     //2.İşlem
     double result2=multadd(1.0,Math.log(10),Math.log(20));

     System.out.println("log10+log20="+result2);

     //expSum Testi
       double result3=expSum(2.0);
       System.out.println("expSum(2.0)="+result3);
    }
}
//Çıktısı:multadd(1.0,2.0,3.0)=5.0
//multadd(2.0,5.0,6.0)=16.0
//sin(pi/4)+cos(pi/4)/2=1.0606601717798212
//log10+log20=5.298317366548037
//expSum(2.0)=1.2005440615054193
