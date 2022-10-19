public class Partidas {
    private Rodadas numRodadas;
    private Time timeVisitante;
    private Time timeMandante;
    private int golMandantesA;
    private int golVisitantesA;
    private int golsManA;
    private int golsVisA;
    private int vencedor;



    //Caio:
    Apostadores apostadores = new Apostadores();
//===============================//
    public String golsManA(){
        golsManA = apostadores.getApostaMandante();
        return golsManA();
    }

    public String golsVisA(){
        golsVisA = apostadores.getApostaVisitante();
        return golsVisA();
    }

    //compara quem ganhou de acordo com a sua aposta
    public int resultadoAposta(){
        if(golsVisA > golsManA){
            vencedor = 1; // 1= O visitante ganhou o jogo
            return vencedor;
        }

        else if(golsManA > golsVisA){
            vencedor = 2; // 2= O mandante ganhou o jogo
            return vencedor;
        }

        else{
            vencedor = 3;// 3= Empate
            return vencedor;
        }
    }

//!fazer outro para os resultados do jogo:
/*     
        public int resultadoAposta(){
        if(golsVisA > golsManA){
            vencedor = 1; // 1= O visitante ganhou o jogo
            return vencedor;
        }

        else if(golsManA > golsVisA){
            vencedor = 2; // 2= O mandante ganhou o jogo
            return vencedor;
        }

        else{
            vencedor = 3;// 3= Empate
            return vencedor;
        }
    }*/    

//! implementar esse método:
/*
    else if (vencedorAposta == vencedorImp){
        if (vencedorAposta == 1){

        }
        
        else if (vencedorAposta == 2){
        }

        else if (vencedorAposta == 3){
        }
    }
    else{
        System.out.println("Você errou o bolão, e não recebeu pontos.");
    }
    System.out.printf("O resultado foi " + nomeMandante," (",golsManImp, ") " ,"X", 
    " (", golsVisImp, ")",") " , nomeVisitante);
    */
    
//acabou o Caio

       
    



    
    /*GETTERS AND SETTERS
    ==================*/

    public Rodadas getNumRodadas() {
        return this.numRodadas;
    }

    public void setNumRodadas(Rodadas numRodadas) {
        this.numRodadas = numRodadas;
    }

    public Time getTimeVisitante() {
        return this.timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Time getTimeMandante() {
        return this.timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public int getGolMandantesA() {
        return this.golMandantesA;
    }

    public void setGolMandantesA(int golMandantesA) {
        this.golMandantesA = golMandantesA;
    }

    public int getGolVisitantesA() {
        return this.golVisitantesA;
    }

    public void setGolVisitantesA(int golVisitantesA) {
        this.golVisitantesA = golVisitantesA;
    }

    public int getGolsMan() {
        return golsManA;
    }

    public void setGolsManA(int golsManA) {
        this.golsManA = golsManA;
    }
    
    public int getGolsVisA() {
        return golsVisA;
    }

    public void setGolsVisA(int golsVisA) {
        this.golsVisA = golsVisA;
    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }


}
