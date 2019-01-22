import java.util.Random;

public class sevenAtEnd {
    public static void main (String[] args){
        int i = 0;
        do {
            Random random = new Random();
            int n = random.nextInt();
            String s = n + "";
            System.out.println(s);
            int charNum = s.length();
            char z = s.charAt(charNum - 1);
            String sub = s.substring(0,charNum - 1);
            int SUB = Integer.parseInt(sub);
            int Z = z - '0';
            if ((SUB - 2 * Z) % 7 == 0) {
                System.out.println("УРА! Число: " +n + " делится на 7 :)");
                break;
            }
            else i = 0;
            System.out.println("Это число не делится на 7 :(");
        }while (i==0);

    }
}

