package shk.practice;

public class Conversion_String {

    public static void main(String[] args) {
        //double to String
        double i = 100.85;
        String s = Double.toString(i);
        System.out.println(s);
        
        //boolean to String
        boolean res = true;
        String s1= Boolean.toString(res);
        System.out.println(s1);
        
        //String to Integer 1st (parse way)
        String s2 = "32";
        int j =Integer.parseInt(s2);
        System.out.println(j);
        
        //String to Double 1st (parse way)
        String s3 = "32.55";
        double k =Double.parseDouble(s3);
        System.out.println(k);
        
       //String to Integer 2nd (value) way  
        String s4 = "58.5";
        double L =Double.valueOf(s4);
        System.out.println(L);
    }
}
