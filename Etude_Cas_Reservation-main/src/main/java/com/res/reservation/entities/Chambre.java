package com.res.reservation.entities;
import java.util.List;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@AllArgsConstructor
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypeChambre type;
    private double prix;
    private boolean disponible;

    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
    @XmlTransient
    private List<Reservation> reservations;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public  Chambre(){}
    public Chambre(TypeChambre type, double prix, boolean disponible) {
        super();
        this.type = type;
        this.prix = prix;
        this.disponible = disponible;
    }


    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", type=" + type +
                ", prix=" + prix +
                ", disponible=" + disponible +
                '}';
    }
}
