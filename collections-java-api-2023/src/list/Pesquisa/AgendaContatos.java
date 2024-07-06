package list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
     
    //metodos
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for(Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jonathan", 123456);
        agendaContatos.adicionarContato("Jonathan", 0);
        agendaContatos.adicionarContato("Jonathan Borges", 1111111);
        agendaContatos.adicionarContato("Jonathan DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Jonathan"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
        agendaContatos.exibirContatos();
    }
}
