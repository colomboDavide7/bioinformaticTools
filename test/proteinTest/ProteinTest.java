package proteinTest;

import com.githubcolomboDavide7.geneticCode.Codon;
import com.githubcolomboDavide7.geneticCode.ICodon;

import com.githubcolomboDavide7.protein.Amminoacid;
import com.githubcolomboDavide7.protein.IProtein;
import com.githubcolomboDavide7.protein.Protein;
import com.githubcolomboDavide7.sequence.DoubleFilamentFactory;
import com.githubcolomboDavide7.sequence.DoubleFilamentSequence;
import com.githubcolomboDavide7.sequence.SingleFilamentSequence;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProteinTest {

    @Test
    public void shouldReturnAssociatedAmminoacid(){
        System.out.println("* Ammino test: shouldReturnAssociatedAmminoacid()\n");
        assertEquals("M", Amminoacid.M.toString());
        assertEquals("Met", Amminoacid.M.name);
    }

    @Test
    public void shouldReturnAmminoacidAssociateToCodon(){
        System.out.println("* Ammino test: shouldReturnAmminoacidAssociateToCodon()\n");
        ICodon c = Codon.make("GCG");
        assertTrue(c.matchAmminoacid("A"));
        assertTrue(c.matchAmminoacid("Ala"));
    }

    @Test
    public void shouldReturnUndefinedAmminoacid(){
        System.out.println("* Ammino test: shouldReturnUndefinedAmminoacid()\n");
        ICodon c = Codon.make("AAAA");
        assertTrue(c.isUndefined());
        assertTrue(c.matchAmminoacid(Amminoacid.UNDEFINED.name));
    }

    @Test
    public void shouldMatchProteinSequence(){
        System.out.println("* Ammino test: shouldMatchProteinSequence()\n");
        IProtein p = new Protein(new StringBuilder("YELMNV"));
        assertTrue(p.matchProtein("YELMNV"));
    }

    @Test
    public void shouldReturnProteinFromDNASequence(){
        System.out.println("* Ammino test: shouldReturnProteinFromDNASequence()\n");
        DoubleFilamentSequence dna = DoubleFilamentFactory.make("Dna", new StringBuilder().append("ATGCTCGAATACTTGCAG"));
        SingleFilamentSequence mrna = dna.transcript();
        IProtein p = mrna.translate();
        assertTrue(p.matchProtein("YELMNV"));
    }
}
