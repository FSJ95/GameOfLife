# GameOfLife

# World
2 dimensional grid of a finite size of your choice, say 100 * 100 positions.  
Each position contains either nothing or a cell.

# Generations
The simulation consist of generations. From each genera- tion to the next, the cells either die, survive or are born as new cells depending upon the previous generation.

# Cell Rules
1. Under-population :
Any live cell with fewer than two live neighbors dies.
2. Surviving :
Any live cell with two or three live neighbors lives on.
3. Overcrowding :
Any live cell with more than three live neighbors dies.
4. Reproduction :
Any dead cell with exactly three live neighbors becomes a live cell.
