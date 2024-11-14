import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SnackAutomatTest {

    @Test
    void købValidReturn(){
        SnackAutomat automat = new SnackAutomat();
        int actualreturnMoney = automat.køb(100,300);
        int expectedReturnMoney = 200;


        Assertions.assertEquals(expectedReturnMoney, actualreturnMoney);
    }



    //hjælp af chatten, kan ikke finde ud af at lave test for illegalArguments eller expections generelt
    @Test
    void købErrorNotEnoughMoney() {
        SnackAutomat automat = new SnackAutomat();
        assertThrows(IllegalArgumentException.class, () -> automat.køb(300, 100));
    }
}