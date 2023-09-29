package iphone.phone;

import iphone.interfaces.Ipod;
import iphone.interfaces.Safari;
import iphone.interfaces.Telefone;

public class iPhone implements Safari, Telefone, Ipod{

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada.");
    }
    
    @Override
    public void tocar() {
        System.out.println("Musica tocando..");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada.");
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }
    
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    @Override
    public void atender() {
        System.out.println("Iniciando chamada");
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atuaizada");
    }

    
  
    
}
