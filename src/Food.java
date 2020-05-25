public abstract class Food implements Type {
//    String description = "Unknown Food";
//    public String getDescription () {
//        return description;
//    }
//    public abstract double cost();
    protected Type decoratedType;

    public Food(Type decoratedType) {
        this.decoratedType = decoratedType;
    }

    public void getOrder() {
        decoratedType.getType();
    }
}
