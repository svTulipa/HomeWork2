public class HomeWork {

    public static void main (String [] args){
        int a = 666;
        int b = -13;
        int d = 4;
        int x = 1897;
        String c = "sun";
        Positive_Negative(a);
        isPositive(b);
        printString_Number(c, d);

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
        if (b > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printString_Number (String c, int d ){
        for (int i = 0; d < 12; d++ ) {
            System.out.println(c);
        }
    }
    public  static boolean LeapYear (int x){
        if (x % 4 ==0) {
            return true;
        } else if (x % 100 == 0) {
            return false;
        } else if (x % 400 == 0) {
            return true;
        } else {
            return false;  // В последней строке сомневался, не хотел писать. Но логика не работала. признаюсь честно писал еще и с памяти, так как такое выполнял на курсы О.П.
        }
    }


}
