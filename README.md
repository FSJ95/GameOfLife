# Awesome README [![HEY](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/sindresorhus/awesome)
> A curated list of awesome READMEs

# The Game Of Life <h3> by @FSJ95
Implement your own version of The Game of Life, so you can :
- create, read or update in the initial generation
- see the development of generations
- try out different initial generations
- try out other rules
- evt. edit and save a generation

It is important to remember, that what happens between 2 generations happens
simultanously, i.e. at the same time.
## World
2 dimensional grid of a finite size of your choice, say 100 * 100 positions.  
Each position contains either nothing or a cell.

## Generations
The simulation consist of generations. From each genera- tion to the next, the cells either die, survive or are born as new cells depending upon the previous generation.

## Cell Rules
- **Under-population:**. 
  Any live cell with fewer than two live neighbors dies.
- **Surviving:**  
  Any live cell with two or three live neighbors lives on.
- **Overcrowding:**  
  Any live cell with more than three live neighbors dies.
- **Reproduction:**  
  Any dead cell with exactly three live neighbors becomes a live cell.
