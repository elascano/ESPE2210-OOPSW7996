using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChickenFarmSimulator.ec.edu.espe.chickenfarm.model
{
    internal class ChickenCoop
    {
        public int id { get; set; }
        public Chicken[] chickens { get; set; }


         public void add(Chicken chicken)
        {
           
        }

        public void remove(int chickenId)
        {

        }

        public void resetlteration()
        {

        }

        public Chicken next()
        {
            Console.WriteLine("next");
            return new Chicken();
        }
    }
}
