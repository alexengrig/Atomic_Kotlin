// Summary2/TicTacToe.kt
import atomictest.eq

class Cell {
  var entry = ' '                   // [1]
  fun setValue(e: Char): String =   // [2]
    if (entry == ' ' &&
      (e == 'X' || e == 'O')) {
      entry = e
      "successful move"
    } else
      "invalid move"
}

class Grid {
  val cells = listOf(
    listOf(Cell(), Cell(), Cell()),
    listOf(Cell(), Cell(), Cell()),
    listOf(Cell(), Cell(), Cell())
  )
  fun play(e: Char, x: Int, y: Int): String =
    if (x !in 0..2 || y !in 0..2)
      "invalid move"
    else
      cells[x][y].setValue(e)       // [3]
}

fun main(args: Array<String>) {
  val grid = Grid()
  grid.play('X', 1, 1) eq "successful move"
  grid.play('X', 1, 1) eq "invalid move"
  grid.play('O', 1, 3) eq "invalid move"
}