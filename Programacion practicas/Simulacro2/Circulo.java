class Circulo extends Figura2D{
    private String nombre;
    private double radio;

    public Circulo (String nombre, double radio){
        super(nombre);
        this.nombre = nombre;
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [nombre=" + nombre + ", radio=" + radio + "]";
    }

    public boolean equals(Object c){
        if(c instanceof Circulo){
            Circulo c2 = (Circulo) c;
            if(c2.getNombre().equals(this.nombre) && c2.getRadio() == this.getRadio()){
                return true;
            }
        }
        return false;
    }

    public double calculaPerimetro(){
        return 2*Math.PI;
    }
}