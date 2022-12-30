public class ExceptionsAss {
    public static void main(String [] args){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception np){
           System.out.println(np);
        }
        finally {
            System.out.println("finally");
        }
            System.out.println("Exception Handling Ex");

        try {
            String a = "abc";
            int i = Integer.parseInt(a);
            System.out.println(i);
        } catch (Exception ex){
            System.out.println(ex);

        }

    }
}
