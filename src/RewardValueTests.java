import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cash = 100;
        RewardValue rewardValue = new RewardValue(cash);
        assertEquals(cash, rewardValue.getCashValue());

    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        RewardValue rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash=100;
        RewardValue rewardValue=new RewardValue(cash);
        int expectMiles=(int)(cash/0.0035);
        assertEquals(expectMiles,rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles=1000;
        RewardValue rewardValue=new RewardValue(miles,true);
        double expectCash=miles*0.0035;
        assertEquals(expectCash,rewardValue.getCashValue());
    }


}
