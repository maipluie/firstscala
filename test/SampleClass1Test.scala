package firstscala
import org.scalatest.FunSuite

class SampleClass1Test extends FunSuite{
	test("SampleClass1.case1"){
	    def c = new SampleClass1()
		assert(c.inclementTwo(3) == 5)
	}
}