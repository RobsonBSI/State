public class StatusCasado extends StatusRelacionamento {

    private StatusCasado() {};
    private static   StatusCasado instance = new   StatusCasado();
    public static  StatusCasado getInstance() {
        return instance;
    }
    @Override
    public String getStatus() {
        return "Casado";
    }

    public boolean viuvo(Pessoa pessoa) {
        pessoa.setStatus(StatusViuvo.getInstance());
        return true;
    }

    public boolean  divorciado(Pessoa pessoa) {
        pessoa.setStatus(StatusDivorciado.getInstance());
        return true;
    }
}
