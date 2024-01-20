public class ClassesDoJogo {
    private String nomeHeroi;
    private String idadeHeroi;
    private String tipoHeroi;
    private String ataque;

    public ClassesDoJogo(String tipoHeroi, String ataque){
        this.tipoHeroi = tipoHeroi;
        this.ataque = ataque;

    }

    public void atacar(){
        System.out.println("O " + tipoHeroi + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        ClassesDoJogo primeiroTipo = new ClassesDoJogo("mago", "magia");
        ClassesDoJogo segundoTipo = new ClassesDoJogo("guerreiro", "espada");
        ClassesDoJogo terceiroTipo = new ClassesDoJogo("monge", "artes marciais");
        ClassesDoJogo quartoTipo = new ClassesDoJogo("ninja", "shuriken");
        
        primeiroTipo.atacar();
        segundoTipo.atacar();
        terceiroTipo.atacar();
        quartoTipo.atacar();
        
    }
} 
