import java.util.UUID;

public class Utilisateur {
    private String nom;
    private UUID id;
    private String notification;

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public UUID getId(UUID id) {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Utilisateur(String nom, String id, String notification) {
        this.nom = nom;
        this.id = UUID.randomUUID();
        this.notification = notification;
    }
}
