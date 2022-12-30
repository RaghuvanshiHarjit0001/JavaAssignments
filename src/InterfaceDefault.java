public class InterfaceDefault implements name {
    public static void main (String[] args){
        InterfaceDefault interfaceDefault = new InterfaceDefault();
        interfaceDefault.show();
        name.display();


    }
    @Override
    public void show(){
        name.super.show();
        System.out.println("Method");
    };

}

interface name extends properties{
    public default void show(){
        properties.super.show();
        System.out.println("Default Method");
    };

    public static void display(){
        System.out.println("Static Method");
    };

}

interface properties {
    public default void show(){
        System.out.println("10kg");
    };

    public static void height(){
        System.out.println("2 meters");
    };

}
