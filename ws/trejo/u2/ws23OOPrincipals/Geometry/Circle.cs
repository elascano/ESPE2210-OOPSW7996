using Geometry;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PruebaPracticaOOP2P
{
    internal class Circle : IShape
    {
        double Radius { get; set; }
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