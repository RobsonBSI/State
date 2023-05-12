public class StatusNamorando extends StatusRelacionamento{

    private StatusNamorando() {};
    private static  StatusNamorando instance = new  StatusNamorando();
    public static  StatusNamorando getInstance() {
        return instance;
    }
    @Override
    public String getStatus() {
        return "Relacionamento Serio";}
    public boolean casado(Pessoa pessoa) {
        pessoa.setStatus(StatusCasado.getInstance());
        return true;
    }
    public boolean solteiro(Pessoa pessoa) {
        pessoa.setStatus(StatusSolteiro.getInstance());
        return true;
    }
}
