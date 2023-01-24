using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChickenFarmSimulator.ec.edu.espe.chickenfarm.model
{
    internal class ChickenFarmer
    {
        public string name { get; set; }
        public ChickenCoop[] coops { get; set; }


        public void add(ChickenCoop coop)
        {

        }

        public void remove(int coopId)
        {

        }

        public void resetlteration()
        {

        }

        public ChickenCoop next()
        {
            return new ChickenCoop();
        }
    }
}
