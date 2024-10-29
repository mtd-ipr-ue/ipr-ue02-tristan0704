import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

     int num1 = In.readInt();
     int num2 = In.readInt();
     int num3 = In.readInt();

     int max;

     if (num1 > num2 && num1 > num3) {
         max = num1;
         Out.println("Maximum Value: " + max);
     }

     else if (num2 > num1 && num2 > num3) {
         max = num2;
         Out.println("Maximum Value: " + max);

     }

     else if (num3 > num1 && num3 > num2) {
         max = num3;
         Out.println("Maximum Value: " + max);
     }

    }
}

