public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello Mahesh");
        System.out.println(123);


        //I am a single line comment

        /* I am multi line comment

         */

        //data types

        byte num = 1;
        short num1 = 20;
        int num2 = 30000;
        long num3 = 3000000;
        float num4 = 3.24f;
        double num5 = 4.33333d;
        char alphabet = 'A';
        boolean output = true;

        //non primitive datatype

        String name = "";
        int[] numbers = {};


        byte[] value = {1, 2, 34, 4, 5, 6, 4};
        short[] value1 = {1, 22, 132, 34, 4, 32};
        int[] value2 = {1, 22, 132, 34, 4, 32};
        long[] value3 = {1, 22, 132, 34, 4, 32};
        float[] value4 = {1.1f, 22.4f, 132.3f};
        double[] value5 = {1.22, 22.4, 132.4, 34.7, 4.33, 32.66};
        char[] value6 = {'a', 's', 'f'};
        boolean[] value7 = {true, false, false, true, false};

        // declare multiple variables single line

        int x = 1, y = 10, z = 100;

        // declare multiple variables with single value

        int number, number1, number2;

        number = number1 = number2 = 10;

        System.out.println(number1);
        System.out.println(number);
        System.out.println(number2);

        //type casting

        String typecastingwidening = "byte - short - char - int - float - double";

        String typecastingnarrowing = "double- float - int - char - short - byte";

        //for type casting first declare second variable and then initialize the value syntax issue so.

       /* not good practise

        int weight = 10;
        float weight1 = weight;

        */

        int weight = 10;

        float weight1;  //good practice

        weight1 = weight;

        //narrow typecasting

        double sum =30.34;

        int sum2;

        sum2 = (int)sum;

        System.out.println(sum2);

        //type casting java problems

        double sum3 = 15.4;

        float sum4 = (float) sum3;

        long sum5 = (long) sum3;

        int sum6 = (int) sum3;

        char sum7 = (char) sum3;

        short sum8 = (short) sum3;

        byte sum9 = (byte) sum3;

        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);
        System.out.println(sum7);
        System.out.println(sum8);
        System.out.println(sum9);




    }
}
