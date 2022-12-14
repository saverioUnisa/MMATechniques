package model.bean;

import java.util.ArrayList;

public class KarateTechniqueBean {
    private String nome;
    private String tipo;
    private String descrizione;
    private int valSkill;
    private ArrayList<MartialArtistBean> players;
    private String uri;

    @Override
    public String toString() {
        return "KarateTechniqueBean{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", valSkill=" + valSkill +
                ", players=" + players +
                ", uri='" + uri + '\'' +
                '}';
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getValSkill() {
        return valSkill;
    }

    public void setValSkill(int valSkill) {
        this.valSkill = valSkill;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public ArrayList<MartialArtistBean> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<MartialArtistBean> players) {
        this.players = players;
    }

}