package gen;

import java.util.*;

public class Perfil {

    private String nome;
    private int idade;
    private String email;
    private String endereco;
    private int telefone;
    private String cpf;
    private String bandeira;
    private String numeroCartao;
    private String plano;
    private String login;
    private String senha;

    public Perfil(String nome, int idade, String email, String end, int tel, String cpf, String band, String nc,
                  String plano, String login, String senha)
    {
        setNome(nome);
        setIdade(idade);
        setEmail(email);
        setEndereco(end);
        setTelefone(tel);
        setCpf(cpf);
        setBandeira(band);
        setNumeroCartao(nc);
        setPlano(plano);
        setLogin(login);
        setSenha(senha);

    }

    // - Construtor para a classe UserInterface
    public Perfil(String nome, String email, String plano, String login, String senha)
    {
        setNome(nome);
        setEmail(email);
        setPlano(plano);
        setLogin(login);
        setSenha(senha);

    }
    
    // - Construtor para login e senha
    
    public Perfil(String email, String login, String senha)
    {
        setEmail(email);
        setLogin(login);
        setSenha(senha);
        
    }
    
    public void alterarSenha() {

        System.out.println("\n\n-----ALTERAÇÃO DE SENHA-----");


        System.out.print("\nDigite a senha antiga: ");

        Scanner read = new Scanner(System.in);
        String aux = read.next();

        if (aux.equals(this.senha)) {

            System.out.print("\nDigite a nova senha: ");

            aux = read.next();

            setSenha(aux);
            System.out.println("\nSenha alterada com sucesso. ");

        }

        else {
            System.out.println("\nSenha incorreta! ");

        }


    }

    public void alterarEmail() {

        System.out.println("\n\n-----ALTERAÇÃO DE EMAIL-----");


        System.out.print("\nDigite a senha: ");

        Scanner read = new Scanner(System.in);
        String aux = read.next();

        if (aux.equals(this.senha)) {

            System.out.print("\nDigite o novo Email: ");

            aux = read.next();

            setEmail(aux);
            System.out.println("\nEmail alterado com sucesso. ");

        }

        else {
            System.out.println("\nSenha incorreta! ");

        }


    }

    public void alterarPlano() {

        System.out.println("\n\n-----ALTERAÇÃO DE PLANO-----");


        System.out.print("\nDigite a senha: ");

        Scanner read = new Scanner(System.in);
        String aux = read.next();

        if (aux.equals(this.senha)) {

            System.out.println("Escolha o novo plano: (1-Individual | 2-Casal | 3-Família)");

            int x = read.nextInt();

            if (x < 0 || x > 3) {
                while (x < 0 || x > 3) {

                    System.out.println("Plano inválido! Digite novamente.");
                    x = read.nextInt();
                }
            }

            if (x == 1) {

                setPlano("Individual");
                System.out.println("Plano Individual selecionado!");

            } else if (x == 2) {

                setPlano("Casal");
                System.out.println("Plano Casal selecionado!");

            } else if (x == 3) {

                setPlano("Família");
                System.out.println("Plano Família selecionado!");

            }

        }

        else
        {
            System.out.println("\nSenha incorreta! ");

        }
    }

    public void validarDados() {

        if (getCpf().length() != 11) {
            System.out.println("\n--CPF Inválido--");
        } else {
            System.out.println("\n--CPF Válido--");
        }

        if (getIdade() < 14) {

            System.out.println("\n--PERFIL CLASSIFICADO COMO INFANTIL-- ");

        }

        else {
            System.out.println("\n--PERFIL CLASSIFICADO COMO ADULTO-- ");
        }

        if (getNumeroCartao().length() != 16) {
            System.out.println("\n--Número de cartão Inválido--");
        } else {
            System.out.println("\n--Número de cartão Válido--");
        }

    }

    public void apresentarDados() {

        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nEmail: " + email + "\nEndereço: " + endereco
                + "\nTelefone: " + telefone + "\nCPF: " + cpf + "\nBandeira do Cartão: " + bandeira
                + "\nNúmero do Cartão: " + numeroCartao + "\nPlano: " + plano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
