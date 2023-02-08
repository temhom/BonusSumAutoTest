public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();

        long expected = 150;
        long actual = service.calculate(5_000, true);
        System.out.println("Тест №1.   " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calculate(5_000, false);
        System.out.println("Тест №2.   " + expected + " == ? == " + actual);
    }
}
