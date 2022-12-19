using System;
using System.Collections.Generic;
using System.Text;

namespace Geometry
{
    class Circle : IShape
    {
        public double Radius { get; set; }

        public Circle(double radius)
        {
            Radius = radius;
        }

        public double calculateArea()
        {
            return Math.PI * Math.Pow(Radius, 2);
        }

        public double calculatePerimeter()
        {
            return 2 * Math.PI * Radius;
        }
    }
}
