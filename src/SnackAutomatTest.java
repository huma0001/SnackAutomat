import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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


    @Test
    void byttePenge() {
        /*gamle kode
        int byttePengeKunde = 96;
        int[] byttepengeArray = new int[5];

        byttepengeArray[0] = byttePengeKunde / 20;
        int restePenge = byttePengeKunde % 20;

        byttepengeArray[1] = restePenge / 10;
        restePenge = restePenge % 10;

        byttepengeArray[2] = restePenge / 5;
        restePenge = restePenge % 5;

        byttepengeArray[3] = restePenge / 2;
        restePenge = restePenge % 2;

        byttepengeArray[4] = restePenge;


        int[] expectedByttePenge = {4,1,1,0,1};
        int[] actualByttePenge = byttepengeArray;

       assertArrayEquals(expectedByttePenge, actualByttePenge);
         */


        // ny og refactored kode
        SnackAutomat automat = new SnackAutomat();

        int[] expectedByttePenge = {4,1,1,0,1};
        int[] actualByttePenge = automat.byttePenge(96);


        assertArrayEquals(expectedByttePenge, actualByttePenge);

    }
}