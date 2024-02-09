/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encje;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author student
 */
@Entity
@Table(name = "ALBUMY")
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    long version;
    private String tytul;
    @ManyToOne
    private Wykonawca wykonawca;
    private int rok;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "encje.Album[ id=" + id + " ]";
    }

    /**
     * @return the tytul
     */
    public String getTytul() {
        return tytul;
    }

    /**
     * @param tytul the tytul to set
     */
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    /**
     * @return the wykonawca
     */
    public Wykonawca getWykonawca() {
        return wykonawca;
    }

    /**
     * @param wykonawca the wykonawca to set
     */
    public void setWykonawca(Wykonawca wykonawca) {
        this.wykonawca = wykonawca;
    }

    /**
     * @return the rok
     */
    public int getRok() {
        return rok;
    }

    /**
     * @param rok the rok to set
     */
    public void setRok(int rok) {
        this.rok = rok;
    }

}
