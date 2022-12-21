using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    class Circle : IShape
    {
        private double Radius { get; set; }
        public Circle(double radius){
            Radius = radius;
        }
        public double CalculateArea(){
            return 3.14 * Radius * Radius;
        }
        public double CalculatePerimeter(){
            return 2 * 3.14 * Radius;
        }
    }
}
