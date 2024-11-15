import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SnackAutomat {


    public int køb(int varePris, int betaltBeløb) {

        int result = 0;

        if (varePris < 0 || betaltBeløb < 0) {
            throw new IllegalArgumentException();
        } else if (betaltBeløb < varePris) {
            throw new IllegalArgumentException();
        }

        result = betaltBeløb - varePris;


        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    public int[] byttePenge(int byttePengeKunde){
        int[] byttePengeMønter = {20,10,5,2,1};

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


        System.out.println("Penge tilbage: " + byttePengeKunde + "kr");
        // print values in each index
        for(int i = 0; i<byttepengeArray.length; i++){
            System.out.println("Der er " + byttepengeArray[i] + " gang(e) " + byttePengeMønter[i] +"kr i mønter");
        }


        return byttepengeArray;
    }


    public static void main(String[] args) {
        SnackAutomat automat = new SnackAutomat();

        int varePris = 100;
        int beløbBetalt = 193;


        int returnMoney = automat.køb(varePris,beløbBetalt);

        System.out.println("Du har betalt " + beløbBetalt + " for en vare der koster " + varePris);

        //Vi bruger byttePenge metoden på vores variabel "returnMoney" der holder værdien af de penge kunden skal have tilbage
        automat.byttePenge(returnMoney);


        System.out.println("\n\nNyt eksempel");

        //Nyt eksempel for at teste om koden virker

        int varePris1 = 213;
        int beløbBetalt1 = 599 ;


        int returnMoney1 = automat.køb(varePris1,beløbBetalt1);

        System.out.println("Du har betalt " + beløbBetalt1 + " for en vare der koster " + varePris1);

        //Virker som det skal
        automat.byttePenge(returnMoney1);


    }
}
