package d31lambda;

public class Course {
    //Senaryo: Lambdayi object’lerle kullanmayi ogrenelim.
    // Class icerisinde pasif ve aktif ozellikler olusturalim

    /*
        Icinde
        1) private variable'lar (kapsulleme-encapsulation)
        2) parametreli ve parametresiz constructor'lar
        3) getter'lar -Private değişkenlere erişim sağlamak için-
        4) setter'lar -Private değişkenleri değiştirmek için-
        5) toString() methodu -Nesnenin içeriğini okunabilir bir formatta döndürmek için-
        barindiran classlara POJO class denir

        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi

        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */

    //parametreli constructor olusturalim

    private String season; // sezon

    private String courseName; // kurs ismi

    private int avarageScore; // not ortalamasi

    private int numberOfStudents; // ogrenci sayisi

    public Course(String season, String courseName, int avarageScore, int numberOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfStudents = numberOfStudents;
    }

    //parametresiz constructor olusturalim

    public Course() {
    }

    //get methodlari olusturalim


    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    //set methodlari olusturalim


    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    // toString methodu olusturalim


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", avarageScore=" + avarageScore +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }


}
