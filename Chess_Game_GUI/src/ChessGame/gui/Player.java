/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Laz Bratton
 */
@Entity
@Table(name = "PLAYER", catalog = "", schema = "APP")
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findByName", query = "SELECT p FROM Player p WHERE p.name = :name"),
    @NamedQuery(name = "Player.findByScore", query = "SELECT p FROM Player p WHERE p.score = :score"),
    @NamedQuery(name = "Player.findByGamesplayed", query = "SELECT p FROM Player p WHERE p.gamesplayed = :gamesplayed"),
    @NamedQuery(name = "Player.findByGameswon", query = "SELECT p FROM Player p WHERE p.gameswon = :gameswon"),
    @NamedQuery(name = "Player.findByGameslost", query = "SELECT p FROM Player p WHERE p.gameslost = :gameslost")})
public class Player implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "SCORE")
    private Integer score;
    @Column(name = "GAMESPLAYED")
    private Integer gamesplayed;
    @Column(name = "GAMESWON")
    private Integer gameswon;
    @Column(name = "GAMESLOST")
    private Integer gameslost;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        Integer oldScore = this.score;
        this.score = score;
        changeSupport.firePropertyChange("score", oldScore, score);
    }

    public Integer getGamesplayed() {
        return gamesplayed;
    }

    public void setGamesplayed(Integer gamesplayed) {
        Integer oldGamesplayed = this.gamesplayed;
        this.gamesplayed = gamesplayed;
        changeSupport.firePropertyChange("gamesplayed", oldGamesplayed, gamesplayed);
    }

    public Integer getGameswon() {
        return gameswon;
    }

    public void setGameswon(Integer gameswon) {
        Integer oldGameswon = this.gameswon;
        this.gameswon = gameswon;
        changeSupport.firePropertyChange("gameswon", oldGameswon, gameswon);
    }

    public Integer getGameslost() {
        return gameslost;
    }

    public void setGameslost(Integer gameslost) {
        Integer oldGameslost = this.gameslost;
        this.gameslost = gameslost;
        changeSupport.firePropertyChange("gameslost", oldGameslost, gameslost);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChessGame.gui.Player[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
