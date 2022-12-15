using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    internal class Circle : IShape
    {
        public double radius { get; set; }

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double calculatePerimeter()
        {
            double perimeter;
            perimeter = 2*Math.PI*radius;
            return perimeter;
        }

        public double calculateArea()
        {
            double area;
            area = Math.PI*Math.Pow(radius, 2);
            return area;
        }

    }
}
