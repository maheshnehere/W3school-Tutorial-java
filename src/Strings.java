import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String name = "Mahesh";
        String lastname = "nehere";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.isBlank());
        System.out.println(name.concat(lastname));
        System.out.println(name.toCharArray());
        System.out.println(name.isEmpty());

        //concatenation of string 2 ways

        String name1 = "sandesh";
        String surname = "nehere";

        System.out.println(name.concat(surname));// 1 method

        System.out.println(name+" "+surname);// 2 method

        //numbers and string concatenation

        int num1=10,num2 =20;
        System.out.println(num1+num2);//when two numbers added result will be number.

        String car1 = "10",car2 = "20";
        System.out.println(car1+car2);//when two number strings added result will be string concat.

        //when two strings(number and alphabet) added result will be string concat.
        int num3 =15;
        String num4 = "23";
        System.out.println(num1+num4);

        //special characters

        String text = "I am from \"pune\" maharsahtra"; //double quotes.
        String text1 = "I am from \'pune\' maharsahtra"; //single quotes.

        String text3 = "Hello!\n world";
        System.out.println(text3); //new line.

        String text4 = "Hello!\t world";
        System.out.println(text4); //spaces

        String text5 = "Hello!\r world";
        System.out.println(text5);// return on next line.



    }
}
