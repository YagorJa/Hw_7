public  class Triangle extends Figure {
int a;
int b;
int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    int getPloscad() {
        int s = (a + b + c) / 2;
      return (int) Math.sqrt (s * (s - a) * (s - b) * (s - c));
    }

    @Override
    int getPerimetr() {
        return a+b+c;
    }
}
