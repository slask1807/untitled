package task1;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(748472, "apple", 1752);
        Phone phone2 = new Phone(222272, "LG", 2222);
        Phone phone3 = new Phone(11122233, "samsung", 1243);
        Phone phone4 = new Phone(55445, "nokia");
        Phone phone5 = new Phone();
        phone.reciveCall("Алиса");
        System.out.println(phone.getNumber());
        phone2.reciveCall("Петр");
        System.out.println(phone2.getNumber());
        phone3.reciveCall("Егор");
        System.out.println(phone4.getNumber());

        phone.reciveCall("Алиса", 7468472);//2 метод
        phone4.reciveCall("Нина");
    }
}
