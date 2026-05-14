package chapter1;

public class Constructor1Lesson {
    public static void main(String[] args) {
        Chick chick1 = new Chick();
        Chick chick2 = new Chick();
        Chicken andoks = new Chicken();
        chick1.Chick();
        System.out.println(chick1.getNumber());
    }

}

class Chick{
    String number;
    public Chick(){ 
        System.out.println("🐣 Im am a constructor - new Chick Object");
    }
    void Chick(){
        System.out.println("🐤💬");
    }
    String getNumber(){
        return number;
    }
}

class Chicken{
    int numEggs = 0;
    String name;
    public Chicken(){
        name = "Duke";
    }
}
