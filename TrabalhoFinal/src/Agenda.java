public class Agenda {
    private Consulta consultas[];
    private int indice;


    public Agenda(){
        this.consultas = new Consulta[40];
        this.indice = 0;
    }

    public boolean adicionarConsulta(Consulta consulta){
        if(this.indice < 40){
            this.consultas[this.indice] = consulta;
            this.indice += 1;
            return true;
        }
        return false;
    }
    public boolean removerConsulta(int nro){
        int posicao = buscaPosicao(nro);
        if(posicao != -1){
            for (int i = posicao; i < this.indice; i++) {
                this.consultas[i] = this.consultas[i + 1];
            }
            this.consultas[this.indice - 1] = null;
            this.indice--;
            return true;
        }
        return false;
    }
    public Consulta buscarConsultaPorNro(int nro){
        for(int i=0; i < this.indice; i++){
            if(this.consultas[i].getNro() == nro){
                return this.consultas[i];
            }
        }
        return null;
    }
    public int buscaPosicao(int nro){
        for(int i=0; i<=this.indice; i++){
            if(this.consultas[i].getNro() == nro){
                return i;
            }
        }
        return -1;
    }
    public Consulta[] buscarConsultaMedico(String nomeMedico){
        int total = 0;
        for(int i =0; i<this.indice; i++){
            if(this.consultas[i].getMedico().getNome().equals(nomeMedico)){
                total += 1;
            }
        }
        Consulta consultasMedico[] = new Consulta[total];
        int j =0;
        for(int i=0; i<this.indice;i++){
            if(this.consultas[i].getMedico().getNome().equals(nomeMedico)){
                consultasMedico[j] = this.consultas[i];
                j++;
            }
        }
        return consultasMedico;
    }
    public Data buscarConsultaPaciente(int codigo){
        for(int i=0; i<this.indice; i++){
            if(this.consultas[i].getPaciente().getCodigo() == codigo){
                return this.consultas[i].getData();
            }
        }
        return null;
    }



    public void mostraAgenda(){
        for(int i=0; i < this.indice; i++){
            System.out.println("--------------------");
            System.out.println(this.consultas[i]);
        }
        System.out.println("--------------------");

    }



}
