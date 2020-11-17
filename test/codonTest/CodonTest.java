package codonTest;

import com.githubcolomboDavide7.geneticCode.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CodonTest {

    @Test
    public void shouldMatchStartCodon(){
        System.out.println("* Genetic Code: shouldReturnStartCodon()\n");
        List<ICodon> codons = SequenceConverter.sequence2CodonList(new StringBuilder("UACGAGCUUAUGAACGUC"));
        assertTrue(codons.get(0).matchCodon(ValidCodon.make("UAC")));
    }

    @Test
    public void shouldReturnUndefinedCodonType(){
        System.out.println("* Genetic Code: shouldReturnUndefinedCodonType()\n");
        ValidCodon t = ValidCodon.make("AA");
        assertEquals(CodonType.UNDEFINED, t.type);
    }

    @Test
    public void shouldTestCodonType(){
        System.out.println("* Genetic Code: shouldTestCodonType()\n");
        ICodon c = Codon.make(ValidCodon.make("AUG"));
        assertEquals(true, c.isStartCodon());
    }

}
