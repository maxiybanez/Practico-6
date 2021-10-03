/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico6;

import java.util.*;

/**
 *
 * @author Maxi Ybañez
 */
public class Directorio {
  private  TreeMap<String,Cliente> directorio;

    public Directorio() {
        directorio= new TreeMap<>();
    }
    
    public boolean agregarCliente(String Telefono, Cliente valor){
        if(directorio.containsKey(Telefono)){//pregunto si la clave ya existe si existe return falso;
            return false;
        }else{
            directorio.put(Telefono, valor);
            return true;
        }
        
    }
    
    public Cliente buscarCliente(String telefono){
        Cliente buscado= null;
        if(directorio.containsKey(telefono)){
             buscado= directorio.get(telefono);
            }
        
        return buscado;
    }
    public List<String> buscarTelefono(String apellido){
        ArrayList<String> buscarTelefonos=new ArrayList<>();
        Set <String> claves= directorio.keySet();
        for(String cliente:claves){
            if(directorio.get(cliente).getApellido().equalsIgnoreCase(apellido)){
                buscarTelefonos.add(cliente);
            }
        }
        return buscarTelefonos;
    }
    
    public List<Cliente> buscarClientes(String cuidad){
        ArrayList<Cliente> buscarClientes=new ArrayList<>();
        Set <String> claves= directorio.keySet();
        for(String cliente:claves){
            if(directorio.get(cliente).getCiudad().equalsIgnoreCase(cuidad)){
                buscarClientes.add(directorio.get(cliente));
            }
        }
        
        return buscarClientes;
    }

    public TreeMap<String,Cliente> borrarCliente(int dni){
        
        TreeMap<String,Cliente> listaBorrada=new TreeMap<>();
        Set<String> telefonos=directorio.keySet();
        for(String telefono:telefonos){
            Cliente borrado = directorio.get(telefono);
            if(borrado.getDni()==dni){
                listaBorrada.put(telefono, borrado);
                directorio.remove(telefono);
            }
            
        }
        return listaBorrada;
    }
  
    
}