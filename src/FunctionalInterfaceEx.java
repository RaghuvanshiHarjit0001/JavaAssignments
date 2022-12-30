public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        proper p = (a) -> {
            return "functional interface method"+" " + a;
        };

       System.out.println( p.show("argument"));
    }
}
@FunctionalInterface
interface proper{
    public abstract String show(String str);
}
