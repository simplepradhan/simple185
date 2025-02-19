public class compoundinterest{
    public static void main (String[]args){

    }
    double principal = 10000 , rete = 10.25 , time=5;
    double CI = principal * (math.pow((1+rete / 100),time));
    System.out.println("Compound Interest is"+ CI);
}