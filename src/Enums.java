public class Enums {
    enum Weekdays{
        Sunday("First day",1),
        Monday("Second day",2);

        String str;
        int a;
        Weekdays(String str, int a){
            this.str = str;
            this.a = a;
        }
        String show(){
            return str;
        }

        int day(){
            return a;
        }


    }
    public static void main(String[] args){
        System.out.println(Weekdays.Monday);
        for(Weekdays day: Weekdays.values()){
            if(day == Weekdays.valueOf("Sunday")){
                System.out.println("Holiday");
            } else{
                System.out.println(day + "  " + day.show() +"  "+ day.day());
            }

        }
        System.out.println(Weekdays.Monday.show());
    }
}
