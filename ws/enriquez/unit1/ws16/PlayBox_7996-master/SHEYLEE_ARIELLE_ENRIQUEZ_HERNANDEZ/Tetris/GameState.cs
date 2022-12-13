namespace Tetris
{
    //Manejo de las interacciones
    public class GameState
    {
        //Propiedad de respaldo para el bloque actual
        private Block currentBlock;
        //Cuadno actualizamos el bloque actual se llama al método de reinicio para restablecer la posición inicialy rotación
        public Block CurrentBlock
        {
            get => currentBlock;
            private set
            {
                currentBlock = value;
                currentBlock.Reset();

                for (int i = 0; i < 2; i++)
                {
                    currentBlock.Move(1, 0);

                    if (!BlockFits())
                    {
                        currentBlock.Move(-1, 0);
                    }
                }
            }
        }
        //Propiedades de cuadrícula, la cola de bloques y un estado para terminar el juego
        //line1
        public 
        public 
        public 
        public 
        public 
        public 
        //En el constructor se inicializa la cuadrícula del juego con 22 filas y 10 columnas
        //Se inicializa la cola de bloques y se utiliza para obtener bloques aleatorios con la propiedad de bloque actual
        public GameState()
        {
            GameGrid = new GameGrid(22, 10);
            BlockQueue = new BlockQueue();
            CurrentBlock = BlockQueue.GetAndUpdate();
            CanHold = true;
        }
        //Método para verificar si el bloque está una posición ilegal o no.
        //Recorre la cuadricula y si algún bloque está fuera o encima de otro retorna false caso contrario true. 
        private bool BlockFits()
        {
            foreach (Position p in CurrentBlock.TilePositions())
            {
                if (!GameGrid.IsEmpty(p.Row, p.Column))
                {
                    return false;
                }
            }

            return true;
        }
        //Método para mantener el bloque en cola
        public void HoldBlock()
        {
            if (!CanHold)
            {
                return;
            }

            if (HeldBlock == null)
            {
                HeldBlock = CurrentBlock;
                CurrentBlock = BlockQueue.GetAndUpdate();
            }
            else
            {
                Block tmp = CurrentBlock;
                CurrentBlock = HeldBlock;
                HeldBlock = tmp;
            }

            CanHold = false;
        }
        //Método para rotar el bloque en sentido del reloj si es posible
        public void RotateBlockCW()
        {
            CurrentBlock.RotateCW();

            if (!BlockFits())
            {
                CurrentBlock.RotateCCW();
            }
        }
        //Método para rotar el bloque encontra del sentido reloj si es posible
        public void RotateBlockCCW()
        {
            CurrentBlock.RotateCCW();

            if (!BlockFits())
            {
                CurrentBlock.RotateCW();
            }
        }
        //Método para mover el bloque hacia la izquierda
        public void MoveBlockLeft()
        {
            CurrentBlock.Move(0, -1);

            if (!BlockFits())
            {
                CurrentBlock.Move(0, 1);
            }
        }
        //Método para mover el bloque hacia la derecha
        public void MoveBlockRight()
        {
            CurrentBlock.Move(0, 1);

            if (!BlockFits())
            {
                CurrentBlock.Move(0, -1);
            }
        }
        //Método para verificar si el juego se acabo
        //Verifica si alguna de las filas ocultas en la parte superior no está vacia
        private bool IsGameOver()
        {
            return !(GameGrid.IsRowEmpty(0) && GameGrid.IsRowEmpty(1));
        }

        //M{etodo si el bloque actual no se puede mover hacia abajo 
        private void PlaceBlock()
        {
            foreach (Position p in CurrentBlock.TilePositions())
            {
                GameGrid[p.Row, p.Column] = CurrentBlock.Id;
            }

            Score += GameGrid.ClearFullRows();

            if (IsGameOver())
            {
                GameOver = true;
            }
            else
            {
                CurrentBlock = BlockQueue.GetAndUpdate();
                CanHold = true;
            }
        }
        //Método de movimiento hacia abajo
        public void MoveBlockDown()
        {
            CurrentBlock.Move(1, 0);

            if (!BlockFits())
            {
                CurrentBlock.Move(-1, 0);
                PlaceBlock();
            }
        }
        //Método donde toma la posición y retorna el n{umero de celdas vacías inmediantemende de bajo del bloque

        private int TileDropDistance(Position p)
        {
            int drop = 0;

            while (GameGrid.IsEmpty(p.Row + drop + 1, p.Column))
            {
                drop++;
            }

            return drop;
        }
        //Método podemos averiguar cuántas filas se puede mover el bloque actual hacia abajo
  
        public int BlockDropDistance()
        {
            int drop = GameGrid.Rows;

            foreach (Position p in CurrentBlock.TilePositions())
            {
                drop = System.Math.Min(drop, TileDropDistance(p));
            }

            return drop;
        }
        //Método para mover el bloques acutal abajo tantas filas como sea posible y luego lo coloca en la matriz
        public void DropBlock()
        {
            CurrentBlock.Move(BlockDropDistance(), 0);
            PlaceBlock();
        }
    }
}
