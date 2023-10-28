 /* 
Author: Jahnavi Singh Chauhan
Roll no: R2142220526 
SAP ID: 500102342
Date: 29 September 2023 
*/

import java.util.Scanner;

interface InterfaceA {
    void setCenter(int x, int y);
}

interface InterfaceB {
    void setRadius(int radius);
}

class Circle implements InterfaceA, InterfaceB {
    public int x, y;
    public int radius;
    public int id;
    private static int nextID = 1;
    // private static int circleCounter = 0;

    Circle() {
        id = nextID++;
        // circleCounter++;
    }

    public void setCenter(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void displayProperties() {
        System.out.println("Circle " + id + ":");
        System.out.println("Center Co-ordinates: (" + x + "," + y + ")");
        System.out.println("Radius Length: " + radius);
        System.out.println();
    }
}

public class exp5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circle circle1 = new Circle();
        System.out.println("Enter center coordinates (x1 y1) for Circle 1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        circle1.setCenter(x1, y1);

        System.out.println("Enter radius length for Circle 1:");
        int radius1 = scanner.nextInt();
        circle1.setRadius(radius1);

        Circle circle2 = new Circle();
        System.out.println("Enter center coordinates (x2 y2) for Circle 2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        circle2.setCenter(x2, y2);

        System.out.println("Enter radius length for Circle 2:");
        int radius2 = scanner.nextInt();
        circle2.setRadius(radius2);

        scanner.close();

        circle1.displayProperties();
        circle2.displayProperties();
    }
}