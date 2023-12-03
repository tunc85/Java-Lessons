package d21oop;

public class StudentRunner {
    public static void main(String[] args) {
          Student s = new Student();
        System.out.println("s.getAge() = " + s.getAge()); // 13

        System.out.println("s.isSuccessful() = " + s.isSuccessful()); // true

        s.setAge(25); // degistirdik sadece ama goremiyoruz gormek icin
        System.out.println("s.getAge() = " + s.getAge()); // gormek icin getirdik yani get. yaptık

        s.setSuccessful(false); // set ile deger degistirdik ama yimne goremiyoruz
        System.out.println(s.isSuccessful()); // false default degerini ustte degistirdik
        //class degismez obje degisir ana default degeri koruyor pass by value
        //Bu örnekte, get metodu adı özelliğinin değerini döndürürken, set metodu adı özelliğini belirli koşullara göre günceller. Bu sayede, özelliklere doğrudan erişim yerine bu metotlar üzerinden erişim sağlanabilir, ve değerlerin kontrolü daha kolay bir şekilde yapılabilir.
        //set ve get'in coksa kullanildigi class'lara JavaBeans'te deniliyor.
    }
}
