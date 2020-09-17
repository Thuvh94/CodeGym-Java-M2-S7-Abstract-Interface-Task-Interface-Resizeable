public class Main {
    public static void main(String[] args) {
        Shape[] Shapes = new Shape[3];
        Shapes[0] = new Circle(5.5);
        Shapes[1] = new Rectangle(7.8,2.3);
        Shapes[2] = new Square();

        for(Shape shape:Shapes){
            System.out.println("Before resize: "+shape);
        }
        double randomPercent = Math.round(Math.random()*100);
        System.out.println("Resize percent: " + randomPercent +"%");
        for(Shape shape:Shapes) {
            shape.Resize(randomPercent);
            System.out.println("After resize: " + shape);
        }

    }
}
