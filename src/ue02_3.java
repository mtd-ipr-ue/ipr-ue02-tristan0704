import libraries.In;



public class ue02_3 {
    public static void main(String[] args) {

        double x = In.readDouble();
        double y = In.readDouble();

        double hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));


        int r = 4;

        if (hyp > r && (y < 4 && x < 4)) {
            System.out.println("Your point is in the green area ");
        } else {
            System.out.println("Your point is NOT in the green area ");
        }
    }
}

