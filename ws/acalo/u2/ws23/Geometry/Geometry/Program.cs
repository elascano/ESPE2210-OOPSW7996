using System;

namespace Geometry
{
    class Program
    {
        static void Main(string[] args)
        {
            Rectangle rectangle = new Rectangle(5, 3);
            Circle circle = new Circle(16.6667);
            Square square = new Square(17);
            
            Console.WriteLine("RECTANGLE");
            Console.WriteLine("Area: " + rectangle.CalculateArea());
            Console.WriteLine("Perimeter: " + rectangle.CalculatePerimeter());
            Console.WriteLine("");
            Console.WriteLine("CIRCLE");
            Console.WriteLine("Area: " + circle.CalculateArea());
            Console.WriteLine("Perimeter: " + circle.CalculatePerimeter());
            Console.WriteLine("");
            Console.WriteLine("SQUARE");
            Console.WriteLine("Area: " + square.CalculateArea());
            Console.WriteLine("Perimeter: " + square.CalculatePerimeter());

        }
    }
}
