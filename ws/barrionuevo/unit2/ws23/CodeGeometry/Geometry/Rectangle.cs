using System;
using System.Collections.Generic;
using System.Text;

namespace Geometry
{
    class Rectangle : IShape
    {
        public double Length { get; set; }

        public double Width { get; set; }

        public Rectangle(double length, double width)
        {
            Length = length;
            Width = width;
        }

        public double calculateArea()
        {
            return Length * Width;
        }

        public double calculatePerimeter()
        {
            return 2 * (Length + Width);
        }

    }
}