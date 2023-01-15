import java.util.Scanner;

public class ex_6_4 {

 
 public static void main(String[] args){ 
  
  Scanner keyboard = new Scanner(System.in);
  
  int number_of_month, year;
  int nbre_of_daysinmonth = 0;
  String month= "Not exist";
  
  System.out.println("What is the number of the month ?");
  number_of_month = keyboard.nextInt();
  
  System.out.println("Enter the year");
  year = keyboard.nextInt();
  
  switch(number_of_month) {
  case 1:
   month = "January";
   nbre_of_daysinmonth = 31;
   break;
   
  case 2:
            month = "February";
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
             nbre_of_daysinmonth = 29;
            } else {
             nbre_of_daysinmonth = 28;
            }
            break;
        case 3:
            month = "March";
            nbre_of_daysinmonth = 31;
            break;
        case 4:
            month = "April";
            nbre_of_daysinmonth = 30;
            break;
        case 5:
            month = "May";
            nbre_of_daysinmonth = 31;
            break;
        case 6:
            month = "June";
            nbre_of_daysinmonth = 30;
            break;
        case 7:
            month = "July";
            nbre_of_daysinmonth = 31;
            break;
        case 8:
            month = "August";
            nbre_of_daysinmonth = 31;
            break;
        case 9:
            month = "September";
            nbre_of_daysinmonth = 30;
            break;
        case 10:
            month = "October";
            nbre_of_daysinmonth = 31;
            break;
        case 11:
            month = "November";
            nbre_of_daysinmonth = 30;
            break;
        case 12:
            month = "December";
            nbre_of_daysinmonth = 31;
  }
  keyboard.close();
  System.out.println("The month of " + month + " " + year + " has " 
  + nbre_of_daysinmonth);
 }
}



