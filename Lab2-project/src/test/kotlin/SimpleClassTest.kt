import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SimpleClassTest {
    @Test
    fun testGreet() {
        val simpleClass = SimpleClass()
        assertEquals("Hello, World!", simpleClass.greet())
    }
}