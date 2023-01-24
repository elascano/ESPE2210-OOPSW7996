using ChickenFarmSimulator.ec.edu.espe.chickenfarm.model;
using System.Reflection.Emit;
using System;

namespace ChickenFarmSimulator.ec.edu.espe.chickenfarm.view
{
    internal class ChickenFarmSimulator
    {
        static void Main(string[] args)
        {
            Chicken[] chickens = new Chicken[3];

            chickens[0] = new Chicken(1, "Sandra", "yellow", 4, true);
            chickens[1] = new Chicken(2, "Nube", "white", 3, true);
            chickens[2] = new Chicken(3, "Cumandá", "brown", 6, false);

            foreach (Chicken chicken in chickens)
            {
                Console.WriteLine(chicken.ToString());
            }
        }
    }
}