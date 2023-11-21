package TemaSesiunea12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainSes12 {


//1.--------------------------------------------------------------------------------------------
    public static void displayTodaysDate(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Today's date is "+ formattedDate);
    }
//2.--------------------------------------------------------------------------------------------
    public static void displayDateComponents(LocalDate date){

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: "+ year);
        System.out.println("Month: "+month);
        System.out.println("Day: "+day);
    }
//3.--------------------------------------------------------------------------------------------

//    public static boolean areDatesEqual(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("First date: YYYY-MM-DD");
//        String dateString1 = scanner.next();
//        System.out.println("Second date: YYYY-MM-DD");
//        String dateString2 = scanner.next();
//        scanner.close();
//
//        LocalDate date1 = LocalDate.parse(dateString1);
//        LocalDate date2 = LocalDate.parse(dateString2);
//
//        return date1.equals(date2);

//    }

//4.--------------------------------------------------------------------------------------------
//    public static boolean isTodayDate(){
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("User input date : YYYY-MM-DD");
//        String dateUser = scanner.next();
//        scanner.close();
//
//        LocalDate todayDate = LocalDate.now();
//        LocalDate inputDate = LocalDate.parse(dateUser);
//
//        return todayDate.equals(inputDate);
//    }

    //5.--------------------------------------------------------------------------------------------

    public static void displayCurrentTime(){
        LocalTime currentTime = LocalTime.now();
        System.out.println(" Local time is : " + currentTime);
    }

    //6.----------------------------------------------------------------------------------------------

//    public static void findDayOfTheWeek(){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Innsert date: YYYY-MM-DD");
//        String dateToInsert = scanner.next();
//        LocalDate dateInserted = LocalDate.parse(dateToInsert);
//        DayOfWeek dayOfWeek = dateInserted.getDayOfWeek();
//        String dayOfWeekString = dayOfWeek.getDisplayName(
//                java.time.format.TextStyle.FULL,
//                java.util.Locale.getDefault());
//        System.out.println( "The day for inserted date is : " + dayOfWeekString);
//
//    }

    //7.---------------------------------------------------------------------------------------
    //aici as vrea sa pot sustrage valoarea lui dateString1 si dateString2 sa le chem in main ca parte din print

//    public static long daysBetween(){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("First date: YYYY-MM-DD");
//        String dateString1 = scanner.next();
//        System.out.println("Second date: YYYY-MM-DD");
//        String dateString2 = scanner.next();
//        scanner.close();
//        LocalDate date1 = LocalDate.parse(dateString1);
//        LocalDate date2 = LocalDate.parse(dateString2);
//
//        long daysBetween = Math.abs(date1.toEpochDay()-date2.toEpochDay());
//
//        return daysBetween;
//    }

    //8.------------------------------------------------------------------------------------------------------------------
    public static String elasedTimeSince(String priorTime) {
        Date currentTime = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date priorTimeDate;
        try{
            priorTimeDate = dateFormat.parse(priorTime);
        }catch (ParseException e){
            e.printStackTrace();
            return"Invalid input format";
        }
        long timeDifference = currentTime.getTime() - priorTimeDate.getTime();
        long hours = timeDifference/(60*60*1000);
        long minutes = (timeDifference%(60*60*100)) / (60* 1000);
        long seconds = (timeDifference % (60*1000))/1000;

        String result = hours + " hours, " + minutes + " minutes "+ seconds+ " seconds ";
        return result;

    }




    public static void main(String[] args) {


        //1. Write a method named displayTodaysDate that, when called, prints the current date to the console.

        displayTodaysDate();


        //2. Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately (date in the format YYYY-MM-DD).
        LocalDate extractionDate = LocalDate.of(2023,11,13);
        displayDateComponents(extractionDate);

        //3. Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise (format YYYY-MM-DD).

//        boolean result = areDatesEqual();
//
//        if(result){
//            System.out.println("Dates are equal");
//        }else{
//            System.out.println("Dates are not equal");
//        }

        //4. Write a method named isTodaySpecificDate that checks if today's date is a date received from the user (so the user type in a date, and compare that date with today's date, return true or false).

//        boolean result = isTodayDate();
//        if(result){
//            System.out.println("The user date matches today's date");
//        }else {
//            System.out.println("User inserted invalid date");
//        }

        //5. Write a method named displayCurrentTime that prints the current time to the console (format HH:MM:SS).

        displayCurrentTime();

        //6. Construct a method named findDayOfWeek that takes in a date and returns the specific day of the week (e.g., Monday, Tuesday, etc.) for that date.

//        findDayOfTheWeek();

        // 7. Design a method titled daysBetween that reads two dates from the console and computes the total number of days between them.

//        long result = daysBetween();
//        System.out.println("The number of days between date 1 and date 2 is " + result + " days.");

        //8. Construct a method called elapsedTimeSince that ingests a prior time (in the HH:MM:SS format) as its input and displays the time duration from that moment to the present. This method should return X hours, Y minutes, Z seconds.

        String priorTime = " 12:30:30";

        String result = elasedTimeSince(priorTime);
        System.out.println("Elapsed time since " + priorTime + ": " + result); // da rezultat ciudat prea multe ore

    }
}
