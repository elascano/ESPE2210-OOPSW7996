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

            IShape[] shapes = { rectangle, square, circle };

            foreach (IShape shape in shapes)
            {
                Console.WriteLine(shape.calculateArea());
                Console.WriteLine(shape.calculatePerimeter());

            }

        }
    }
}
