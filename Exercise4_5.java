//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:29.11.2025
//Açıklama:Bu program, Java’da metod çağrılarının çalışma sırasını ve stack üzerinde nasıl tutulduklarını göstermek amacıyla yazılmıştır.
//Programda main(), zoop(), clink() ve ping() metotları bulunmaktadır.
//Kod çalıştırıldığında metotlar birbirlerini çağırarak bir çağrı zinciri oluşturur.
//Aşağıdaki bölümlerde bu çağrıların ürettiği çıktı ve o sırada oluşan stack yapısı açıklanmıştır.


public class Exercise4_5 {

    public static void zoop(String fred, int bob) {//5 //15
        System.out.println(fred);//6
        if (bob == 5) {//7
            ping("not ");//8
        } else {//16
            System.out.println("!");//17
        }
    }

    public static void main(String[] args) {//1
        int bizz = 5;//2
        int buzz = 2;//3
        zoop("just for", bizz);//4
        clink(2 * buzz);//11
    }

    public static void clink(int fork) {//12
        System.out.print("It's ");//13
        zoop("breakfast ", fork);//14
    }

    public static void ping(String strangStrung) {//9
        System.out.println("any " + strangStrung + "more ");//10
    }
}  



//zoop metodu ikinci kez ¸cağrıldığında programın durumunu gösteren
//bir stack diyagramı ¸cizin.main():

    //Stack Diyagramı:
    // → zoop(" just for ", 5)
    //  → ping(" not ")
//  → clink(4)
    //  → zoop(" breakfast ", 4


//Çıktısı:just for 
// any  not  more 
//It ’s  breakfast 
//!
