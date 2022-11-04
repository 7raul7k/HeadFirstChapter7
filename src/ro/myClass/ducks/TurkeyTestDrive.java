package ro.myClass.ducks;

public class TurkeyTestDrive {
    public TurkeyTestDrive(){

    }
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter((Duck) duck);
        for(int i = 0 ; i < 10;i++){
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
