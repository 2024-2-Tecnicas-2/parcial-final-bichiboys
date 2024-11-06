package logicaNegocio;

public class Leon extends Animal{

    TipoHabitat habitat;

    public Leon() {
        this. habitat= TipoHabitat.TERRESTRE;
    }
    
    @Override
    public String emitirSonido() {
        return "Rugido";
    }
    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }
    // TODO: Aquí va tu código
}
