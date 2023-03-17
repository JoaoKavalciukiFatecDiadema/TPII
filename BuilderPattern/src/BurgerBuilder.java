public class BurgerBuilder extends Burger{




    Burger burger;

    public void addBread(String bread){
        this.burger.setBread(bread);
    }

    public void addCheese(String cheese){
        this.burger.setCheese(cheese);
    }

    public void addMeat(String meat){
        this.burger.setMeat(meat);
    }

    public void addVegetables(String vegetables){
        this.burger.setVegetables(vegetables);
    }
    public BurgerBuilder(String bread, String meat, String cheese, String vegetables, Burger burger) {
        addBread(bread);
        addMeat(meat);
        addCheese(cheese);
        addVegetables(vegetables);
        this.burger = burger;
    }

}
