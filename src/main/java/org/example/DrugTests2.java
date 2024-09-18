package org.example;
import java.util.Arrays;

    public class DrugTests2 {

        public static void main(String[] args) {
            final int TOTAL_EMPLOYEES = 30;
            final int TOTAL_WEEKS = 52;

            // Array to hold the count of how many times each employee is selected
            int[] employeeCount = new int[TOTAL_EMPLOYEES];

            System.out.println("Employee numbers selected for drug testing each week:");

            // Loop through 52 weeks and select random employees
            for (int week = 1; week <= TOTAL_WEEKS; week++) {
                // Generate a random employee number between 1 and 30
                int testedEmployee = 1 + (int) (Math.random() * TOTAL_EMPLOYEES);

                // Increment the count for the selected employee
                employeeCount[testedEmployee - 1]++;

                // Display the employee number, and format the output to show 4 numbers per line
                System.out.print(testedEmployee + " ");
                if (week % 4 == 0) {
                    System.out.println();  // Start a new line after every 4 employees
                }
            }

            // Display how many times each employee was selected
            System.out.println("\nNumber of times each employee was selected for testing:");
            for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
                System.out.println("Employee #" + (i + 1) + ": " + employeeCount[i] + " times");
            }

            // Display a list of employees who were never selected
            System.out.println("\nEmployees who were never selected for testing:");
            boolean noEmployeesMissed = true;
            for (int i = 0; i < TOTAL_EMPLOYEES; i++) {
                if (employeeCount[i] == 0) {
                    System.out.println("Employee #" + (i + 1));
                    noEmployeesMissed = false;
                }
            }
            if (noEmployeesMissed) {
                System.out.println("All employees were selected at least once.");
            }
        }
    }


