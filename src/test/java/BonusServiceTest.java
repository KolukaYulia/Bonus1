import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1000000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 2000000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);

    }
}
