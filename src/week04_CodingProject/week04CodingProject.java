/* Coding Steps
 * 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
			i. Make sure that there are 9 elements of type int in this new array.  
			ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 
			iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
		c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.

	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
	
	3. How do you access the last element of any array?
	
	4. How do you access the first element of any array?

	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	
	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	
	10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

 * */




package week04_CodingProject;

public class week04CodingProject {

    public static void main(String[] args) {
    	
        // Step 1: Create an array 'ages'
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a: Subtract the value of the first element from the last element with array ages
        int value1 = ages[ages.length - 1] - ages[0];
        System.out.println("Subracting first from last element: " + value1);

        // b-i: Create a new array 'ages2' with 9 elements
        int[] ages2 = {7, 12, 17, 19, 22, 23, 4, 42, 112};

        // b-ii: Subtracting the value of the first element from the last with new array ages2
        int value2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Subtracting first from last element " +value2);

        // b-iii: Show that using the index values for the elements is dynamic
    
        System.out.println("Length of the array ages: " + ages.length);
        
        System.out.println("Length of the array ages2 : " + ages2.length);

        // c:: Use a loop to iterate through the array and calculate the average age
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }

        // Calculate average
        double average = sum / ages.length;

        // Print the average age
        System.out.println("Average age: " + average);
        
        // Step 2: Create the array 'names'
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        
        // a: Use a loop to calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        
        // Calculate average number of letters
        double averageLetters = (double) totalLetters / names.length;
        
        // Print the average number of letters per name
        System.out.println("Average number of letters per name: " + averageLetters);
        
        // b: Use a loop to concatenate all names together, separated by spaces
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }

        // Step 2.b: Print the concatenated names
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());
        
        
        // Step 3: How do you access the last element of any array?
        
        // Declare array then create a lastElement variable
        // Example: numbers array [ 1, 2, 3, 4, 5, 6, 7]
        
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
       
        int lastElement = numbers[numbers.length - 1];

        System.out.println("Last element: " + lastElement);
        
        // Step 4: How do you access the first element of any array?
        // Declare array then create a first element variable
        //Example: numbers2 array [ 12, 13, 14, 15, 16, 17]
        
        int[] numbers2 = {12, 13, 14, 15, 16, 17};

        int firstElement = numbers2[0];

        System.out.println("First element: " + firstElement);
        
        // step 5 : Create a new array of int called nameLengths. 
        // Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

        // Creating a new array to store the lengths of names
        int[] nameLengths = new int[names.length];

        // Iterating over the names array and adding the length of each name to nameLengths array
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Print the name lengths
        System.out.print("Name lengths: ");
        for (int length : nameLengths) {
            System.out.print(length + " ");
        }
        
        // Step 6: Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
        // Print the result to the console.
        
        // Calculate the sum of all elements in nameLengths array
        int sum2 = 0;
        for (int length : nameLengths) {
            sum2 += length;
        }
        System.out.println("\nSum of name lengths: " + sum2);
        
        // Step 7: Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
        // (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
        
        String result = concatenateWord("Unlock", 7);
        System.out.println(result);    
        
        // Usage of createFullName method for Step 8
        String fullName = createFullName("John", "Smith");
        System.out.println(fullName);
 
        // Step 9 : Usage of taking in an array of int and returning true if the sum of all the ints in the array is greater than 100 
        int[] numbers3 = {30, 40, 35, 42, 72}; // Example array of integers
        boolean isSumGreaterThan100 = isSumGreaterThan100(numbers3);
        System.out.println("Is the sum greater than 100? " + isSumGreaterThan100);
        
        
        // Step 10: Write a method that takes an array of double and returns the average of all the elements in the array.
        double[] elements1 = {56.5, 37.86, 25.75, 65.25}; // Example array of doubles
        double average1 = calculateAverage1(elements1);
        System.out.println("Average: " + average1);
        
        // Step 11:  Write a method that takes two arrays of double and 
        // returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
        double[] array1 = {75.5, 67.85, 22.71, 54.25}; // Example array 1 of doubles
        double[] array2 = {12.96, 46.07, 17.52, 88.06};    // Example array 2 of doubles

        boolean result1 = compareAverages2(array1, array2);
        System.out.println("Is the average of array1 greater than array2? " + result1);
        
        // Step 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
        // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
        
        boolean isHotOutside = true;
        double moneyInPocket = 17.12;

        boolean result2 = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Will buy a drink? " + result2);
    	
        
    	// Step 13: Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

    	int[] sequence = {1, 2, 4, 5, 6}; // Missing number: 3

    	int missingNumber = findMissingNumber(sequence);
    	System.out.println("Missing number: " + missingNumber);

    }

// Below are the methods for Steps 7 to 13

   // Step 7:  Method to concatenate a word to itself n number of times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(word);
        }

        return result.toString();
    	}
     
    
   // Step 8: Write a method that takes two Strings, firstName and lastName, and returns a full name 
   // The String has to be declare before the method
   // (the full name should be the first and the last name as a String separated by a space).
   
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
        
    
    // Step 9 : Method to check if the sum of integers in the array is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }
        
    // Step 10 : Method to calculate the average of elements in the array
    public static double calculateAverage1(double[] array) {
        if (array.length == 0) {
            return 0.0; // To handle division by zero if the array is empty
        }

        double sum = 0.0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    	}
    
    // Step 11:  Method to compare the averages of elements in two arrays
    public static boolean compareAverages2(double[] array1, double[] array2) {
        double average1 = calculateAverage2(array1);
        double average2 = calculateAverage2(array2);

        return average1 > average2;
    }
    // Step 11:  Method to calculate the average of elements in an array
    public static double calculateAverage2(double[] array) {
        if (array.length == 0) {
            return 0.0; // To handle division by zero if the array is empty
        }

        double sum = 0.0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }
    
    // Step 12: Method to determine if the person will buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
    
    
    // Step 13: Method to find the missing number in a sequence from 1 to n
    public static int findMissingNumber(int[] sequence) {
        int n = sequence.length + 1; // Total number of elements including the missing one
        int expectedSum = n * (n + 1) / 2; // Sum of the sequence without the missing number
        int actualSum = 0;

        for (int num : sequence) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
    
    
 /* This method takes an array representing a sequence from 1 to n with one number missing and returns the missing number. 
 	I created this method because finding a missing number in a sequence is a common problem, and having a reusable method for it can be useful in various scenarios.
 	The method calculates the expected sum of the sequence using the formula for the sum of the first n natural numbers. 
 	It then calculates the actual sum of the given sequence and returns the difference between the expected sum and the actual sum, which represents the missing number. 
 	This method could be helpful in scenarios where you need to identify missing elements in numerical sequences.
  */
    
}
