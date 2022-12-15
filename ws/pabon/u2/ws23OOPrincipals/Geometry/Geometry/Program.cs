using Geometry;
using System;
using System.Data;

class Ejemplo
{
    public static void Main(string[] args)
    {
        Console.WriteLine("  G E O M E T R Y: ");

            Rectangle rectangle = new Rectangle(5, 3);
            Square square = new Square(17);
            Circle circle = new Circle(16.6667);


            Console.WriteLine("--  Rectangle --");
            Console.WriteLine( "Perimeter: " + rectangle.CalculatePerimeter());
            Console.WriteLine( "Area: " + rectangle.CalculateArea());

            Console.WriteLine("--  Square --");
            Console.WriteLine("Perimeter: " + square.CalculatePerimeter());
            Console.WriteLine("Area: " + square.CalculateArea());

            Console.WriteLine("-- Circle  --");
            Console.WriteLine("Perimeter: " + circle.CalculatePerimeter());
            Console.WriteLine("Area: " + circle.CalculateArea());

    }
}
    




