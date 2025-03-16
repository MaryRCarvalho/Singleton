

import org.example.ConexaoTennantMS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConexaoTennantTeste {

    @Test
    public void deveRetornarNomeUsuario() {
        ConexaoTennantMS.getInstance().setNomeUsuario("Usuário 1");
        assertEquals("Usuário 1", ConexaoTennantMS.getInstance().getNomeUsuario());
    }

    @Test
    public void deveRetornarProdutoUsuario() {
        ConexaoTennantMS.getInstance().setProdutoUsuario("Produto 1");
        assertEquals("Produto 1", ConexaoTennantMS.getInstance().getProdutoUsuario());
    }

}
