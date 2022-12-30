public class ThrowExceptions {
    public static void main(String[] args){
        //throw new ArithmeticException("NumberFormat Exception");
        ThrowExceptions th = new ThrowExceptions();
        th.eligibiltyForVote(19);
    }

    public void eligibiltyForVote(int a){
        if(a < 18){
            throw new ArrayIndexOutOfBoundsException("Not eligible for the voting");
        }
        System.out.println("valid entry");
    }
}
