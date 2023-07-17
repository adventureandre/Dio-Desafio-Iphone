import com.iphone.Iphone;

public class Cliente {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.Power();
        iphone.status();

        iphone.navegarWeb(); // Você está navegando na web!
        iphone.adicionarNovaAba(); // Nova aba adicionada!
        iphone.atualizarPagina(); // Página atualizada!

        iphone.tocar(); // Tocando música
        iphone.tocar(); // A música já está tocando!
        iphone.pausar(); // Música pausada
        iphone.pausar(); // Música despausada

        iphone.selecionarMusica(); // Música selecionada!

        iphone.ligar(); // Ligando...
        iphone.atender(); // Atendendo chamada...
        iphone.iniciarCorrerioVoz(); // Iniciando correio de voz...

        iphone.Power();
        iphone.status();
    }
}
