using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Threading.Tasks;

namespace Geometry
{
    class Square: IShape
    {    
        public double Side { get; set; }
        

        public Square(double side)
        {
           Side = side;
            
        }
      

        public double calculateArea()
        {
            return Side * Side;
        }

        public double calculatePerimeter()
        {
            return  4*(Side);
        }



    }
}
