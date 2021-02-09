import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    private static List<Rectangle> Rectangles;

    public static void main(String[] args) {

        Rectangles = GetRandomRectanglesArray(20);
        // a) figury o większym obwodzie niż polu
        List<Rectangle> a = Rectangles.stream().filter( rect->rect.getArea()<rect.getPerimeter() ).collect(Collectors.toList());
        // b) rosnąco figury według pola
        List<Rectangle> b = Rectangles.stream().sorted((x, y)->Double.compare(x.getArea(), y.getArea())).collect(Collectors.toList());
        // c) malejąco według obwodu
        List<Rectangle> c = Rectangles.stream().sorted((x, y)->Double.compare(y.getPerimeter(), x.getPerimeter())).collect(Collectors.toList());
        //d) średnią obwodów wszystkich figur,
        double d = Rectangles.stream().mapToDouble(Rectangle::getPerimeter).average().getAsDouble();
        //e) sumę pól wszystkich figur
        double e = Rectangles.stream().mapToDouble(Rectangle::getArea).sum();


        Map<Double, Rectangle> map = Rectangles.stream().collect(Collectors.toMap(Rectangle::getArea, Function.identity()));
    }

    private static List<Rectangle> GetRandomRectanglesArray(int length) {
        List<Rectangle> rects = new ArrayList<Rectangle>();
        double min = 1;
        double max = 30;
        for (int i=0; i<length; i++) {
            rects.add(new Rectangle(min + Math.random() * (max - min), min + Math.random() * (max - min)) );
        }
        return rects;
    }
}
