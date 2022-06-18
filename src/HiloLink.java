

import javax.swing.JProgressBar;

public class HiloLink extends Thread {

    public JProgressBar BarraLink;
    public String Link;

    public HiloLink() {
    }

    public HiloLink(JProgressBar BarraLink, String Link) {
        this.BarraLink = BarraLink;
        this.Link = Link;
    }

    public JProgressBar getBarraLink() {
        return BarraLink;
    }

    public void setBarraLink(JProgressBar BarraLink) {
        this.BarraLink = BarraLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    @Override
    public void run() {

        while (true) {
            BarraLink.setString(Link);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }

}
