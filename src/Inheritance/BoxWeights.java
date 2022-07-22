package Inheritance;

public class BoxWeights extends Box {
    double weights;

    public BoxWeights(){
        this.weights = -1;
    }

    public BoxWeights(double l, double w, double h, double weights) {
        super(l, w, h);
        this.weights = weights;
    }
}
