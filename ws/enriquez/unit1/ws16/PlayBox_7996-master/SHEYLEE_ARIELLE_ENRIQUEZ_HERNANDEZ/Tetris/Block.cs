using System.Collections.Generic;

namespace Tetris
{
    public abstract class Block
    {
        //Como base del experimento se debe crear una clase abstracta y luego crear una subclase.
        //Esto no permitará más adelante crear unas subclases reutilizando los mismos metodos de la clase abstracta (Para los 7 bloques diferentes). 
        //Una matriz de posici{on bidimensional que contiene las pocisiones de los bloques en los cuatro estados.
        //line1
        protected abstract 
        //Desplazamiento de inicio que decide donde el bloque se genera en la cuadrícula
        //line2
        protected abstract 
        //Identificar de n{umero entero para distinguir los bloques
        //line3
        public abstract 
        //Se debe almacenar la rotación actual y el desplazamiento. 
        //line4
        private 
        private 

        //En el constructor se establece al desplazamiento como desplazamiento inicial
        //line5
        public Block()
        {

        }
        //Método que retorne las posiones de la cuadrícula ocupadas por el bloque.
        //Teniendo en cuando la rotación actual y el desplazamiento. 
        //Recorre las posiciones de los bloques en el estado de rotación actual y agrega el desplazamiento de fila y columna
        //line6
        public IEnumerable<Position> TilePositions()
        {

        }
        //Método gira el bloque en 90 grados sentido del reloj. 
        //line7
        public void RotateCW()
        {

        }

        //Método para rotar en sentido contrario del reloj. 
        //line8
        public void RotateCCW()
        {

        }
        //Método para mover por un número de filas y columnas
        //line9
        public void Move(int rows, int columns)
        {

        }
        //Método de reinicio que restablece la rotación y posición
        //line10
        public void Reset()
        {

        }
    }
}
