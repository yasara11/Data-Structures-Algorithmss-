/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class RabbitProblem {

    /**
     * Recursive method to calculate rabbit pairs.
     * Logic: F(n) = F(n-1) + F(n-2)
     */
    public static int calculateRabbits(int n) {
        // Base case: Month 1 and Month 2 have only 1 pair
        
        if (n <= 2) {
            return 1;
        }
        // Recursive step
        
        return calculateRabbits(n - 1) + calculateRabbits(n - 2);
    }

    public static void main(String[] args) {
        int months = 12; 

        System.out.println("--- Rabbit Problem Simulation (12 Months) ---");
        System.out.println("Month\tTotal Rabbit Pairs");
        System.out.println("---------------------------");

       
        for (int i = 1; i <= months; i++) {
            System.out.println("Month " + i + ":\t" + calculateRabbits(i));
        }

        System.out.println("---------------------------");
        System.out.println("Total rabbit pairs after 12 months: " + calculateRabbits(months));
        System.out.println("--- Simulation Complete ---");
    }
}