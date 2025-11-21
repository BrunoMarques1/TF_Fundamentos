public class Agenda {
    private Consulta consultas[];
    private int indice;


    public Agenda(){
        this.consultas = new Consulta[40];
        this.indice = 0;
    }

    public boolean adicionarConsulta(Consulta consulta){
        if(indice < 40){
            this.consultas[indice] = consulta;
            indice += 1;
            return true;
        }
        return false;
    }
    public int buscaPosicao(int nro){
        for(int i=0; i<=indice; i++){
            if(this.consultas[i].getNro() == nro){
                return i;
            }
        }
        return -1;
    }
    public boolean removerConsulta(int nro){
        int posicao = buscaPosicao(nro);
        if(posicao != -1){
            for (int i = posicao; i < indice; i++) {
                this.consultas[i] = this.consultas[i + 1];
            }
            this.consultas[this.indice - 1] = null;
            this.indice--;
            return true;
        }
        return false;
    }



}
