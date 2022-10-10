public class Main {
    public static void main(String[] args) {

        Person ilayda = new Person("ilayda", "dastan", "555555555");
        Person ack = new Person("ahmet can", "kepenek", "44444444");
        Person ayse = new Person("ayse", "yildiz", "33333333");

        System.out.println(ilayda.getFirstName());
        System.out.println(ack.getInfo());
        System.out.println(ayse.getFullName());

        System.out.println(Person.getClassName());
        System.out.println(Person.getClassName());

       /*
       Print hello = new Print();
        Print hello2 = new Print();

        hello.printInfo();
        hello2.printInfo();
        */
        Print.printInfo();
        Print.getMask();
        System.out.println(Print.getMask());
    }
}