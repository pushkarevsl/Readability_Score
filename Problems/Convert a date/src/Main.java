import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner (System.in);
        String inputDate = scanner.nextLine();
        scanner.close();

        LocalDate localInputDate = LocalDate.parse(inputDate);
        DateTimeFormatter formatter = null;
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println(localInputDate.format(formatter));


    }
}