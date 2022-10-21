package bracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {

    @Test
    @DisplayName("bracket 테스트")
    void bracket(){
        //solve_bracket_return_boolean
        SolveBracket solveBracket = new SolveBracket();
        assertTrue(solveBracket.solution("()()"));
        assertTrue(solveBracket.solution("(())()"));
        assertFalse(solveBracket.solution(")()("));
        assertFalse(solveBracket.solution("(()("));
        assertFalse(solveBracket.solution( "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"
        ));

    }
}