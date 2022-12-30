import java.sql.SQLException;

public class ThrowsExcep {
    public static void main(String[] args) throws Exception, SQLException {
        cal c = new cal();
       // try {
            c.div(12, 0);
       // } catch (Exception ex){
        //    System.out.println(ex);
        //}
        c.mutiplication(4,3);

    }



}

class cal{
    public void div(int a, int b)throws Exception{

        System.out.println(a/b);
    }

    public void mutiplication(int a , int b){
        System.out.println(a*b);
    }
}
