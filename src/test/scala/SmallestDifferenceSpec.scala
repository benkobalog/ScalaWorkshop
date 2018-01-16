import org.scalatest._
import smallestdifference.SmallestDifference

class SmallestDifferenceSpec extends FlatSpec with Matchers {

  "SmallestDifference.run" should "return correct values for a list" in {
    val list  = List(1, 2, 5, 9, 12, 123, 1233)
    SmallestDifference.run(list).get should be(1)

    val list2 = List(-123, 33, 11, -100, -32, -32)
    SmallestDifference.run(list2).get should be(0)
  }

  it should "return None for empty lists" in {
    SmallestDifference.run(List[Int]()) should be (None)
  }

  it should "return None for lists with 1 element" in {
    SmallestDifference.run(List(1)) should be (None)
  }
}
