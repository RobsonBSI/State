public class StatusSolteiro extends StatusRelacionamento{

    private StatusSolteiro() {};
    private static  StatusSolteiro instance = new  StatusSolteiro();
    public static  StatusSolteiro getInstance() {
        return instance;
    }

    @Override
    public String getStatus() {
        return "Solteiro";
    }
    public boolean namorando(Pessoa pessoa) {
        pessoa.setStatus(StatusNamorando.getInstance());
        return true;
    }

}
