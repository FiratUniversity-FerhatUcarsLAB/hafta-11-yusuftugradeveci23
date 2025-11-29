public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }
        // 1) Donus degerini kullanma
    //Java herhangi bir hata vermez,kod çalışır sadece döndürülen değer görmezden gelinir.

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
yin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevap:Compile-time error verir kod çalışmaz. çünkü void yani döndürülemeyen değeri println içinde kullanılamaz.
    }
}
