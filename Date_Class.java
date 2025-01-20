 
package shk.practice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        System.out.println(date);
                                                //MM for month
                                                //mm for minutes
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = dateFormat.format(date);
        
        System.out.println(currentDate);
        
    }
}

