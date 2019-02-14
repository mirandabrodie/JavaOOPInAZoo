public class Unicorn extends Animal{

    public Unicorn(String name){
        super(name, "marshmallows");
    }

    public void sleep(){
        System.out.println(this.name + " sleeps in a cloud");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }
        sleep();
    }
}
