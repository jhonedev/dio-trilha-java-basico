package list.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatosMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }
    
    //metodos
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (! agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Jonathan", 123456);
        agendaContatos.adicionarContato("Jonathan", 5665);
        agendaContatos.adicionarContato("Jonathan Borges", 1111111);
        agendaContatos.adicionarContato("Jonathan DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Jonathan", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Jonathan DIO"));
    }
}
