package org.example.enums.homework_6;

import java.util.Scanner;

public enum PizzaSize {
    SMALL(4),

    MEDIUM(6.5),

    LARGE(10.2);


    private final double VALUE_OF_PIZZAS;

    public double getVALUE_OF_PIZZAS() {
        return VALUE_OF_PIZZAS;
    }

    PizzaSize(double VALUE_OF_PIZZAS) {
        this.VALUE_OF_PIZZAS = VALUE_OF_PIZZAS;
    }


    /**
     * This method count and give us how our pizza will cost.
     */
    public void pizzaSize(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\n\nWhat size pizza would you like? (small, medium, large) -> ");
    String sizeOfPizza = scanner.nextLine();
    System.out.print("\nHow many toppings would you like? (1-5)  -> ");
    int numberOfToppings = scanner.nextInt();  double sum;
switch (sizeOfPizza){
    case "small":
        if (numberOfToppings > 5){
            System.out.print("\nPlease Choose valid numbers toppings");
            pizzaSize(); return;
        }
        sum = SMALL.getVALUE_OF_PIZZAS() ;
        System.out.println("\nYour pizza will cost $" + sum);
        break;
        case "medium":
            if (numberOfToppings > 5){
                System.out.print("\nPlease Choose valid numbers toppings");
                pizzaSize(); return;
            }
        sum = MEDIUM.getVALUE_OF_PIZZAS() + numberOfToppings;
        System.out.println("\nYour pizza will cost $" + sum);
        break;
        case "large":
            if (numberOfToppings > 5){
                System.out.print("\nPlease Choose valid numbers toppings");
                pizzaSize();  return;
            }
        sum = LARGE.getVALUE_OF_PIZZAS() + numberOfToppings * 0.8;
        System.out.println("\nYour pizza will cost $" + sum);
        break;
    default:
        System.out.println("\nPlease choose valid size: ");
        pizzaSize();
}
}
}
