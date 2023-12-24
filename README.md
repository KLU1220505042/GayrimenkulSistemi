<h1> Gayrimenkul Yönetim Sistemi </h1>

Bu Java programı, kullanıcılara ev sahipleri, kiracılar ve farklı türde konut birimleri oluşturma imkanı tanıyan basit bir gayrimenkul yönetim sistemini simüle eder. Sistem, gerçek bir emlak senaryosundaki varlıklar arasındaki ilişkileri modellemek için sınıf miras dahil olmak üzere nesne tabanlı prensipleri kullanır.

## 1. EvSahibi Sınıfı:
   Bir ev sahibini ad (ad), soyad (soyad) ve ilişkili kiracı referansı ile temsil eder.
   Kiracıyı ayarlamak ve ev sahibi bilgilerini görüntülemek için yöntemler sağlar.



## 2. Kiraci Sınıfı:
  Ad (ad), soyad (soyad) ve ilişkili ev sahibi referansı ile bir kiracıyı temsil eder.
  Ev sahibini ayarlamak ve kiracı bilgilerini görüntülemek için yöntemler sağlar.


## 3. Konut Sınıfı: 
   Adres (adres) ve ev sahibi referansı ile genel bir konut birimini temsil eder.
   Konut bilgilerini görüntülemek için bir yöntem sağlar.


## 4. Daire Sınıfı:
   Konut sınıfından miras alır.
   Daire numarası (daireNumarasi) için ek bir özellik içerir.
   displayInfo yöntemini daireye özgü bilgileri içerecek şekilde geçersiz kılar.


## 5. Bina Sınıfı:
   Konut sınıfından miras alır.
   Kat sayısı (numberOfFloors) için ek bir özellik içerir.
   displayInfo yöntemini binaya özgü bilgileri içerecek şekilde geçersiz kılar.
   
## Image

1. <img src="SS1.PNG">

2. <img src="SS2.PNG">
