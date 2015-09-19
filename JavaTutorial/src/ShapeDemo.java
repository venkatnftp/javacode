public class ShapeDemo {
	public static void main(String[] args) {
		Shape c = new Circle(6.0);
		Shape r = new Rectangle(3, 4);
		Shape t = new RightAngledTriangle(10, 20);
		System.out.println("Area of circle: "+c.getArea()+" , Perimiter:"+c.getPerimeter());
		System.out.println("Area of Rectangle: "+r.getArea()+" , Perimiter:"+r.getPerimeter());
		System.out.println("Permiter of RightAngledTriangle::"+t.getPerimeter());
		Shape et = new EquilateralTriangle(10);
		System.out.println("Permiter of EquilateralTriangle::"+et.getPerimeter());
	}
}
