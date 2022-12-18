using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    internal class Circle : IShape
    {
        public double Radius { get; set; }
        public Circle(double radius)
        {
            Radius = radius;
        }

        public double calculatePerimeter()
        {
            return 2 * Math.PI * Radius;
        }
        public double calculateArea()
        {
            return Math.PI * Math.Pow(Radius, 2);
        }
    }
}
