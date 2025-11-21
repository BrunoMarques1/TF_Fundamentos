public class Main {
    public static void main(String[] args) {
        Medico medico1 = new Medico(123, "Jorge", "Otorrino");
        //System.out.println(medico1);
        //System.out.println("----------------------");
        medico1.setNome("Janaina");
        //System.out.println(medico1);
        System.out.println("----------------------");
        System.out.println("Consulta1");
        Paciente paciente1 = new Paciente(1,"Bruno");
        Data data1 = new Data(12,12,2022);
        Consulta consulta1 = new Consulta(data1,medico1,paciente1,12.12);
        System.out.println(consulta1);

        System.out.println("----------------------");
        System.out.println("Consulta 2");
        Paciente paciente2 = new Paciente(1,"Jorge");
        Data data2 = new Data(11,11,2021);
        Consulta consulta2 = new Consulta(data2,medico1,paciente2,11.11);
        System.out.println(consulta2);

    }

}