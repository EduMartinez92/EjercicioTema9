public class Main {


    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setEdad(19);
        cliente.setNombre("Eduardo");
        cliente.setTelefono(333777555);
        cliente.setCredito(3500);

        System.out.println("Edad: "+ cliente.getEdad()+ ", Nombre: "+ cliente.getNombre()+
                ", Teléfono: "+ cliente.getTelefono()+", Crédito: "+ cliente.getCredito());


        trabajador.setEdad(43);
        trabajador.setNombre("Antonio");
        trabajador.setTelefono(444888666);
        trabajador.setSalario(1500);

        System.out.println("Edad: "+ trabajador.getEdad()+ ", Nombre: "+ trabajador.getNombre()+
                ", Teléfono: "+ trabajador.getTelefono()+", Salario: "+ trabajador.getSalario());




    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {

        this.edad = edad;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getTelefono() {

        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {

    private int credito;

    public int getCredito(){
        return credito;}

    public void setCredito(int credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {

    private int salario;

    public int getSalario(){
        return salario;}

    public void setSalario(int salario) {
        this.salario = salario;
    }

}