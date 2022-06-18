

import java.util.ArrayList;

public class Carpeta {
    
    //Tendrán un nombre, un link, una lista de archivos y carpetas
    public String Nombre;
    public String Link;
    public ArrayList <Carpeta> Carpetas;
    public ArrayList <Archivo> Archivos;

    public Carpeta() {
    }

    public Carpeta(String Nombre, String Link, ArrayList<Carpeta> Carpetas, ArrayList<Archivo> Archivos) {
        this.Nombre = Nombre;
        this.Link = Link;
        this.Carpetas = Carpetas;
        this.Archivos = Archivos;
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
