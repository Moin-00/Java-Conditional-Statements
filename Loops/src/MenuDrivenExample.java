import java.util.Scanner;
public class MenuDrivenExample {

    public static void main(String[] args) {
        String preference = "Yes";

        while (preference.equalsIgnoreCase("Yes")) {
            System.out.println("enter a day of Week");
            Scanner Sc = new Scanner(System.in);
            String Day = Sc.next();
            switch (Day) {

                case "Tuesday":
                    System.out.println("Tuesdays Are boring");
                    break;
                case "Monday":
                    System.out.println("Mondays are hectic");
                    break;
                case "Wednesday":
                    System.out.println("wednesday are long ");
                    break;
                case "Thursday":
                    System.out.println("Thursdays are hopeful ");
                    break;
                case "Friday":
                    System.out.println("Fridays are best ");
                    break;
                case "Saturday":
                    System.out.println("Saturdays are fun ");
                    break;
                case "Sunday":
                    System.out.println("Sundays are weird ");
                    break;
                default:
                    System.out.println("Invalid Data");
                    break;
            }
        }
    }
}
