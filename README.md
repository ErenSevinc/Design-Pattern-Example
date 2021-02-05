# Singleton Design Pattern

Singleton Design Pattern bize Runtime'da yalnızca bir adet nesne oluşturulmasını garanti eder. Oluşturduğumuz Singleton sınıfımızın kendi Instance'ını yönetmesini sağlamamız gerekir. Bu patterne göre ilgili sınıfın yalnızca bir Instance'ının bulunduğundan emin olmalıyız ve buna global bir erişim noktası sağlamalıyız.
> [Singleton Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/singletonDesignPattern)

# Factory Design Pattern

Bir ürünün üretimi nerede gerçekleşir? Bir tesis, imalathane vs. Genel olarak adlandırırsak bu soruya **fabrika** diye cevap verebiliriz. İsminden de anlaşılacağı üzere Factory Design Pattern, bizim  bir Instance oluşturma işlemimizi kullanıcıya bırakmaması üzerine kullanılır diyebiliriz.

Benzer özellikleri olan SubClasslara ortak bir Interface uygulanır ve Instance oluşturma görevi bu Interface üzerinden gerçekleştirilen bir Factory sınıfına verilir. Kullanıcı ise Instance oluşturmak için Factory sınıfına talepte bulunur.
> [Factory Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/factoryDesignPattern)

# Prototype Design Pattern

Yazılım geliştirdiğimiz esnada maliyet bakımından yüksek olan nesneler olabilir. Burada maliyetten kasıt, çalışma zamanı ve bellek kullanımıdır. Maliyetli bir nesnenin verimli kullanılabilmesi için sürekli yeni bir Instance oluşturmak yerine bir kopyasını alırsak yani **klonlarsak** verimli bir yol izlemiş olabiliriz. Yani bu nesneyi sonradan kullanacağımızı düşünürsek bu nesnenin bir protopip olduğunu ve bu nesnenin kopyasının alındığını ve artık işlemlerimizin bu kopya üzerinden gerçekleştiğini düşünebiliriz.

- Soyut prototipimiz klonu alınacak nesneler için temel oluşturan bir abstact class ya da interface olabilir.
- Soyut prototipimiz klonu alınması istenilen nesnemizdir. soyut prototipte var olan özet metodun extends edilmesiyle (kalıtımıyla) kopyalanırlar.
> [Prototype Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/prototypeDesignPattern)


# Facade Design Pattern

Facade Design Pattern bir alt sistemin parçalarını oluşturan sınıfları istemciden soyutlayarak kullanımı daha da kolaylaştırmak için tasarlanmış tasarım kalıbıdır. Mimarisel açıdan ise, karmaşık ve detaylı bir sistemi organize eden ve bir bütün olarak clientlara(istemcilere) sunan yapıdır.

Sistemi kullanacak clientlara daha basit bir arayüz sağlamak ve alt sistemleri bu arayüze organize bir şekilde dahil etmek ve bu alt sistemlerin sağlıklı çalışabilmesi için bu arayüz çatısı altında işin algoritmasına uygun işlev sergilemek istersek Facade Design Pattern’i kullanabiliriz.
> [Facade Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/facadeDesignPattern)

# Adapter Design Pattern

Yurt dışına tatile gittiğimizi düşünelim. Telefonumuzu ya da bilgisayarımızı şarja takmamız gerekecektir. Duvardaki prize baktığımızda bizim cihazımızın şarj girişiyle uyuşmayabilir. Bunun için bulunduğumuz yerdeki prizleri değiştirmek ne kadar mantıklı?
Duvardaki prize ve cihazımınız şarj aletine uygun bir **adaptör** kullanarak cihazımızı şarj edebiliriz.

Adapter Design Pattern ile birbiriyle ilişkili olmayan interfacelerin birlikte çalışmasını sağlayabiliriz.

Daha önce yazılmış olan kodları düzenlemek zorunda kalmayız. Sonuçta ilgili kodun daha önce çalıştığını kabul ediyoruz.
Adapte edeceğimiz class üzerinde değişiklik yapmadığımız için uygulama içerisinde kullanılmış olduğu herhangi bir yerde değişiklik yapmamız gerekmez.

- Target: Bu şartlarda yurt dışındaki priz diyebiliriz. Dönüşülmesini istediğimiz hedeftir.
- Adaptee: Cihazımız olarak düşünebiliriz. Dönüştürmek istediğimiz nesne olarak düşünebiliriz.
- Adapter: Şarj etmek için kullandığımız adapter olarak bunları örneklendirebiliriz..

Adapter, Target'ı implemente eder ve Adaptee üzerinden Target gibi çalışması gerçekleştirilir.
> [Adapter Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/adapterDesignPattern)

# Observer Design Pattern

Bu tasarım kalıbı, nesneler arasında one-to-many ilişkisi olduğu durumlarda tercih edilen bir kalıptır. Yani bir nesnede olan herhangi bir değişiklik, bu nesneye bağımlı diğer nesneleri de etkiliyorsa bu şablon kullanılır.

Örneğin bir alışveriş sitesinde bir ürüne indirim yapıldığında kullanıcılarınıza e-mail ile haber verilir iken bu kalıp kullanılabilir. Ya da en basitinden facebook da bir gruba üyesiniz grupta bildirimleri açtığınızda size (ve daha birçok kişiye) gelecek olan bildirim bu yapı ile olabilir.

Observer pattern, 3 aktör sınıf kullanır. Bu sınıflar; Subject, Observer ve Client sınıflarıdır.
- Subject: İçerisinde gözlemci listesini tutar ve ilgili gözlemciye bildirim gönderilmesini sağlar.
- Observer: Bir interface’dir. Bu sınıftan miras alacak olan gözlemciler de mecburen içlerinde implement metodlarını barındırırlar. Alt sınıfların ortak bir interface’den faydalanması amaçlanır.
- Client: Sistemi kullanacak olan istemcidir.
> [Observer Design Pattern örneği için tıklayınız](https://github.com/ErenSevinc/design-pattern-example/tree/master/observerDesignPattern)
