import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
class DateTimeFormatDemo
{
   public static void main(String[] args)
   {
      String input = "09:15:20 PM";
      DateFormat ft = new SimpleDateFormat("hh:mm:ss aa");
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date tanggal = null;
      String output = null;
      try{
    	 tanggal= ft.parse(input);
    	 output = outputformat.format(tanggal);
         System.out.print(input + " = ");
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
       }
   }
}