using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Geometry
{
    class Square : IShape
    {
        private double Side { get; set; }
        public Square(double side){
            Side = side;
        }
        public double CalculateArea(){
            return Side * Side;
        }
        public double CalculatePerimeter(){
            return 2 * Side + 2 * Side;
        }
    }
}
