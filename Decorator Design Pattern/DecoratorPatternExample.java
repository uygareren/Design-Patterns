// Component interface
interface Coffee {
    String getDescription();
    double cost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}

// Concrete Decorator
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}

// Concrete Decorator
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Basit kahve
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: " + simpleCoffee.cost());
        System.out.println("Description of simple coffee: " + simpleCoffee.getDescription());

        System.out.println("--------------------------------------------------------");

        // Süt eklenmiş kahve
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of milk coffee: " + milkCoffee.cost());
        System.out.println("Description of milk coffee: " + milkCoffee.getDescription());

        System.out.println("--------------------------------------------------------");


        // Şeker eklenmiş süt eklenmiş kahve
        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of sugar milk coffee: " + sugarMilkCoffee.cost());
        System.out.println("Description of sugar milk coffee: " + sugarMilkCoffee.getDescription());
    }
}
