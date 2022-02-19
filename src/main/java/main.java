public class main {

    public static void main (String [] args){
        number(16, -12);
        Positive_Negative(-16);
        isPositive(13);
        printString_Number("sun", 7);
        LeapYear(1863);
    }

    public static boolean number (int first, int two ) {
        if ((first + two) >=10 && (first + two) <=20 ){
            return true;
        } else {
            return false;
        }
    }

    public static void Positive_Negative(int a){
        if (a >=0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean isPositive (int b){
        if (b >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printString_Number (String c,  int d ){
        for (int i = 0; i < d; i++ ) {
            System.out.println(c);
        }
    }

    public  static boolean LeapYear (int x){
        x = 1456;
        if ((x % 4 ==0) && (x % 400 == 0)){
            return true;
        } else if (x % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}

