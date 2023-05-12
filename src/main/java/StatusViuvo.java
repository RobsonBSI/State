public class StatusViuvo extends StatusRelacionamento{

    private StatusViuvo() {};
    private static   StatusViuvo instance = new  StatusViuvo();
    public static StatusViuvo getInstance() {
        return instance;
    }
    @Override
    public String getStatus() {
        return "Viuvo";
    }

    public boolean namorando(Pessoa pessoa) {
        pessoa.setStatus(StatusNamorando.getInstance());
        return true;
    }

}
