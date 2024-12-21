package services;

import users.Student;
import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String organizationName;
    private List<Student> members;
    private Student leader;

    public Organization(String organizationName) {
        this.organizationName = organizationName;
        this.members = new ArrayList<>();
        this.leader = null;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public List<Student> getMembers() {
        return members;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            System.out.println("Leader of the organization " + organizationName + " is set to: " + leader.getFullName());
        } else {
            System.out.println("The leader must be a member of the organization.");
        }
    }

    public void addMember(Student student) {
        if (!members.contains(student)) {
            members.add(student);
            System.out.println(student.getFullName() + " has been added to the organization: " + organizationName);
        } else {
            System.out.println(student.getFullName() + " is already a member of the organization.");
        }
    }

    public void removeMember(Student student) {
        if (members.remove(student)) {
            System.out.println(student.getFullName() + " has been removed from the organization: " + organizationName);
            if (leader != null && leader.equals(student)) {
                leader = null;
                System.out.println("The leader has been removed as well.");
            }
        } else {
            System.out.println(student.getFullName() + " is not a member of the organization.");
        }
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Organization: ").append(organizationName).append("\n");
        info.append("Leader: ").append(leader != null ? leader.getFullName() : "None").append("\n");
        info.append("Members:\n");
        for (Student member : members) {
            info.append("- ").append(member.getFullName()).append("\n");
        }
        return info.toString();
    }
}
