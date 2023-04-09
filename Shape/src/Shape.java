public abstract class Shape{

    public static void print(){
        System.out.println("Shape");
    }

    public abstract double getArea();

    public  abstract double getPerimeter();
    public static void main(String[] args){
        Triangle obj1 = new Triangle();
        Rectangle obj2 = new Rectangle();
        ShapeDescriber.discribe(obj1);
        System.out.println();
        ShapeDescriber.discribe(obj2);
    }
}
