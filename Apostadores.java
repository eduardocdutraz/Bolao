public class Apostadores {
    private String nome;
    private Float saldo;
    private String cpf;
    private int pontuacaoTotal;
    private int apostaMandante;//colocar
    private int apostaVisitante;//colocar

    /*GETTERS AND SETTERS
    ==================*/
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPontuacaoTotal() {
        return this.pontuacaoTotal;
    }

    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }
    
    public int getApostaMandante() {
        return apostaMandante;
    }

    public void setApostaMandante(int apostaMandante) {
        this.apostaMandante = apostaMandante;
    }

    public int getApostaVisitante() {
        return apostaVisitante;
    }

    public void setApostaVisitante(int apostaVisitante) {
        this.apostaVisitante = apostaVisitante;
    }

    }
