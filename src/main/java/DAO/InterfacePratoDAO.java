/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Classes.Prato;
import java.util.ArrayList;

/**
 *
 * @author 08823462100
 */
public interface InterfacePratoDAO {
    public void deletarNoBanco(Prato p);
    public void atualizarBanco(Prato p);
    public void inserirBanco(Prato p);
    public ArrayList<Prato> lerBanco();
}
