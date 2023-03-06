using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChickenFarmSimulator.ChickenFarmModel
{
    internal class ChickenFarmer
    {
        public String name { get; set; }
        public Coop[] coops { get; set; }  
        public void add(Coop coop) { }
        public void remove(int coopId) { }
        public void resetIteration() { }
        public Coop next()
        {
            return new Coop();
        }
    }
}
