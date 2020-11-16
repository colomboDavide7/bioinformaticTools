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

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        System.out.println("* Genetic Code: shouldThrowIllegalArgumentException()\n");
        ValidCodon.make("ATC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenSequenceLengthIsNotMultipleOfThree(){
        System.out.println("* Genetic Code: shouldThrowExceptionWhenSequenceLengthIsNotMultipleOfThree()\n");
        CodonFactory.make(new StringBuilder().append("AUGAATGCGA"));
        // TODO - evaluate if truncate the sequence or not
    }

}
