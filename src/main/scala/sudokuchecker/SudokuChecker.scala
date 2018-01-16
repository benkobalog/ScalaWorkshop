package sudokuchecker

object SudokuChecker {

  def run(grid: Array[Array[Char]]): Boolean = sudoku2(grid)

  def isLegal(nums: Seq[Char]): Boolean = {
    val noDots = nums.filter(_ != '.')
    noDots.length == noDots.distinct.length
  }

  def sudoku2(grid: Array[Array[Char]]): Boolean = {
    val squares =
      for {
        tileX <- 0 to 6 by 3
        tileY <- 0 to 6 by 3
      } yield
        for {
          offsetX <- 0 to 2
          offsetY <- 0 to 2
        } yield grid(tileX + offsetX)(tileY + offsetY)

    (grid.map(_.toSeq) ++ grid.transpose.map(_.toSeq) ++ squares)
      .forall(isLegal)
  }

}
