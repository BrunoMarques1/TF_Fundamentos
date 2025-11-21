public class Consulta {
    private int nro = 0;
    private Data data;
    private Medico medico;
    private Paciente paciente;
    private Double valor;

    public Consulta(){
        this.nro += 1;
        this.data = null;
        this.medico = null;
        this.paciente = null;
        this.valor = 0.0;
    }
    public Consulta(Data data, Medico medico, Paciente paciente, Double valor){
        this.nro += 1;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.valor = valor;
    }

    public int getNro(){
        return this.nro;
    }
    public Data getData(){
        return this.data;
    }
    public Medico getMedico(){
        return this.medico;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    public double getValor(){
        return this.valor;
    }

    public void setNro(int nro){
        this.nro = nro;
    }
    public void setData(Data data){
        this.data = data;
    }
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public String toString(){
        return ("Número: " + this.nro+
                "\nData: " + this.data+
                "\nMédico: " + this.medico+
                "\nPaciente: " + this.paciente+
                "\nValor: " + this.valor);
    }


}
