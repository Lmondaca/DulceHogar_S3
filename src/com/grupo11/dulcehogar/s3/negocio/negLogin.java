/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo11.dulcehogar.s3.negocio;

import com.grupo11.dulcehogar.s3.acceso_datos.AccLogin;

/**
 *
 * @author Lucas
 */
public class negLogin {
 
    AccLogin accLogin;
    
    public negLogin(){
      
        this.accLogin = new AccLogin();
        
    }
    public Usuario iniciarSesion(String rut, String pass){
        Usuario usuario = accLogin.buscarUsuario(rut);
        if(usuario==null){
            return null;
        }else{
            if(pass.compareTo(usuario.getContrasenna())==0){
                return usuario;
            }
        }
        
        return null;
    }
    
   
    
}
