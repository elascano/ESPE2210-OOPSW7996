using System;

namespace Geometry
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Rectangle rectangle = new Rectangle(5, 3);
            Square square = new Square(17);
            Circle circle = new Circle(16.6667);

            Console.WriteLine("Rectangle");
            Console.WriteLine("Area: " + rectangle.CalculateArea());
            Console.WriteLine("Perimeter: " + rectangle.CalculatePerimeter());
            Console.WriteLine("Square");
            Console.WriteLine("Area: " + square.CalculateArea());
            Console.WriteLine("Perimeter: " + square.CalculatePerimeter());
            Console.WriteLine("Circle");
            Console.WriteLine("Area: " + circle.CalculateArea());
            Console.WriteLine("Perimeter: " + circle.CalculatePerimeter());



        }
    }
}
