public class Circle2 {
    double radius;  
    static int numberOfObjects = 0;  
    Circle2() {
        radius = 1; 
        numberOfObjects++;  
    }
    public Circle2(int i) {
        radius = i; 
        numberOfObjects++; 
    }
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    double getArea() {
        return radius * radius * Math.PI; 
    }
}
