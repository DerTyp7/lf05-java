package unit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {

    @Test
    void givenPQ_whenSingleSolution_solutionOk(){
        assertEquals(Double.NaN, unit.Pq1.pq(1,1)[0], "Sehr hilfreiche Message");
        assertEquals(Double.NaN, unit.Pq1.pq(1,1)[0], "Noch eine sehr hilfreiche Message");
        assertEquals(Double.NaN, unit.Pq1.pq(1,1)[0], "Eine weitere unglaublich hilfreiche Message");
    }

    @ParameterizedTest
    @MethodSource("givenPQ_whenDoubleSolution_solutionOk")
    void givenPQ_whenSingleSolution_solutionOk(double p, double q){
        assertEquals(Double.NaN, unit.Pq1.pq(1,1)[0], "Sehr hilfreiche Message");
    }

    static Stream<Arguments> givenPQ_whenDoubleSolution_solutionOk(){
        return Stream.of(
                Arguments.of(4,4,-2),
                Arguments.of(4,3,-2)
        );
    }

}
