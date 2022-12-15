using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    internal class Rectangle : IShape
    {
        public double length { get; set; }
        public double width { get; set; }

        public Rectangle(double length, double width)
        {
            this.length = length;
            this.width = width;
        }

        public double calculateArea()
        {
            double area;
            area = length * width;
            return area;
        }

        public double calculatePerimeter()
        {
            double perimeter;
            perimeter = 2 * (length + width);
            return perimeter;
        }
    }
}
