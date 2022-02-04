import org.junit.jupiter.api.Test;
import ro.fasttrackit.curs16.RecursiveFunctions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
class RecursiveFunctionsTest {
    @Test
    void testStringLength() {
        RecursiveFunctions recursiveFunctions = new RecursiveFunctions();
        assertThat(recursiveFunctions.length(null)).isZero();
        assertThat(recursiveFunctions.length("")).isZero();
        assertThat(recursiveFunctions.length("abc")).isEqualTo(3);
        assertThat(recursiveFunctions.length("Teodora")).isEqualTo(7);
    }

    @Test
    void testdigitsSum(){
     RecursiveFunctions recursiveFunctions = new RecursiveFunctions();
     assertThat(recursiveFunctions.digitSum(3)).isEqualTo(3);
     assertThat(recursiveFunctions.digitSum(123)).isEqualTo(6);
    }
}
