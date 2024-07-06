package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //metodos
     public void adicionarConvidados(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
     }

     public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for(Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
     }

     public int contarConvidados() {
        return convidadoSet.size();
     }

     public void exibirConvidados() {
        System.out.println(convidadoSet);
     }
}
