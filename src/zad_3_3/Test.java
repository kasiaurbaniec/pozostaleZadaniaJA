package zad_3_3;

public class Test {
    public static void main(String[] args) {
        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);
        System.out.println("start" + start.toString());
        System.out.println("end" + end.toString());
        Date today = new Date(2019, 3, 17);
        today = start;
        System.out.println("today" + today.toString());
        today.setYear(2016);
        today.setDay(17);
        System.out.println("today po zmianie" + today.toString());
        System.out.println("start po zmianie" + start.toString());
        end = today;
        System.out.println("end po zmianie" + start.toString());

        Date parsed = Date.of("20-4-2017");
        Date toParse = Date.of("21/09/2019");

        System.out.println("ze stringa: " + parsed);
        System.out.println("ze stringa: " + toParse);


    }
}
