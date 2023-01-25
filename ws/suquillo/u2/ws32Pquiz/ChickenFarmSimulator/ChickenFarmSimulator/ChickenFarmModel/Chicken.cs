using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChickenFarmSimulator.ChickenFarmModel
{
    internal class Chicken
    {
        public int id { get; set; } 
        public string name { get; set; }
        public string color { get; set; }
        public int age { get; set; }
        public bool isMolting { get; set; }
        public void doStuff(int fortime) { }
        private static void cluck() { }
        private static void wander() { }
            
        private static void eat() { }
        private static void drink() { }
        private static void poop() { }
        private static Egg LayAnEgg()
        {
            return new Egg();
        }


    }
}
