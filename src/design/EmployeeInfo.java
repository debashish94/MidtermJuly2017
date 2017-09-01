package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract {

    /*
     * This class can be implemented from Employee interface then add additional
     * methods in EmployeeInfo class. Also, Employee interface can be
     * implemented into an abstract class.So create an Abstract class then
     * inherit that abstract class into EmployeeInfo class.Once you done with
     * designing EmployeeInfo class, go to FortuneEmployee class to apply all
     * the fields and attributes.
     *
     * Important: YOU MUST USE the OOP(abstraction,Encapsulation, Inheritance
     * and Polymorphism) concepts in every level possible. Use all kind of
     * keywords(super,this,static,final........)
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */
    static final String companyName = "INFOTECH LTD.";

    /*
     * You must implement the logic for below 2 methods and following 2 methods
     * are prototype as well for other methods need to be design, as you will
     * come up with the new ideas.
     */

    /*
     * you must have multiple constructor. Must implement below constructor.
     */
    public EmployeeInfo(int employeeId) {
        super(employeeId);
    }

    public EmployeeInfo(String name, int employeeId) {
        super(employeeId, name);
    }

    /*
     * This methods should calculate Employee bonus based on salary and
     * performance. Then it will return the total yearly bonus. So you need to
     * implement the logic. Hints: 10% of the salary for best performance, 8% of
     * the salary for average performance and so on. You can set arbitrary
     * number for performance. So you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus(int salary, int performance) {
        if (performance == 4)
            return (int) (salary * 0.10);
        else if (performance == 3)
            return (int) (salary * 0.8);
        else if (performance == 2)
            return (int) (salary * 0.6);
        else if (performance == 1)
            return (int) (salary * 0.4);
        else
            return 0;
    }

    /*
     * This methods should calculate Employee Pension based on salary and
     * numbers of years with the company. Then it will return the total pension.
     * So you need to implement the logic. Hints: pension will be 5% of the
     * salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension(int salary) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // implement numbers of year from above two dates
        // Calculate pension

        int monthJoin = DateConversion.month(joiningDate);
        int yearJoin = DateConversion.year(joiningDate);

        int monthToday = DateConversion.month(todaysDate);
        int yearToday = DateConversion.year(todaysDate);

        int yearsDiff = yearToday - yearJoin;

        if (monthToday > monthJoin)
            yearsDiff--;

        int pension = yearsDiff * 5;
        if (pension > 100)
            pension = 100;

        return (int) (pension * 0.01 * salary);
    }

    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static int month(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            return monthDate;
        }

        public static int year(String date) {
            String[] extract = date.split(",");
            return Integer.parseInt(extract[1]);
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }

    @Override
    public void benefitLayout() {
        int pension = calculateEmployeePension(calculateSalary());
        System.out.println("Bonus: $" + calculateEmployeeBonus(calculateSalary(), getPerformance()));
        System.out.println("Pension: $" + pension);
    }
}
