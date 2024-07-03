package AulasJava.Matheus.Aula5_ProgramaçãoOrientadaPOO.Os_Quatro_Pilares_POO;


public abstract class Veiculo { // Aqui vamos utilizar o segundo pilar da POO que seria a herançã
    // criamos aqui então a classe Veiculo e utilizamos como classe Pai, para fazer as outras classes herdarem ela
    // utilizando o extends, assim as classes utilizam o metodo criado Chassi. 
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public abstract void ligar(); // Aqui setamos um metodo que sera utilizado nas classes porém com comportamentos diferentes em cada uma.
    
}
