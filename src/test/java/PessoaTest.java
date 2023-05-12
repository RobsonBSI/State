import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;
    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }
    @Test
    public void naoDeveMudarStatusSolteiroParaSolteiro() {
        pessoa.setStatus(StatusSolteiro.getInstance());
        assertFalse(pessoa.solteiro());
    }
    @Test
    public void MudarStatusSolteiroParaNamorando() {
        pessoa.setStatus(StatusSolteiro.getInstance());
        assertTrue(pessoa.namorando());
        assertEquals(StatusNamorando.getInstance(), pessoa.getStatus());
    }
    @Test
    public void MudarStatusNamorandoParaSolteiro() {
        pessoa.setStatus(StatusNamorando.getInstance());
        assertTrue(pessoa.solteiro());
        assertEquals(StatusSolteiro.getInstance(), pessoa.getStatus());
    }

    @Test
    public void MudarStatusNamorandoParaCasado() {
        pessoa.setStatus(StatusNamorando.getInstance());
        assertTrue(pessoa.casado());
        assertEquals(StatusCasado.getInstance(), pessoa.getStatus());
    }
    @Test
    public void MudarStatusCasadoParaDivorciado() {
        pessoa.setStatus(StatusCasado.getInstance());
        assertTrue(pessoa.divorciado());
        assertEquals(StatusDivorciado.getInstance(), pessoa.getStatus());
    }
    @Test
    public void MudarStatusCasadoParaViuvo() {
        pessoa.setStatus(StatusCasado.getInstance());
        assertTrue(pessoa.viuvo());
        assertEquals(StatusViuvo.getInstance(), pessoa.getStatus());
    }
    @Test
    public void MudarStatusDivorciadoParaNamorando() {
        pessoa.setStatus(StatusDivorciado.getInstance());
        assertTrue(pessoa.namorando());
        assertEquals(StatusNamorando.getInstance(), pessoa.getStatus());
    }
    @Test
    public void MudarStatusDivorciadoParaCasado() {
        pessoa.setStatus(StatusDivorciado.getInstance());
        assertTrue(pessoa.casado());
        assertEquals(StatusCasado.getInstance(), pessoa.getStatus());
    }

    @Test
    public void MudarStatusViuvoParaNamorando() {
        pessoa.setStatus(StatusViuvo.getInstance());
        assertTrue(pessoa.namorando());
        assertEquals(StatusNamorando.getInstance(), pessoa.getStatus());
    }
    @Test
    public void StatusViuvoParaNamorando() {
        pessoa.setStatus(StatusViuvo.getInstance());
        pessoa.namorando();
        assertEquals("Relacionamento Serio",pessoa.getNomeStaus());
    }
    @Test
    public void StatusSolteiroParaNamorando() {
        pessoa.setStatus(StatusSolteiro.getInstance());
        pessoa.namorando();
        assertEquals("Relacionamento Serio",pessoa.getNomeStaus());
    }
    @Test
    public void StatusDivorciadoParaNamorando() {
        pessoa.setStatus(StatusDivorciado.getInstance());
        pessoa.namorando();
        assertEquals("Relacionamento Serio",pessoa.getNomeStaus());
    }
    @Test
    public void StatusNamorandoParaCasado() {
        pessoa.setStatus(StatusNamorando.getInstance());
        pessoa.casado();
        assertEquals("Casado",pessoa.getNomeStaus());
    }

    @Test
    public void StatusCasadoParaViuvo() {
        pessoa.setStatus(StatusCasado.getInstance());
        pessoa.viuvo();
        assertEquals("Viuvo",pessoa.getNomeStaus());
    }
}