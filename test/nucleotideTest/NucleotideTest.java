package nucleotideTest;

import com.githubcolomboDavide7.Nucleotide.Nucleotide;
import org.junit.*;
import static org.junit.Assert.*;

public class NucleotideTest  {

    @Test
    public void shouldReturnNucleotideByNitrogenBase(){
        System.out.println("* Nucleotides: shouldReturnNucleotideByNitrogenBase()\n");
        char nucleotide = Nucleotide.getNucleotideByNitrogenBase(Nucleotide.A.nitrogenBase);
        assertEquals('A', nucleotide);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException(){
        System.out.println("* Nucleotides: shouldThrowIllegalArgumentException()\n");
        Nucleotide.getNucleotideByNitrogenBase('B');
    }

    @Test
    public void shouldReturnComplementaryDNANucleotide(){
        System.out.println("* Nucleotides: shouldReturnComplementaryDNANucleotide()\n");
        char complementary = Nucleotide.getComplementaryDNANucleotide(Nucleotide.A.nitrogenBase);
        assertEquals('T', complementary);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException_complementaryDNAofU(){
        System.out.println("* Nucleotides: shouldThrowIllegalArgumentException_complementaryDNAofU()\n");
        Nucleotide.getComplementaryDNANucleotide(Nucleotide.U.nitrogenBase);
    }

    @Test
    public void shouldReturnComplementaryRNANucleotide(){
        System.out.println("* Nucleotides: shouldReturnComplementaryRNANucleotide()\n");
        char rnaNucleotide = Nucleotide.getAssociateRNANucleotide(Nucleotide.C.nitrogenBase);
        assertEquals('G', rnaNucleotide);
        rnaNucleotide = Nucleotide.getAssociateRNANucleotide(Nucleotide.A.nitrogenBase);
        assertEquals('U', rnaNucleotide);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException_associateRNAtoU(){
        System.out.println("* Nucleotides: shouldThrowIllegalArgumentException_associateRNAtoU()\n");
        Nucleotide.getAssociateRNANucleotide(Nucleotide.U.nitrogenBase);
    }



}
