package models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TVShows {

    @NotNull
    @Size(min=2)
    private String name;

    @NotNull
    @Min(value=1)
    private int numofSeasons;

    @NotNull
    @Size(min=1, max=100)
    private String summary;

    @NotNull
    @Size(min=1)
    private String genre;

    @NotNull
    @Min(value=3)
    private double duration;

    public void set(String name, int numofSeasons, String summary, String genre,double duration){
        setName(name);
        setNumofSeasons(numofSeasons);
        setSummary(summary);
        setGenre(genre);
        setDuration(duration);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumofSeasons() {
        return numofSeasons;
    }

    public void setNumofSeasons(int numofSeasons) {
        this.numofSeasons = numofSeasons;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
