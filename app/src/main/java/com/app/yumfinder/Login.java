package com.app.yumfinder;
import view from View.java;
public class Login {
    public String Name;
    public String Lastname;
    public String Email;
    public String Password;

    //instanciar função de tela com usuário ja logado e validado = acesso()??
    public static void ValidarLogin(){
        if (Email || Password != campo){
            System.out.println("Insira os dados Corretos");
        }
        else {
            Acesso();
        }

    }
    public static void AdminLogin(){
        if (Email || Password != acessoadmin){
            ValidarLogin();
        }
        else {
            AcessoAdmin();
        }
    }
    public static void Acesso(){
        return AcessoView();
    }
    public void AcessoAdmin(){
        return AcessoAdminView();
    }
}
