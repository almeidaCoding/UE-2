class Triangulo extends Figura2D{
    private String nombre;
    private double ldo1;
    private double ldo2;
    private double ldo3;

    public Triangulo(String nombre, double ldo1, double ldo2, double ldo3){
        super(nombre);
        this.nombre = nombre;
        this.ldo1 = ldo1;
        this.ldo2 = ldo2;
        this.ldo3 = ldo3;
    }

    public double getLdo1() {
        return ldo1;
    }

    public void setLdo1(double ldo1) {
        this.ldo1 = ldo1;
    }

    public double getLdo2() {
        return ldo2;
    }

    public void setLdo2(double ldo2) {
        this.ldo2 = ldo2;
    }

    public double getLdo3() {
        return ldo3;
    }

    public void setLdo3(double ldo3) {
        this.ldo3 = ldo3;
    }

    @Override
    public String toString() {
        return "Triangulo [nombre=" + nombre + ", ldo1=" + ldo1 + ", ldo2=" + ldo2 + ", ldo3=" + ldo3 + "]";
    }
    
    public boolean equals(Object t){
        if(t instanceof Triangulo){
            Triangulo t2 = (Triangulo) t;
            if(t2.getNombre().equals(this.nombre) && t2.getLdo1() == this.getLdo1() && t2.getLdo2() == this.getLdo2() && t2.getLdo3() == this.getLdo3()){
                return true;
            }
        }
        return false;
    }

    public double calculaPerimetro(){
        return ldo1 + ldo2 + ldo3;
    }
}