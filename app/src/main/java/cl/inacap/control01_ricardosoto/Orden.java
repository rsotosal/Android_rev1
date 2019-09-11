package cl.inacap.control01_ricardosoto;

import android.os.Parcel;
import android.os.Parcelable;

public class Orden implements Parcelable {

    private String nom;
    private String plato;
    private String tipo;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static Creator<Orden> getCREATOR() {
        return CREATOR;
    }

    public Orden(String nom, String plato, String tipo) {
        this.nom = nom;
        this.plato = plato;
        this.tipo = tipo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    public Orden() {
    }

    protected Orden(Parcel in) {
    }

    public static final Parcelable.Creator<Orden> CREATOR = new Parcelable.Creator<Orden>() {
        @Override
        public Orden createFromParcel(Parcel source) {
            return new Orden(source);
        }

        @Override
        public Orden[] newArray(int size) {
            return new Orden[size];
        }
    };
}
