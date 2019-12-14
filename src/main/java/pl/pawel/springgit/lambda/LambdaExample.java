package pl.pawel.springgit.lambda;



public class LambdaExample {

    public static void main(String []args){
        Write w  = (imie, nazwisko, wiek) -> imie + ":" + nazwisko + " w wieku: " + wiek;
        System.out.println(write("Paweł", "G.", 21,w));


    }


    private static int performCalculations(int first, int second, Calculations calculations){
        return calculations.calc(first,second);
    }
    private static String write(String imie,String nazwisko, int wiek, Write w){
        return w.getPerson(imie,nazwisko,wiek);
    }

}
