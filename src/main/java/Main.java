public class Main {
    public static void main(String[] args){

        Calc Firstcalc = new Calc();
        int result = Firstcalc.add(5,6);
        System.out.println(result);

        Calc Secondcalc = new Calc();
        Secondcalc.minus(10,3);
        int result2 = Secondcalc.getSum2();
        System.out.println(result2);


    }
}

