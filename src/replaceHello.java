public class replaceHello {
    public static void main (String[] args){
        String string ="?????###?#?#?##";
        string = string.replace("?", "Hello");
        string = string.replace("#", "");
        System.out.println(string);

    }
}
