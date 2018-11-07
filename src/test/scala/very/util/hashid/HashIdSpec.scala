package very.util.hashid
import org.pico.hashids.Hashids
import org.scalatest._

class HashIdSpec extends FreeSpec with MustMatchers {
  "hashid" - {
    "intId test" in {
      implicit val hash = Hashids.reference("salt", minHashLength = 3)
      IntId(3).hashId mustBe "mw2"

    }
  }

}
