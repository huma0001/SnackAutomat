public class SnackAutomat {


    public int køb(int varePris, int betaltBeløb){

        int result = 0;

        if(varePris < 0 || betaltBeløb < 0){
            throw new IllegalArgumentException();
        } else if (betaltBeløb < varePris){
            throw new IllegalArgumentException();
        }

        result = betaltBeløb - varePris;


        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }


    public static void main(String[] args) {
        SnackAutomat automat = new SnackAutomat();

        int returnMoney = automat.køb(100,300);
        System.out.println(returnMoney);


    }
}
