public class Jefatura extends empleado{

    private double incentivo;

    public Jefatura(String nom, double sue, int ano, int mes, int dias) {
        super(nom, sue, ano, mes, dias);
    }

    public void setIncentivo(double incentivoPresupuestado) {
       incentivo=incentivoPresupuestado;
    }
    public double getSueldo(){
        double resultado=incentivo+super.getSueldo();
        return resultado;
    }

}

