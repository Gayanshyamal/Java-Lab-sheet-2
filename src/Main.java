public class Main {
    static void main(String[] args) {
//
//        int days_in_week[]; // declaration of array
//        int[] day ; // this java type array
//
//        days_in_week = new int[10]; // creation of array
//        day = new int[5];

//        int day[] = new int[5];
//
//        // Declare and initialize a short array
//        short[] temperatures = { 22, 24, 23, 21, 20 };
//        // Access and print values from the array
//        System.out.println("Temp at 2nd hour: " + temperatures[1]);
//        // Calculate and print the length of the array
//        int length = temperatures.length;
//        System.out.println("Number of temperature readings: " + length);
//        // Update an element in the array
//        temperatures[0] = 25;
//        System.out.println("Temp at 1st hour:" + temperatures[0]);

        Bicycle bicycle = new Bicycle();

        System.out.println(bicycle.getOwnerName());
        System.out.println(bicycle.getId());
        System.out.println(bicycle.getContactNo());

        bicycle.setOwnerName("Gayan");
        bicycle.setId(5511);
        bicycle.setContactNo("0765402839");

        Bicycle bicycle1 = new Bicycle(75);
        System.out.println(bicycle1.getId());

        Bicycle bicycle2 = new Bicycle("Gayan",85,"0765402839");
        System.out.println(bicycle2.getId());



    }
}