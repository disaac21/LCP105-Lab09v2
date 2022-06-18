

import javax.swing.JProgressBar;

public class HiloDownload {

    public JProgressBar BarraArchivo;
    public JProgressBar BarraCarpeta;
    public int PesoArchivo;
    public int ArchivosCarpeta;
    public boolean start;

    public HiloDownload() {
    }

    public HiloDownload(JProgressBar BarraArchivo, JProgressBar BarraCarpeta, int PesoArchivo, int ArchivosCarpeta, boolean start) {
        this.BarraArchivo = BarraArchivo;
        this.BarraCarpeta = BarraCarpeta;
        this.PesoArchivo = PesoArchivo;
        this.ArchivosCarpeta = ArchivosCarpeta;
        this.start = start;
    }

    public JProgressBar getBarraArchivo() {
        return BarraArchivo;
    }

    public void setBarraArchivo(JProgressBar BarraArchivo) {
        this.BarraArchivo = BarraArchivo;
    }

    public JProgressBar getBarraCarpeta() {
        return BarraCarpeta;
    }

    public void setBarraCarpeta(JProgressBar BarraCarpeta) {
        this.BarraCarpeta = BarraCarpeta;
    }

    public int getPesoArchivo() {
        return PesoArchivo;
    }

    public void setPesoArchivo(int PesoArchivo) {
        this.PesoArchivo = PesoArchivo;
    }

    public int getArchivosCarpeta() {
        return ArchivosCarpeta;
    }

    public void setArchivosCarpeta(int ArchivosCarpeta) {
        this.ArchivosCarpeta = ArchivosCarpeta;
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }
    
    public void run(){
        
        while (start) {            
            int cont = PesoArchivo / 10;
            BarraCarpeta.setValue(ArchivosCarpeta);
            //Trying
            try {
                Thread.sleep(cont*1000);
            } catch (Exception e) {
            }
        }
        
    }
    
}

//            
