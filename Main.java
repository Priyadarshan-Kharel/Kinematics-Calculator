import java.util.Scanner;

public class Main {


	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float acceleration = 0;
        float initialVelocity = 0;
        float finalVelocity = 0;
        float time = 0;
        float displacement = 0;
//Welcome the user
        System.out.println("Hi, Welcome to the Kinematics Calculator!");

//Ask the user what they want 
        System.out.println("Which value do you need? (acceleration, displacement, initialVelocity, finalVelocity, time)");
        String value = in.nextLine().toLowerCase();

        //value equals acceleration

        if (value.equals("acceleration")) {
        	//start asking the values
            System.out.println("Enter initial velocity (vi), final velocity (vf), and time (t):");

            System.out.print("Initial velocity (vi): ");
            String vi = in.nextLine();
            try {
                initialVelocity = Float.parseFloat(vi);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for initial velocity.");
            }

            System.out.print("Final velocity (vf): ");
            String vf = in.nextLine();
            try {
                finalVelocity = Float.parseFloat(vf);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for final velocity.");
            }

            System.out.print("Time (t): ");
            String t = in.nextLine();
            try {
                time = Float.parseFloat(t);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for time.");
            }
            //write the formula

            acceleration = (finalVelocity - initialVelocity) / time;
            System.out.println("Acceleration (a) = " + acceleration);

            //if value is displacemnet

        } else if (value.equals("displacement")) {

        	//start asking the values
            System.out.println("Enter initial velocity (vi), time (t), and acceleration (a):");

            System.out.print("Initial velocity (vi): ");
            String vi = in.nextLine();
            try {
                initialVelocity = Float.parseFloat(vi);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for initial velocity.");
            }

            System.out.print("Time (t): ");
            String t = in.nextLine();
            try {
                time = Float.parseFloat(t);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for time.");
            }

            System.out.print("Acceleration (a): ");
            String a = in.nextLine();
            try {
                acceleration = Float.parseFloat(a);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for acceleration.");
            }
//use the formula
            displacement = initialVelocity * time + 0.5f * acceleration * time * time;
            System.out.println("Displacement (d) = " + displacement);


            //if the value equals initial velocity
        } else if (value.equals("initialvelocity")) {

        	//start asking the values
            System.out.println("Enter final velocity (vf), acceleration (a), and time (t):");

            System.out.print("Final velocity (vf): ");
            String vf = in.nextLine();
            try {
                finalVelocity = Float.parseFloat(vf);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for final velocity.");
            }

            System.out.print("Acceleration (a): ");
            String a = in.nextLine();
            try {
                acceleration = Float.parseFloat(a);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for acceleration.");
            }

            System.out.print("Time (t): ");
            String t = in.nextLine();
            try {
                time = Float.parseFloat(t);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for time.");
            }
//use the formulas
            initialVelocity = finalVelocity - acceleration * time;
            System.out.println("Initial velocity (vi) = " + initialVelocity);

            // if the value equals final velocity
        } else if (value.equals("finalvelocity")) {
        	//ask the values
            System.out.println("Enter initial velocity (vi), acceleration (a), and time (t):");

            System.out.print("Initial velocity (vi): ");
            String vi = in.nextLine();
            try {
                initialVelocity = Float.parseFloat(vi);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for initial velocity.");
            }

            System.out.print("Acceleration (a): ");
            String a = in.nextLine();
            try {
                acceleration = Float.parseFloat(a);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for acceleration.");
            }

            System.out.print("Time (t): ");
            String t = in.nextLine();
            try {
                time = Float.parseFloat(t);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for time.");
            }
//use the formula
            finalVelocity = initialVelocity + acceleration * time;
            System.out.println("Final velocity (vf) = " + finalVelocity);

            // if the value equals time
        } else if (value.equals("time")) {

        	//ask the user the values

            System.out.println("Enter initial velocity (vi), final velocity (vf), and acceleration (a):");

            System.out.print("Initial velocity (vi): ");
            String vi = in.nextLine();
            try {
                initialVelocity = Float.parseFloat(vi);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for initial velocity.");
            }

            System.out.print("Final velocity (vf): ");
            String vf = in.nextLine();
            try {
                finalVelocity = Float.parseFloat(vf);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for final velocity.");
            }

            System.out.print("Acceleration (a): ");
            String a= in.nextLine();
            try {
                acceleration = Float.parseFloat(a);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for acceleration.");
            }
//formula
            time = (finalVelocity - initialVelocity) / acceleration;
            System.out.println("Time (t) = " + time);
           //\Else nothing is correct than say invalid
        } else {
            System.out.println("Invalid input. Please enter one of the given options.");
        }
//close the scanner and thanks the user for using the programme
        in.close();
        System.out.println("Thank you for using the Kinematics Calculator!");
    }
}
