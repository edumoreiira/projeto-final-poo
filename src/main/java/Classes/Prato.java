/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author eduu_
 */
public class Prato {
    private int id;
    private String name;
    private String chef;
    
    public Prato(){
    
    }

    public Prato(int id, String name, String chef) {
        this.id = id;
        this.chef = chef;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Prato{" + "id=" + id + ", chef=" + chef + ", name=" + name + '}';
    }
    
    
    
}
