package me.whiteship.refactoring._06_mutable_data._18_split_variable;

public class Rectangle {

    private double perimeter;
    private double area;

    public void updateGeometry(double height, double width) {
        // 여기서 temp 변수가 여러번 할당 됨.
        // 1. 지름을 구할 때, 2. 넓이를 구할 때 둘다 사용.
//        double temp = 2 * (height + width);
        final double perimeter = 2 * (height + width);
        System.out.println("Perimeter: " + perimeter);
        this.perimeter = perimeter;

//        temp = height * width;
        final double area = height * width;
        System.out.println("Area: " + area);
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}
