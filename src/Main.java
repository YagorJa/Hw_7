public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Rabotyaga rabotyaga = new Rabotyaga();
        Fifa fifa = new Fifa();
        boss.info();
        fifa.info();
        rabotyaga.info();
//        Job job1 = new Boss();
//        Job job2 = new Fifa();
//        Job job3 = new Rabotyaga();
//        Circle circle = new Circle(6);
//        Rectangle rectangle = new Rectangle(4,22);
//        Triangle triangle = new Triangle(4,9,7);
//        circle.getPerimetr();
//        circle.getPloscad();
//        triangle.getPerimetr();
//        triangle.getPloscad();
//        rectangle.getPerimetr();
//        rectangle.getPloscad();
        Figure[] figures = new Figure[3];
        figures[0] = new Triangle(4,9,7);
        figures[1] = new Circle(7);
        figures[2] = new Rectangle(4,22);
        int sumP = 0;
        for (Figure figure : figures){
            sumP += figure.getPerimetr();
        }
        System.out.println("Сумма всех периметров: "+sumP);
        
        try {
            Student original = new Student("Егор");
            Student clone = (Student) original.clone();
            System.out.println(clone.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
