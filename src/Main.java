public class Main {

    static void add(int sum) {
        double average;
        average=sum/4;
        System.out.println("the sum of the temperature is " + sum);
        System.out.println("the average of the temperature is " + average);
        if (average==20){

System.out.println( " the average of our temperatures is normal ");}
else if(average<20 && average>15){
    System.out.println(" the average of our temperatures is warm ");
        }
        else if(average<15 ){
            System.out.println(" the average of our temperatures is cool ");
        }

    }
    public static void main(String[] args) {

        while (true) {

            int sum;
        int num=1;
            System.out.println(  "  the  temperature of the day 1 " +num  );

            int num2=23;
            System.out.println( "  the  temperature of the day 2  " +num2  );

            int num3=15;
            System.out.println( "  the  temperature of the day 3 " +num3 );

            int num4=12;
            System.out.println( "  the  temperature of the day 4 " +num4  );




            sum = num2 + num + num3 +num4;
       add (sum);
            break;
        }

    }
}
