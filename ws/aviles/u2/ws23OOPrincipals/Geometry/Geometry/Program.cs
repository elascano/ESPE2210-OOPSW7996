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


            Console.WriteLine("------------");
            Console.WriteLine("Rectangle (5,3) :");
            Console.WriteLine("Area: " + rectangle.CalculateArea());
            Console.WriteLine("Perimeter: " + rectangle.CalculatePerimeter());
            Console.WriteLine("------------");
            Console.WriteLine("Square (17) :");
            Console.WriteLine("Area: " + square.CalculateArea());
            Console.WriteLine("Perimeter: " + square.CalculatePerimeter());
            Console.WriteLine("------------");
            Console.WriteLine("Circle (16.6667) :");
            Console.WriteLine("Area: " + circle.CalculateArea());
            Console.WriteLine("Perimeter: " + circle.CalculatePerimeter());
            Console.WriteLine("------------");

        }
    }
}