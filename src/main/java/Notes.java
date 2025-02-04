
class Notes {
	public static void main(String[] args) {

		//Output - This is how your program interacts with users

		System.out.println("Hello World"); //outputs then outputs a new line
		System.out.print(8); //outputs
		System.out.println("Same line");
		// System.out.printf();

		//Variables

		//declaring variables - Creating the variables

		int num; //whole numbers
		String word; //text
		double fracNum; //fractional numbers
		boolean trueFalse; //true or false
		char c; //single character (numbers, letters, symbols, space etc.)
	
		//lowercase first letter data types are primitive - they cannot be broken down into other data types
		//Uppercase first letter datat type is non-primitive - can be broken down into other data types
	
		//Assign a variable

		num = 4; //stores the value 4 in num
		//this does not mean num is equal to 4
		word = "Hello";

		//escape character - "\"
		//change the functionality of the following character

		// \n - newline character
		System.out.println("Hello\nHello");
		// \t - tab
		// \" - changes from being a string ending delimiter to a normal character
		// \\ - change the escape character to a normal backlash character

		fracNum = 3.5;
		fracNum = 4.0; //4.0 != 4

		trueFalse = true;
		c = ' '; //character use single quotes
		c = '!';

		//Variable call - use the variable
		//This is done when the variable is NOT on the left side of an assignment symbol (=)

		//replaces the variable with a copy of the value

		num = 10;
		System.out.println(num); //System.out.println(10);


		//Addition

		System.out.println(10 + 5);
		num = 3 + 7;
		System.out.println(num);

		//Subtration (-), Multiplication (*), Division (/), Mod (%) - remainder of a division question
		
		num = 5 - 4;
		System.out.println(num);

		num = num + 1; //num = 1 + 1;
		num++; //only used to increase by 1
		++num;
		num += 2;
	
		// -=, *=, /=, %=

		//Division
		//When doing division between 2 integers, the result is also an integer

		System.out.println(8/5); //1
		System.out.println(2.0 + 8 / 5); //3.0

		num = 5;
		System.out.println(num++); //the increase comes AFTER the rest of the code runs
		
		num = 5;
		System.out.println(++num); //the increase happens BEFORE the rest of the code runs
	
		System.out.println(10%3); //Remainder of 1
	}
}
