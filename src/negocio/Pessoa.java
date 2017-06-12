package negocio;

import java.util.List;


public class Pessoa {
    private String nome;
    private String cpf;
    private String cidade;
    private int idade;
    private String profissao;
    private String email;
    
    
    public String imprimirPessoa(){
        return "Nome: "+getNome()+" Idade:"+getIdade()+""
              + "Email: "+getEmail()+" CPf:"+getCpf()+""  
              + "Cidade: "+getCidade()+" Profissao:"+getProfissao()+"";
    }
    
    public Pessoa() {
        
    }
    
    public Pessoa(String nome, int idade, String cidade, String cpf, 
            String email, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.cpf = cpf;
        this.email = email;
        this.profissao = profissao;
          
    }
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public String getProfissao() {
        return profissao;
    }

    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
}
