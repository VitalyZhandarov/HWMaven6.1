import ru.netology.HWMaven.services.VocationService;

public class Main {
    public static void main(String[] args) {
        VocationService service = new VocationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        System.out.printf(expected + " == ? == " + actual);
    }

}
