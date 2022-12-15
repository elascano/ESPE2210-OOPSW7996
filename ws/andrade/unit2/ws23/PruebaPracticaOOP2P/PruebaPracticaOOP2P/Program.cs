using System;

namespace PruebaPracticaOOP2P
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Circle circle = new Circle(16.6667);
            Rectangle rectangle = new Rectangle(5, 3);
            Square square = new Square(17);

            IShape[] shapes = { circle, rectangle, square};

            foreach (IShape shape in shapes)
            {
                Console.WriteLine("\nArea of " + shape + " is:");
                Console.WriteLine(shape.CalculateArea());
                Console.WriteLine("Perimeter of " + shape + " is:");
                Console.WriteLine(shape.CalculatePerimeter());
            }

            Console.WriteLine("--- END ---");
        }
    }
}
