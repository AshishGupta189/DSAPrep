package com.masai.prob1;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class college {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;
    private String collegeName;
    private String collageAddress;

    public college() {
    }

    @Override
    public String toString() {
        return "college{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                ", s=" + s +
                '}';
    }

    @OneToMany(mappedBy = "courseId",cascade = CascadeType.ALL)
    private Set<student> s=new HashSet<student>();

    public college(int collegeId, String collegeName, String collageAddress, Set<student> s) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collageAddress = collageAddress;
        this.s = s;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollageAddress() {
        return collageAddress;
    }

    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }

    public Set<student> getS() {
        return s;
    }

    public void setS(Set<student> s) {
        this.s = s;
    }
}
