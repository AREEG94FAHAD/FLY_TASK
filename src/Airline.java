import java.util.Scanner;

public class Airline {



    public String airline(int Airline_no){

        String Airline_select=null;

        switch (Airline_no){

            case 1:Airline_select="fly Maxico";break;
            case 2:Airline_select="fly Baghdad ";break;
            case 3:Airline_select=" Don't Fly With Us";break;
            case 4:Airline_select="Fly Baghdad Not";break;

        }
        return Airline_select;

    }


}