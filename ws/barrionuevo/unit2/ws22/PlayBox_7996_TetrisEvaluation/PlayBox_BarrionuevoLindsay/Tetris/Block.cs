using System.Collections.Generic;

namespace Tetris
{
    public abstract class Block
    {
        //Como base del experimento se debe crear una clase abstracta y luego crear una subclase.
        //Esto no permitará más adelante crear unas subclases reutilizando los mismos metodos de la clase abstracta (Para los 7 bloques diferentes). 
        //Una matriz de posici{on bidimensional que contiene las pocisiones de los bloques en los cuatro estados.
        //line1
        protected abstract Position[][] Tiles { get; }
        //Desplazamiento de inicio que decide donde el bloque se genera en la cuadrícula
        //line2
        protected abstract Position StartOffset { get; }
        //Identificar de n{umero entero para distinguir los bloques
        //line3
        public abstract int Id { get; }
        //Se debe almacenar la rotación actual y el desplazamiento. 
        //line4
        private int rotationState;
        private Position offset;

        //En el constructor se establece al desplazamiento como desplazamiento inicial
        //line5
        public Block()
        {
            offset = new Position(StartOffset.Row, StartOffset.Column);

        }
        //Método que retorne las posiones de la cuadrícula ocupadas por el bloque.
        //Teniendo en cuando la rotación actual y el desplazamiento. 
        //Recorre las posiciones de los bloques en el estado de rotación actual y agrega el desplazamiento de fila y columna
        //line6
        public IEnumerable<Position> TilePositions()
        {
            foreach (Position p in Tiles[rotationState])
            {
                yield return new Position(p.Row + offset.Row, p.Column + offset.Column);
            }

        }
        //Método gira el bloque en 90 grados sentido del reloj. 
        //line7
        public void RotateCW()
        {
            rotationState = (rotationState + 1) % Tiles.Length;

        }

        //Método para rotar en sentido contrario del reloj. 
        //line8
        public void RotateCCW()
        {
            if (rotationState == 0)
            {
                rotationState = Tiles.Length - 1;
            }
            else
            {
                rotationState--;
            }

        }
        //Método para mover por un número de filas y columnas
        //line9
        public void Move(int rows, int columns)
        {
            offset.Row += rows;
            offset.Column += columns;

        }
        //Método de reinicio que restablece la rotación y posición
        //line10
        public void Reset()
        {
            rotationState = 0;
            offset.Row = StartOffset.Row;
            offset.Column = StartOffset.Column;

        }
    }
}
