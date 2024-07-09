package OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefalist;
    // Cria um Lista:
    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }
    // Adiciona uma tarefa na lista:
    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }    
    // Removendo a tarefa que tem a descricao informada:
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }
    // Verifica a quantidade de elementos dentro da lista:
    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }
    // Imprimir no terminal a lista completa:
    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
