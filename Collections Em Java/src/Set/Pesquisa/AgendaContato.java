package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    // atributos

    private Set<Contato> contatoSet;
    
    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 5665);
        agendaContato.adicionarContato("Camila Cavalcante", 1111111);
        agendaContato.adicionarContato("Camila DIO", 654987);
        agendaContato.adicionarContato("Maria Silva", 1111111);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisarPorNome("Maria"));

        System.out.println("Contato Atualizado: " + agendaContato.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContato.exibirContato();

    }

}
