package com.icchoi.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SocialMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String github;
    private String twitter;
    private String instagram;
    private String facebook;

    public SocialMedia(){
    }

    public SocialMedia(String github, String twitter, String instagram, String facebook) {
        this.github = github;
        this.twitter = twitter;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}
