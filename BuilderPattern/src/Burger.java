public class Burger {

    String bread;

    public Burger(String bread, String meat, String cheese, String vegetables) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetables = vegetables;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    String meat;
    String cheese;
    String vegetables;

}
