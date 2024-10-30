import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
//bsp2
        int year = In.readInt();
        int month = In.readInt();

        if (year < 0){
            System.out.println("Choose a valid year! (bigger than 0)");
        }

        if (month > 12 || month < 1){
            System.out.println("Choose a valid month! (between 1 and 12)");
        }


        switch (month){

        case 1,3,5,7,8,10,12 ->

            System.out.println("This month has 31 days");

        case 2 ->
            {
                 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){System.out.println("This month has 29 days");}
                 else{System.out.println("This month has 28 days"); }
            }


        case 4,6,9,11 ->
            System.out.println("This month has 30 days");

        }

    }
}
