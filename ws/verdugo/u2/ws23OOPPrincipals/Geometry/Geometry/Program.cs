using Geometry;
using System;

namespace Geometry
{
    class Program
    {
        static void Main(string[] args)
        {
            Circle circle = new Circle(16.6667);
            Square square = new Square(17);
            Rectangle rectangle = new Rectangle(5,3);

            IShape[] shapes = { rectangle, square , circle };

            foreach (IShape shape in shapes)
            {
                Console.WriteLine(shape.calculatePerimeter());
                Console.WriteLine(shape.calculateArea());
            }
        }
    }
}
