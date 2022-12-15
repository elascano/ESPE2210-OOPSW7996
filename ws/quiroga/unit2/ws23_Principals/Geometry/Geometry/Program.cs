using System;

namespace Geometry
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Circle circle1 = new Circle(16.6667);
            Square square1 = new Square(17);
            Rectangle rectangle1 = new Rectangle(5,3);

            Console.WriteLine("The area of the rectangle is: ");
            Console.WriteLine(rectangle1.calculateArea());
            Console.WriteLine("The perimeter of the rectangle is: ");
            Console.WriteLine(rectangle1.calculatePerimeter());

            Console.WriteLine("The area of the circle is: ");
            Console.WriteLine(circle1.calculateArea());
            Console.WriteLine("The perimeter of the circle is: ");
            Console.WriteLine(circle1.calculatePerimeter());
            
            Console.WriteLine("The area of the square is: ");
            Console.WriteLine(square1.calculateArea());
            Console.WriteLine("The perimeter of the square is: ");
            Console.WriteLine(square1.calculatePerimeter());

        }
    }
}
