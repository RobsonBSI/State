public class Pessoa {
    private String nome;
    private StatusRelacionamento status;

    public Pessoa() {
        this.status = StatusSolteiro.getInstance();
    }

    public void setStatus(StatusRelacionamento status) {
        this.status = status;
    }

    public boolean solteiro() {
        return status.solteiro(this);
    }
    public boolean casado() {
        return status.casado(this);
    }
    public boolean divorciado() {
        return status.divorciado(this);
    }
    public boolean viuvo() {
        return status.viuvo(this);
    }
    public boolean namorando() {
        return status.namorando(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusRelacionamento getStatus() {
        return status;
    }
    public String getNomeStaus() {
        return status.getStatus();
    }
}
