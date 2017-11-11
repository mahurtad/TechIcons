package pe.edu.upc.techicons;

/**
 * Created by mahurtad on 29/10/2017.
 */

public class Person {
    private String name;
    private String title;
    private String company;
    private String bio;
    private String service;
    private int pictureId;
    public Person(String name, String title, String company, String bio, String service, int pictureId)
    {
        this.bio = bio;
        this.company = company;
        this.name = name;
        this.service = service;
        this.pictureId = pictureId;
        this.title = title;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }

    public String getService() { return service; }
    public void setService(String service) { this.service = service; }

    public int getPictureId() { return pictureId; }
    public void setPictureId(int pictureId) { this.pictureId = pictureId; }
}
