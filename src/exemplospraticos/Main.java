package exemplospraticos;

import exemplospraticos.BasicoVariaveisMetodos.ConversaoDeDados;
import exemplospraticos.BasicoVariaveisMetodos.Operadores;
import exemplospraticos.BasicoVariaveisMetodos.TiposDeDados;
import exemplospraticos.BasicoVariaveisMetodos.VariaveisMetodos;

public class Main {

    public static void main(String[] args) {
        // Instancia de Tipos de dados para mostrar no terminal
        //TiposDeDados tiposDeDados = new TiposDeDados();
        //tiposDeDados.MostrarTipos();

        // Instancia de Conversor de dados para mostrar no terminal
        //ConversaoDeDados conversaoDeDados = new ConversaoDeDados();
        //conversaoDeDados.MostrarConversoes();

        // Instancia de Operadores paa mostrar no terminal
        //Operadores operadores = new Operadores();
        //operadores.mostrarOperadores();

        VariaveisMetodos variaveisMetodos = new VariaveisMetodos();
        variaveisMetodos.nome = "Maria";
        variaveisMetodos.sobrenome = "Nazaré";
        variaveisMetodos.telefone = "1299999-8888";
        variaveisMetodos.MostrarDados();
        variaveisMetodos.CompararNome("José");
        variaveisMetodos.MostrarNomeComSobrenome();
        int codigoCliente = variaveisMetodos.retornarCodigoComoInteiro(); // o metódo retorna um valor por isso temos que atribui-lo a um variável
    }
}
