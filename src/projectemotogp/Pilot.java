/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectemotogp;



/**
 *
 * @author David
 */
public class Pilot {
    
    public enum Categoria {MOTOGP, MOTO2, MOTO3};
    public Categoria Pilot;
    public String nom;
    public String cognom;
    public int dorsal;
    public String equip;
    public boolean residencia;
    public double dataNaixement;
    public String apodo;
    public int estatura;
    public int omplit;

    
    public Categoria getPilot() {
        return Pilot;
    }

    public void setPilot(Categoria Pilot) {
        this.Pilot = Pilot;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public boolean isResidencia() {
        return residencia;
    }

    public void setResidencia(boolean residencia) {
        this.residencia = residencia;
    }

    public double getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(double dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    public int getOmplit() {
        return omplit;
    }

    public void setOmplit(int omplit) {
        this.omplit = omplit;
    }

    void setOmplit(boolean b) {
         
    }    
}
