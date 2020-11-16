package sequenceTest;

import com.githubcolomboDavide7.sequence.*;
import com.githubcolomboDavide7.utils.DoubleFilamentFactory;
import org.junit.*;

import static org.junit.Assert.*;

public class sequenceTest {

    @Test
    public void shouldCreateDNASequence(){
        System.out.println("* DNA sequence: shouldCreateDNASequence()\n");
        StringBuilder dna = new StringBuilder().append("TACTTCGTACTG");
        DoubleFilamentFactory.make("dna", dna);
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        System.out.println("* Sequence: shouldThrowIllegalArgumentException()\n");
        DoubleFilamentFactory.make("rna", new StringBuilder());
    }

    @Test
    public void shouldMatchSequences(){
        System.out.println("* Sequence: shouldMatchSequences()\n");
        StringBuilder dna = new StringBuilder().append("TACTTCGTACTG");
        Sequence dnaSeq = DoubleFilamentFactory.make("dna", dna);
        Sequence dnaCopy = DoubleFilamentFactory.make("dna", dna);
        assertTrue(dnaSeq.matchSequence(dnaCopy));
    }

    @Test
    public void shouldReturnReverseComplement(){
        System.out.println("* Double filament sequence: shouldReturnReverseComplement()\n");
        DoubleFilamentSequence dna = DoubleFilamentFactory.make("dna", new StringBuilder().append("ATGCTCGAATACTTGCAG"));
        DoubleFilamentSequence reverseComplement = dna.reverseComplement();
        DoubleFilamentSequence toMatch = new DNASequence(new StringBuilder().append("CTGCAAGTATTCGAGCAT"));
        assertTrue(reverseComplement.matchSequence(toMatch));
    }

    @Test
    public void shouldTranscriptDNA(){
        System.out.println("* Double filament sequence: shouldTranscriptDNA()\n");
        DoubleFilamentSequence dna = DoubleFilamentFactory.make("dna", new StringBuilder().append("ATGCTCGAATACTTGCAG"));
        SingleFilamentSequence mrna = dna.transcript();
        SingleFilamentSequence toMatch = new mRNASequence(new StringBuilder().append("UACGAGCUUAUGAACGUC"));
        assertTrue(mrna.matchSequence(toMatch));
    }

}
