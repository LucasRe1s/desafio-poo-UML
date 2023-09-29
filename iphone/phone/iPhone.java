package iphone.phone;

import iphone.interfaces.Ipod;
import iphone.interfaces.Safari;
import iphone.interfaces.Telefone;

public class iPhone implements Safari, Telefone, Ipod{

    
    @Override
    public void selecionarArtistas() {
        System.out.println("Selecionando artistas");
    }
    
    @Override
    public void play() {
        System.out.println("Play");
    }
    
    @Override
    public void pause() {
        System.out.println("Musica pausada...");
    }
    
    @Override
    public void exibirTecaldoNumerico() {
        System.out.println("Exibindo teclado numerico..");
    }
    
    @Override
    public void discandoNuemro() {
        System.out.println("Discando numero....");
    }
    
    @Override
    public void chamando() {
        System.out.println("Chamando...");
    }
    
    @Override
    public void atendeu() {
        System.out.println("Atendeu...");
    }
    
    @Override
    public void recusado() {
        System.out.println("Chamada recusada");
    }
    
    @Override
    public void validarConexao() {
        System.out.println("Validando conexão..");
    }
    
    @Override
    public void exibirPagina() {
        validarConexao();
        System.out.println("Exibindo página");
    }
    
    @Override
    public void pesquisar() {
        System.out.println("Pesquisando...");
        fecharConexao();
    }
    
    @Override
    public void fecharConexao() {
        System.out.println("Fechando conexão");
    }
    
}
