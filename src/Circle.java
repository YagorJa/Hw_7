public class Circle extends Figure{
int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    int getPloscad() {
       return (int) (4 * Math.PI * r *r);

    }

    @Override
    int getPerimetr() {
        return (int) (+ 2 * Math.PI * r);
    }
}
