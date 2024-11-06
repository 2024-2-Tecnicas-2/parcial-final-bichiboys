package logicaNegocio;

public class Delfin extends Animal{

    TipoHabitat habitat;

    public Delfin() {
        this. habitat= TipoHabitat.ACUATICO;
    }
    
    @Override
    public String emitirSonido() {
        return "Chirrido";
    }
    @Override
    public TipoHabitat getHabitat() {
        return habitat;
    }

    @Override
    public String obtenerDieta() {
        return "Pescado";
    }
    // TODO: Aquí va tu código
}
