import java.util.Scanner;

public class MainClass {

    public static void main (String []args) {

        int DayNumber;
        int MonthNumber;
        String Travel_Day = null;
        String Month_Travel = null;
        String FlyCompany = null;
        String Exite="done";
        int CounterOfTravel = 1;
        String NameOfPersons = null;


        Airline select = new Airline();
        Scanner input = new Scanner(System.in);

        for(;;){

            System.out.println("Please Enter the No. of Day you are need to Reservation \n for example 1 for Saturday and so on ");
            int Noday = input.nextInt();
            for (Date.Day day : Date.Day.values()) {
                DayNumber = day.getNoOfDay();
                if (Noday == DayNumber) {
                    Travel_Day = day.toString();
                }

            }
            System.out.println("Please Enter the No. of Month you are need to Reservation \n for example 1 for Janury and so on   ");
            int NoMonth = input.nextInt();
            for (Date.Month Month : Date.Month.values()) {
                MonthNumber = Month.getNoOfMonth();
                if (NoMonth == MonthNumber) {
                    Month_Travel = Month.toString();

                }
            }
            System.out.println("Please Enter the No. of the Airline \n for example 1 for fly maxico ");
            int FlyNo = input.nextInt();
            input.nextLine();
            FlyCompany = select.airline(FlyNo);

            System.out.println("please enter the name of the person ");
            NameOfPersons = input.nextLine();
            System.out.println(Travel_Day + "--" + Month_Travel + "--" + FlyCompany + "--" + NameOfPersons);


            System.out.println("for Exit enter done for add another  Reservation  pess any button");
            String done1=input.nextLine();

            if(done1.equals(Exite))
            break;
            ++CounterOfTravel;
        }
        System.out.println( "the number of  Trips   : ="+CounterOfTravel);
    }
}
