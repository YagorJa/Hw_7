public class Rectangle extends Figure {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    int getPloscad() {
        return  a * b;
    }

    @Override
    int getPerimetr() {
        return (a + b) * 2;
    }
}
