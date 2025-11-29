//Ad Soyad:Yusuf Tuğra Deveci
//Öğrenci No:250541095
//Tarih:29.11.2025
//Açıklama:"Exercise 4.2 görevinde, Java metot çağrılarının program akışını nasıl değiştirdiğini anlamak temel amaç olmuştur.
//Verilen main, zippo ve baffle metotları arasındaki karmaşık çağrı ilişkileri (bir metodun diğerini, hatta kendini tekrar çağırması) analiz edilmiştir.
//Bu analizde, her bir kod satırının çalıştığı anı sırasıyla numaralandırarak (1'den başlayarak) programın kontrol akışı (flow of execution) detaylıca izlenmiştir.
//Özellikle, if-else koşul yapısının akışı nasıl dallandırdığı ve bir metot çağrısının tamamlanıp orijinal çağrı noktasına geri dönüldüğü anlar gözlemlenmiştir.
//Bu görev, metot çağrılarının programın çalışma sırası üzerindeki etkisini görselleştirmek ve program akışını adım adım takip etme becerisini güçlendirmek için kritik öneme sahiptir."

public static void main(String[] args) { //1
    zippo("rattle",13);      //2
}
public static void baffle(String blimp){//8
    System.out.println(blimp);//9
    zippo("ping",-5);//10
}
public static void zippo(String quince,int flag){//3 //11
  if(flag<0){                                    //4//12
      System.out.println(quince+"zoop");         //13
  }else{                                         //5
      System.out.println("ik");                  //6
      baffle (quince);                           //7
      System.out.println("boo-wa-ha-ha");        //14
  }
}  

//Çıktısı:ik
//rattle
//pingzoop
//boo-wa-ha-ha

//baffle metodu ilk ¸cağrıldığında blimp parametresinin değeri nedir?  CEVAP:rattle
//Hangi satırlar birden fazla kez ¸calışmıştır? Satır numaralarını listeleyin CEVAP:17ve18
