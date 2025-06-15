public class CarInfo {
    public static void main(String[] args) {
        // Declare and initialize a String variable for the car's make
        //String make = "Ford";

        // Declare and initialize a String variable for the car's model
        //String model = "Mustang";

        // Declare and initialize an integer variable for the car's year
        //int year = 2022;

        // Declare and initialize a double variable for the car's mileage
        //double mileage = 15002.5;

        // Declare and initialize a boolean variable for automatic transmission
        //boolean isAutomatic = true;

//                System.out.println("Car Make: " + make);
//                System.out.println("Car Model: " + model);
//                System.out.println("Car Year: " + year);
//                System.out.println("Car Mileage: " + mileage + " miles");
//                System.out.println("Is the car automatic: " + isAutomatic);
//            }
//        }


        //Strings and arrays

        /*String- A sequence of characters represented internally as an array of the char data type
          They are immutable, once created, can't be changed, have to create a entirely new string.
            STRING itself is an object having several methods which can be used for performing operations on it
            For a social media app, we can decide how many characters should be there in the user name
         */

        String text = "Worried about the future";
        String name1 = "banana";
        String name2 = " Banana";

        int length = text.length();
        char letter = text.charAt(3);
        String str1to4 = text.substring(1,4); // does not include the end position
        boolean output1 = name2.equals(name1);
        boolean output2 = name2.equalsIgnoreCase(name1);
        String textinUpperCase = text.toUpperCase();
        String textinLowerCase = text.toLowerCase();
        boolean result = text.contains("aana");
        boolean isStudent = true;






        System.out.println("text string is having length: " + length);
        System.out.println("Letter at index 3 is: "+ letter);
        System.out.println(" The substring from index 1 to 4. 4 excluded:" + str1to4);
        System.out.println("Using equals method \"" + name2 + "\" is equal to \"" + name1 + "\": " + output1);

    }
}



