package codonTest;

import com.githubcolomboDavide7.geneticCode.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CodonTest {

    @Test
    public void shouldMatchStartCodon(){
        System.out.println("* Genetic Code: shouldReturnStartCodon()\n");
        List<ICodon> codons = SequenceConverter.sequence2CodonList(new StringBuilder("UACGAGCUUAUGAACGUCAA"));
        assertTrue(codons.get(0).matchCodon("UAC"));
        assertEquals(7, codons.size());
        assertTrue(codons.get(codons.size()-1).isUndefined());
    }

    @Test
    public void shouldReturnUndefinedCodon(){
        System.out.println("* Genetic Code: shouldReturnUndefinedCodon()\n");
        ValidCodon t = ValidCodon.make("AA");
        assertEquals(CodonType.UNDEFINED, t.type);

        ICodon c = Codon.make("AA");
        assertTrue(c.isUndefined());
    }

    @Test
    public void shouldTestCodonType(){
        System.out.println("* Genetic Code: shouldTestCodonType()\n");
        ICodon c = Codon.make("AUG");
        assertTrue(c.isStartCodon());

        c = Codon.make("UAG");
        assertTrue(c.isTerminationCodon());
    }


}
