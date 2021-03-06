import org.scalatest.{FlatSpec, Matchers}
import calclexer.IntCalculatorLexer
import calclexer.IntCalculatorLexer.{Integer, Operator}

class IntCalculatorLexerSpec extends FlatSpec with Matchers {

  private val result = Vector(Integer(1), Operator('+'), Integer(2))

  private val result2 = result ++ Vector(Operator('*'),
                                         Integer(9),
                                         Operator('-'),
                                         Integer(2))

  "SimpleTokenizer" should "process operators and single digit numbers" in {
    IntCalculatorLexer.run("1+2") should be(result)
    IntCalculatorLexer.run("1+2*9-2") should be(result2)
  }

  it should "handle single whitespaces" in {
    IntCalculatorLexer.run("1 +2 ") should be(result)
    IntCalculatorLexer.run(" 1 + 2 * 9 - 2 ") should be(result2)
  }

  it should "handle any number of whitespaces" in {
    IntCalculatorLexer.run("1    +2 ") should be(result)
    IntCalculatorLexer.run(" 1 + 2 * 9    - \n 2  ") should be(result2)
  }

  it should "process integers with more than one digits" in {
    IntCalculatorLexer.run("123 + 256") should be(
      Vector(Integer(123), Operator('+'), Integer(256)))
  }

}
