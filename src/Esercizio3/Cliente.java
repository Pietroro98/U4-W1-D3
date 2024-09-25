package Esercizio3;

import java.util.Date;

public class Cliente {
    private String codice;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String codice, String nome, String cognome, String email, String dataIscrizione) {
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    // codice Cliente
    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }

    //nome cliente
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //cognome cliente
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    //email cliente
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //data iscrizione cliente
    public String getDataIscrizione() {
        return dataIscrizione;
    }
    public void setDataIscrizione(String dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }


}


