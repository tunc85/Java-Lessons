package d18stringbuilder_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        Student ali = new Student();

        System.out.println(ali.stdName); // Ali Can
        System.out.println(ali.email); // alican@gmail.com

        System.out.println(ali.address); // Istanbul
        System.out.println(ali); //Student{stdName='Ali Can', adress='Istanbul', email='alican@gmail.com', tcKimlik='***********'}




    }
}
