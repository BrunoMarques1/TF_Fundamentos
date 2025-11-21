public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(){
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return ("Data: "+this.dia + "/" + this.mes + "/" + this.ano);
    }

    private boolean ehBissexto(){
        return (this.ano % 400 == 0 || (this.ano % 4  == 0 && this.ano % 100 != 0));
    }

    public boolean verificaData(){
        if(this.mes >= 1 && this.mes <= 12){
            if(this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11){
                return (this.dia >= 1 && this.dia <= 30);
            }
            else if(this.mes == 2 && ehBissexto()){
                return (this.dia >= 1 && this.dia <= 29);
            }
            else if(this.mes == 2 && !ehBissexto()){
                return (this.dia >= 1 && this.dia <= 28);
            }
            else{
                return (this.dia >= 1 && this.dia <= 31);
            }
        }
        return false;
    }

}
