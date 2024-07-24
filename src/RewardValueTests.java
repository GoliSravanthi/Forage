import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RewardValueTests {
    @Test
    void create_with_cash_value() {

        double cash = 100;
        RewardValue rewardValue = new RewardValue(cash);
        assertEquals(cash, rewardValue.getCashValue());
        assertEquals(cash/0.0035,rewardValue.getMilesValue());
    }
    @Test
    void create_with_miles_value() {
        int miles = 10000;
        RewardValue rewardValue = new RewardValue(miles);
        assertEquals(miles, rewardValue.getMilesValue());
        assertEquals(miles*0.0035, rewardValue.getCashValue());
    }
    @Test
    void convert_from_cash_to_miles() {
        double cash=100;
        RewardValue rewardValue = new RewardValue(cash);
        double expectMiles=cash/0.0035;
        assertEquals(expectMiles, rewardValue.getMilesValue());

    }
    @Test
    void convert_from_miles_to_cash() {
        int miles=10000;
        RewardValue rewardValue=new RewardValue(miles,true);
        double expectCash=miles*0.0035;
        assertEquals(expectCash,rewardValue.getCashValue());

    }
}
