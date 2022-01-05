import io.shiftleft.codepropertygraph.Cpg
import io.shiftleft.codepropertygraph.generated.nodes._
import io.shiftleft.codepropertygraph.generated.{EdgeTypes, nodes}
import io.shiftleft.semanticcpg.language._
import overflowdb.Edge
import overflowdb.traversal._

object IntellijTest {
  def main(args: Array[String]): Unit = {
    val cpg = Cpg.withStorage("foobar.cpg")
    val call = cpg.call("ASSIGN").l.head
    val thing = call.cfgNext.repeat(_.cfgNext)(_.until(_.filter(x => true))).l.head
    println(thing.code)
  }
}
