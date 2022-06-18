

import java.util.ArrayList;

public class Carpeta {
    
    //Tendrán un nombre, un link, una lista de archivos y carpetas
    public String Nombre;
    public String Link;
    public ArrayList <Carpeta> Carpetas = new ArrayList<>();
    public ArrayList <Archivo> Archivos = new ArrayList<>();

    public Carpeta() {
    }

    public Carpeta(String Nombre, String Link) {
        this.Nombre = Nombre;
        this.Link = Link;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public ArrayList<Carpeta> getCarpetas() {
        return Carpetas;
    }

    public void setCarpetas(ArrayList<Carpeta> Carpetas) {
        this.Carpetas = Carpetas;
    }

    public ArrayList<Archivo> getArchivos() {
        return Archivos;
    }

    public void setArchivos(ArrayList<Archivo> Archivos) {
        this.Archivos = Archivos;
    }

    @Override
    public String toString() {
        return "Carpeta{" + "Nombre=" + Nombre + '}';
    }
    
}
