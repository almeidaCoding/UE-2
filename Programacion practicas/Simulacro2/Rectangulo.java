class Rectangulo extends Figura2D{
    private String nombre;
    private double base;
    private double altura;
    
    public Rectangulo (String nombre, double base, double altura){
        super(nombre);
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + "]";
    }

    public boolean equals(Object r){
        if(r instanceof Rectangulo){
            Rectangulo r2 = (Rectangulo) r;
            if(r2.getNombre().equals(this.nombre) && r2.getBase() == this.getBase() && r2.getAltura() == this.getAltura()){
                return true;
            }
        }
        return false;
    }

    public double calculaPerimetro(){
        return (base + altura) * 2;
    }
}