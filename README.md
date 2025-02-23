# Book Platform

Bu proje, kullanıcıların kitapları keşfedebileceği, yorum yapıp puan verebileceği ve favori listesi oluşturabileceği bir platformdur. Adminler ise kitap ekleyip düzenleyebilir ve raporlar alabilir.

## 🌟 Temel Özellikler

### Kullanıcı İşlemleri
- Kayıt/Giriş (JWT ile güvenlik)
- Rol bazlı erişim (Admin/User)

### Kitap İşlemleri
- Kitap ekleme/güncelleme/silme (CRUD)
- Kategorilere göre filtreleme ve arama

### Favori Listesi
- Kullanıcılar favori kitaplarını kaydedebilir.

### Yorum ve Puanlama
- Kitaplara yorum yapma ve 5 üzerinden puan verme.

### Raporlama (Admin)
- En çok puan alan kitaplar, en aktif kullanıcılar gibi raporlar.

## 🛠️ Kullanılan Teknolojiler
- Spring Boot (Web, Data JPA, Security)
- H2 Database (Geliştirme aşamasında)
- JWT (Kimlik doğrulama)
- Lombok (Kod kısalığı)
- Swagger (API dokümantasyonu)

## 📂 Proje Yapısı
- **Controller**: API endpoint'leri.
- **Service**: İş mantığı.
- **Repository**: Database işlemleri.
- **Model**: Veritabanı tabloları.
- **Security**: JWT ve kimlik doğrulama.
- **Exception**: Hata yönetimi.

## 🚀 Örnek Senaryo
1. Kullanıcı kaydolur/giriş yapar.
2. Kitapları keşfeder, yorum yapar ve puan verir.
3. Favori listesine kitap ekler.
4. Admin, yeni kitap ekler ve raporları görüntüler.

## Başlangıç
Projeyi çalıştırmak için aşağıdaki adımları izleyin:

### Gereksinimler
- Java 11 veya üstü
- Maven

### Kurulum
1. Projeyi klonlayın:
    ```sh
    git clone https://github.com/username/book-platform.git
    cd book-platform
    ```

2. Gerekli bağımlılıkları yükleyin ve projeyi çalıştırın:
    ```sh
    ./mvnw spring-boot:run
    ```

3. Uygulama varsayılan olarak `http://localhost:8080` adresinde çalışacaktır.

### Swagger
API dokümantasyonuna erişmek için `http://localhost:8080/swagger-ui.html` adresini ziyaret edin.

## Katkıda Bulunma
Katkıda bulunmak isterseniz, lütfen bir pull request gönderin veya bir issue açın.

## Lisans
Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakın.