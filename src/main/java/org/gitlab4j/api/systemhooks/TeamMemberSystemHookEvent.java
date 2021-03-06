package org.gitlab4j.api.systemhooks;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.gitlab4j.api.models.Visibility;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TeamMemberSystemHookEvent extends AbstractSystemHookEvent {
    
    public static final String NEW_TEAM_MEMBER_EVENT = "user_add_to_team";
    public static final String TEAM_MEMBER_REMOVED_EVENT = "user_remove_from_team";
    
    private Date createdAt;
    private Date updatedAt;
    private String eventName;
    private String projectAccess;
    private String projectName;
    private String projectPath;
    private Integer projectId;
    private String projectPathWithNamespace;
    private String userEmail;
    private String userName;
    private String userUsername;
    private Integer userId;
    private Visibility projectVisibility;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getProjectAccess() {
        return projectAccess;
    }

    public void setProjectAccess(String projectAccess) {
        this.projectAccess = projectAccess;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectPathWithNamespace() {
        return projectPathWithNamespace;
    }

    public void setProjectPathWithNamespace(String projectPathWithNamespace) {
        this.projectPathWithNamespace = projectPathWithNamespace;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Visibility getProjectVisibility() {
        return projectVisibility;
    }

    public void setProjectVisibility(Visibility projectVisibility) {
        this.projectVisibility = projectVisibility;
    }
}
