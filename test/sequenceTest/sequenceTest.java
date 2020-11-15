package sequenceTest;

import com.githubcolomboDavide7.sequence.Sequence;
import com.githubcolomboDavide7.sequence.SequenceType;
import com.githubcolomboDavide7.utils.SequenceFactory;
import org.junit.*;

import static org.junit.Assert.*;

public class sequenceTest {

    @Test
    public void shouldCreateDNASequence(){
        System.out.println("* DNA sequence: shouldCreateDNASequence()\n");
        StringBuilder dna = new StringBuilder().append("TACTTCGTACTG");
        SequenceFactory.make(SequenceType.make("DNA"), dna);
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        System.out.println("* DNA sequence: shouldThrowIllegalArgumentException()\n");
        SequenceType.make("fail");
    }

    @Test
    public void shouldMatchSequences(){
        System.out.println("* DNA sequence: shouldMatchSequences()\n");
        StringBuilder dna = new StringBuilder().append("TACTTCGTACTG");
        Sequence dnaSeq = SequenceFactory.make(SequenceType.make("DNA"), dna);
        Sequence dnaCopy = SequenceFactory.make(SequenceType.make("dna"), dna);
        assertTrue(dnaSeq.matchSequence(dnaCopy));
    }

}
