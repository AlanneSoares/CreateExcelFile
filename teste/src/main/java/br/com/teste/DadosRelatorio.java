package br.com.teste;

public class DadosRelatorio {

    private String protocolo;
    private String numero;
    private String ds_mensagem;
    private String dt_recebimento;
    private String dt_primeira;
    private String status;
    private String login;
    private String nome;
    private String dt_finalizacao;
    private String intermediacao;

    public DadosRelatorio() { }

    public DadosRelatorio(String protocolo, String numero, String ds_mensagem, String dt_recebimento, String dt_primeira, String status, String login, String nome, String dt_finalizacao, String intermediacao) {

        super();

        this.protocolo = protocolo;
        this.numero = numero;
        this.ds_mensagem = ds_mensagem;
        this.dt_recebimento = dt_recebimento;
        this.dt_primeira = dt_primeira;
        this.status = status;
        this.login = login;
        this.nome = nome;
        this.dt_finalizacao = dt_finalizacao;
        this.intermediacao = intermediacao;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDs_mensagem() {
        return ds_mensagem;
    }

    public void setDs_mensagem(String ds_mensagem) {
        this.ds_mensagem = ds_mensagem;
    }

    public String getDt_recebimento() {
        return dt_recebimento;
    }

    public void setDt_recebimento(String dt_recebimento) {
        this.dt_recebimento = dt_recebimento;
    }

    public String getDt_primeira() {
        return dt_primeira;
    }

    public void setDt_primeira(String dt_primeira) {
        this.dt_primeira = dt_primeira;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDt_finalizacao() {
        return dt_finalizacao;
    }

    public void setDt_finalizacao(String dt_finalizacao) {
        this.dt_finalizacao = dt_finalizacao;
    }

    public String getIntermediacao() {
        return intermediacao;
    }

    public void setIntermediacao(String intermediacao) {
        this.intermediacao = intermediacao;
    }

    @Override
    public String toString() {
        return "DadosRelatorio{" +
                "protocolo='" + protocolo + '\'' +
                ", numero='" + numero + '\'' +
                ", ds_mensagem='" + ds_mensagem + '\'' +
                ", dt_recebimento='" + dt_recebimento + '\'' +
                ", dt_primeira='" + dt_primeira + '\'' +
                ", status='" + status + '\'' +
                ", login='" + login + '\'' +
                ", nome='" + nome + '\'' +
                ", dt_finalizacao='" + dt_finalizacao + '\'' +
                ", intermediacao='" + intermediacao + '\'' +
                '}';
    }
}
