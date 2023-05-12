public class StatusDivorciado extends StatusRelacionamento {

    private StatusDivorciado() {};
    private static   StatusDivorciado instance = new   StatusDivorciado();
    public static  StatusDivorciado getInstance() {
        return instance;
    }
    @Override
    public String getStatus() {
        return "Divorciado";
    }

    public boolean casado(Pessoa pessoa) {
        pessoa.setStatus(StatusCasado.getInstance());
        return true;
    }

    public boolean namorando(Pessoa pessoa) {
        pessoa.setStatus(StatusNamorando.getInstance());
        return true;
    }
}
