package pizza;


public class Pizza {
    private String Sabor;
    private int Tamaño;
    private double Precio;
  
    public String getSabor(){
        return Sabor;
    }
    public void setSabor(String Sabor){
        this.Sabor = Sabor;
    }
    public int getTamaño(){
        return Tamaño;
    }
    public void setTamaño(int Tamaño){
        this.Tamaño = Tamaño;
    }
    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    }
