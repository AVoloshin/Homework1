public class stringSymbolCount {
    public static void main (String[] args){
        String s = "May the force be with you, Junior!";
        int n = ((String) s).length();
        System.out.println(n);
        String s1="";
        String s2="";
        for(int i=0;i<n/2;i++){
            s1=s1 + s.charAt(i);
        }
        System.out.println(s1);
        for(int j=n/2;j<n;j++){
            s2=s2 + s.charAt(j);
        }
        System.out.println(s2);
    }
}
