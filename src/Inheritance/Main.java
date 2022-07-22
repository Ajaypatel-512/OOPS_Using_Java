package Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        Box box1 = new Box(4.0);
//        Box box2 = new Box(box1);
//
//        System.out.println(box1.l+" "+ box1.w+" "+ box1.h+" ");
//        System.out.println(box2.l+" "+ box2.w+" "+ box2.h+" ");

//        BoxWeights boxWeights = new BoxWeights();
        BoxWeights boxWeights = new BoxWeights(1.0,2.0,3.0,4.0);
        System.out.println(boxWeights.l+" "+boxWeights.weights);
    }
}
