using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace ChickenFarmSimulator.ChickenFarmModel
{
    internal class Coop
    {
        public int id { get; set; }
        public Chicken[] chikens { get; set; }
        public void add(Chicken chicken) { }
        public void remove(int chickenId) { }
        public void resetIteration() { }
        public Chicken next()
        {
            return new Chicken();
        }
    }
}
