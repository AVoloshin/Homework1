public class checkCircleCovers {
    public static void main (String[] args){
        int a=5;
        int b=5;
        int r=5;
        if (Math.sqrt(a*a+b*b)<=2*r){
            System.out.println("Диагональ прямоугольника равна "+ Math.sqrt(a*a+b*b) + " и меньше либо равна диаметру круга, равному "+ 2*r + ". Круг закроет прямоугольник");
        }
        else System.out.println("Диагональ прямоугольника равна "+ Math.sqrt(a*a+b*b) + " и больше диаметра круга, равного "+ 2*r + ".Круг не закроет прямоугольник");
    }
}

