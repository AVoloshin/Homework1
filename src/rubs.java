public class rubs {
    public static void main (String[] args){
       double num = (Math.random())*100;
        int result = (int)Math.round(num);
        String rubs = "";
        System.out.println(result);
        if(result>100){
            result %=100;
        }
        if(result>20){
            result %=10;
        }
       switch (result) {
           case (1): rubs ="Рубль";break;
           case (2):
           case (3):
           case (4): rubs ="Рубля";break;
           default: rubs="Рублей";break;
       }
       System.out.println(rubs);
    }
}

