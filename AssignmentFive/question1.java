class Mammals{
    void func(){
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    void func(){
        System.out.println("I am a marine animal");
    }
    void funcParent(){
        super.func();
    }
}
class BlueWhale extends MarineAnimals{
    void func(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    void funcParent1(){
        super.func();
    }
    void funcParent2(){
        super.funcParent();
    }
}

public class question1{
    public static void main(String args[]){
        Mammals mammal = new Mammals();
        MarineAnimals marineAni = new MarineAnimals();
        BlueWhale blueW = new BlueWhale();

        mammal.func();
        marineAni.func();
        blueW.func();

        blueW.funcParent1();
        blueW.funcParent2();
    }
}