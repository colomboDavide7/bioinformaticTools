package proteinTest;

import com.githubcolomboDavide7.geneticCode.Codon;
import com.githubcolomboDavide7.geneticCode.ICodon;

import com.githubcolomboDavide7.protein.Amminoacid;
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
}
