# Book Platform

## Proje Hakkında
Book Platform, kullanıcıların kitapları keşfedebileceği, yorum yapıp puan verebileceği ve favori listesi oluşturabileceği bir uygulamadır. Adminler ise kitap ekleyip düzenleyebilir ve raporlar alabilir.

## Temel Özellikler
- **Kullanıcı İşlemleri**
  - Kayıt/Giriş (JWT ile güvenlik)
  - Rol bazlı erişim (Admin/User)

- **Kitap İşlemleri**
  - Kitap ekleme/güncelleme/silme (CRUD)
  - Kategorilere göre filtreleme ve arama

- **Favori Listesi**
  - Kullanıcılar favori kitaplarını kaydedebilir.

- **Yorum ve Puanlama**
  - Kitaplara yorum yapma ve 5 üzerinden puan verme.

- **Raporlama (Admin)**
  - En çok puan alan kitaplar, en aktif kullanıcılar gibi raporlar.

## Kullanılan Teknolojiler
- **Spring Boot** (Web, Data JPA, Security)
- **H2 Database** (Geliştirme aşamasında)
- **JWT** (Kimlik doğrulama)
- **Lombok** (Kod kısalığı)
- **Swagger** (API dokümantasyonu)

## Proje Yapısı
```
book-platform
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── bookplatform
│   │   │               ├── BookPlatformApplication.java
│   │   │               ├── controller
│   │   │               │   ├── BookController.java
│   │   │               │   ├── UserController.java
│   │   │               │   └── AdminController.java
│   │   │               ├── service
│   │   │               │   ├── BookService.java
│   │   │               │   ├── UserService.java
│   │   │               │   └── AdminService.java
│   │   │               ├── repository
│   │   │               │   ├── BookRepository.java
│   │   │               │   ├── UserRepository.java
│   │   │               │   └── AdminRepository.java
│   │   │               ├── model
│   │   │               │   ├── Book.java
│   │   │               │   ├── User.java
│   │   │               │   └── Role.java
│   │   │               ├── security
│   │   │               │   ├── JwtAuthenticationFilter.java
│   │   │               │   ├── JwtAuthorizationFilter.java
│   │   │               │   ├── JwtUtils.java
│   │   │               │   └── SecurityConfig.java
│   │   │               └── exception
│   │   │                   ├── CustomException.java
│   │   │                   └── GlobalExceptionHandler.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
├── .gitignore
├── pom.xml
└── README.md
```

## Kurulum
1. Projeyi klonlayın: `git clone <repository-url>`
2. Maven bağımlılıklarını yükleyin: `mvn clean install`
3. Uygulamayı başlatın: `mvn spring-boot:run`
4. API dokümantasyonuna erişmek için `http://localhost:8080/swagger-ui.html` adresini ziyaret edin.

## Kullanım
- Kullanıcılar kayıt olabilir, giriş yapabilir ve kitapları keşfedebilir.
- Adminler yeni kitaplar ekleyebilir ve raporları görüntüleyebilir.

## Katkıda Bulunanlar
- [Adınız] - Proje sahibi ve geliştirici

## Lisans
Bu proje MIT Lisansı altında lisanslanmıştır.