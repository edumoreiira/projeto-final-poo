/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduu_
 */
public class Prato extends PratoAbstrata {
    private int id;
    private String chef;
    
    //sobrecargas
    public Prato(){
    }
    
    public Prato(String name, String chef) {
        this.chef = chef;
        setName(name);
    }
    
    public Prato(int id, String chef) {
        this.chef = chef;
        this.id = id;
    }

    public Prato(int id, String name, String chef) {
        this.id = id;
        this.chef = chef;
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }
    
    //sobrescrita
    @Override
    public String toString() {
        return "Prato{" + "id=" + id + ", chef=" + chef + ", name=" + getName() + '}';
    }
    
    
    
}
