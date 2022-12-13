using System;
using System.Collections.Generic;
using System.Text;

namespace Geometry
{
    class Rectangle : IShape
    {
        public double Length { get; set; } //internal private variable, getter, setter

        public double Width { get; set; }

        public Rectangle(double length, double width)
        {
            Length = length;
            Width = width;
        }

        public double CalculateArea()
        {
            return Length * Width;
        }

        public double CalculatePerimeter()
        {
            return 2 * (Length * Width);
        }

    }
}