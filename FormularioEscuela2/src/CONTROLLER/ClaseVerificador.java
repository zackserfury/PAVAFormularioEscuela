/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

/**
 *
 * @author Alumno
 */
public class ClaseVerificador {
    /*private String id,
            nombre,
            apellidoPat,
            apellidoMat,
            edad;*/
    
    //private int edad;

    public ClaseVerificador() {
    }

    //de esta forma se crean dos objetos en paralelo y trabajaran juntas, no es lo que quiero en esta ocasion
    /*public ClaseVerificador(String id, String nombre, String apellidoPat, String apellidoMat, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.edad = edad;
    }*/
    public void verificador(String objTextField1,
        String objTextField2,
        String objTextField3,
        String objTextField4,
        String objTextField5){
        
        if(verificadorEspaciosVacios(objTextField1,
            objTextField2,
            objTextField3,
            objTextField4,
            objTextField5)){
            
            
        }
    }
    public boolean verificadorEspaciosVacios(String objTextField1, String objTextField2,
        String objTextField3,
        String objTextField4,
        String objTextField5){
        
        if(objTextField1.isEmpty() ||
            objTextField2.isEmpty() ||
            objTextField3.isEmpty() ||
            objTextField4.isEmpty() ||
            objTextField5.isEmpty()){
            return true;
        }
        
        return false;
    }
    
    /*public boolean vereficadorEspacioVacio(){
        if(id.isEmpty() ||
                nombre.isEmpty() ||
                apellidoPat.isEmpty()|| 
                apellidoMat.isEmpty() ||
                edad.isEmpty()){
            
            return true;
        }
        return false;
    }*/
}
