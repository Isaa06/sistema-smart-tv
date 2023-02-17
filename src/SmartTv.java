public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;
//metodos sao definidos no objeto, valores de variaveis.
    public void mudarCanal(int novoCanal){
        canal = novoCanal; //Dessa forma eu defino qual canal diretamente chamando o método e definindo o valor da variavel
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++; // ++ unario
        System.out.println("Aumentando volume para: " + volume);
        // volume = volume +1;
    }
    public void dimunuirVolume(){
        volume--; // ++ unario
        System.out.println("Diminuindo volume para: " + volume);
        // volume = volume +1;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
