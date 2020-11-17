package geneticCode;

import com.githubcolomboDavide7.geneticCode.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CodonTest {

    @Test
    public void shouldMatchStartCodon(){
        System.out.println("* Genetic Code: shouldReturnStartCodon()\n");
        List<Codon> codons = CodonFactory.make(new StringBuilder("UACGAGCUUAUGAACGUC"));
        Codon toMatch = new MiddleSequenceCodon("UAC");
        assertTrue(codons.get(0).matchCodon(toMatch));
    }

    @Test
    public void shouldReturnUndefinedCodonType(){
        System.out.println("* Genetic Code: shouldReturnUndefinedCodonType()\n");
        CodonType t = ValidCodon.make("AA");
        assertEquals(CodonType.UNDEFINED, t);
    }

}
