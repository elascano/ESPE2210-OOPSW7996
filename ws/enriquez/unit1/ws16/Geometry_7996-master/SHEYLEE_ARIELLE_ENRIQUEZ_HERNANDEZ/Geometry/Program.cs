using System;

namespace Geometry
{
    class Program
    {
        static void Main(string[] args)
        {
            //Rectangle , Square, Circle
            //Area, Perimeter
            //Abstraction
            //Encupsulation
            //Inheritance
            //Polymorphisn
            Rectangle rectangle = new Rectangle(6, 5);
            Square square = new Square(10);
            Circle circle = new Circle(7);

            IShape[] shapes = { rectangle, square, circle };

            foreach (IShape shape in shapes)
            {
                Console.WriteLine(shape.CalculateArea());
                Console.WriteLine(shape.CalculatePerimeter());

            }

        }
    }
}
