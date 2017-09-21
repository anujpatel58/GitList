package bharat.viznu.gitlist.model;
/**
 * Created by Maa on 21-09-2017.
 */

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Repository implements Parcelable {

    public final static Parcelable.Creator<Repository> CREATOR = new Creator<Repository>() {

        @SuppressWarnings({"unchecked"})
        public Repository createFromParcel(Parcel in) {
            Repository instance = new Repository();
            instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.fullName = ((String) in.readValue((String.class.getClassLoader())));
            instance.owner = ((Owner) in.readValue((Owner.class.getClassLoader())));
            instance._private = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.description = ((String) in.readValue((String.class.getClassLoader())));
            instance.fork = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.url = ((String) in.readValue((String.class.getClassLoader())));
            instance.forksUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.keysUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.collaboratorsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.teamsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.hooksUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.issueEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.assigneesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.branchesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.tagsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.blobsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gitTagsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gitRefsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.treesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.statusesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.languagesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.stargazersUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.contributorsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.subscribersUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.subscriptionUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.commitsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.gitCommitsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.commentsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.issueCommentUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.contentsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.compareUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.mergesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.archiveUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.downloadsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.issuesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.pullsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.milestonesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.notificationsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.labelsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.releasesUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.deploymentsUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.createdAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.updatedAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.pushedAt = ((String) in.readValue((String.class.getClassLoader())));
            instance.gitUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.sshUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.cloneUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.svnUrl = ((String) in.readValue((String.class.getClassLoader())));
            instance.homepage = ((String) in.readValue((String.class.getClassLoader())));
            instance.size = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.stargazersCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.watchersCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.language = ((String) in.readValue((String.class.getClassLoader())));
            instance.hasIssues = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.hasProjects = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.hasDownloads = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.hasWiki = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.hasPages = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
            instance.forksCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.mirrorUrl = ((Object) in.readValue((Object.class.getClassLoader())));
            instance.openIssuesCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.forks = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.openIssues = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.watchers = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.defaultBranch = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public Repository[] newArray(int size) {
            return (new Repository[size]);
        }
    };
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("owner")
    private Owner owner;
    @SerializedName("private")
    private Boolean _private;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("fork")
    private Boolean fork;
    @SerializedName("url")
    private String url;
    @SerializedName("forks_url")
    private String forksUrl;
    @SerializedName("keys_url")
    private String keysUrl;
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    private String teamsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @SerializedName("branches_url")
    private String branchesUrl;
    @SerializedName("tags_url")
    private String tagsUrl;
    @SerializedName("blobs_url")
    private String blobsUrl;
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @SerializedName("trees_url")
    private String treesUrl;
    @SerializedName("statuses_url")
    private String statusesUrl;
    @SerializedName("languages_url")
    private String languagesUrl;
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @SerializedName("commits_url")
    private String commitsUrl;
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @SerializedName("contents_url")
    private String contentsUrl;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("merges_url")
    private String mergesUrl;
    @SerializedName("archive_url")
    private String archiveUrl;
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("pulls_url")
    private String pullsUrl;
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("releases_url")
    private String releasesUrl;
    @SerializedName("deployments_url")
    private String deploymentsUrl;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("pushed_at")
    private String pushedAt;
    @SerializedName("git_url")
    private String gitUrl;
    @SerializedName("ssh_url")
    private String sshUrl;
    @SerializedName("clone_url")
    private String cloneUrl;
    @SerializedName("svn_url")
    private String svnUrl;
    @SerializedName("homepage")
    private String homepage;
    @SerializedName("size")
    private Integer size;
    @SerializedName("stargazers_count")
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    private Integer watchersCount;
    @SerializedName("language")
    private String language;
    @SerializedName("has_issues")
    private Boolean hasIssues;
    @SerializedName("has_projects")
    private Boolean hasProjects;
    @SerializedName("has_downloads")
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    private Boolean hasWiki;
    @SerializedName("has_pages")
    private Boolean hasPages;
    @SerializedName("forks_count")
    private Integer forksCount;
    @SerializedName("mirror_url")
    private Object mirrorUrl;
    @SerializedName("open_issues_count")
    private Integer openIssuesCount;
    @SerializedName("forks")
    private Integer forks;
    @SerializedName("open_issues")
    private Integer openIssues;
    @SerializedName("watchers")
    private Integer watchers;
    @SerializedName("default_branch")
    private String defaultBranch;

    public Repository() {
    }

    /**
     * @param notificationsUrl
     * @param releasesUrl
     * @param pushedAt
     * @param gitTagsUrl
     * @param contentsUrl
     * @param blobsUrl
     * @param issueEventsUrl
     * @param htmlUrl
     * @param _private
     * @param hooksUrl
     * @param description
     * @param commentsUrl
     * @param commitsUrl
     * @param labelsUrl
     * @param assigneesUrl
     * @param mergesUrl
     * @param fork
     * @param compareUrl
     * @param stargazersUrl
     * @param gitRefsUrl
     * @param deploymentsUrl
     * @param watchersCount
     * @param openIssuesCount
     * @param mirrorUrl
     * @param homepage
     * @param url
     * @param size
     * @param keysUrl
     * @param gitCommitsUrl
     * @param milestonesUrl
     * @param downloadsUrl
     * @param issueCommentUrl
     * @param pullsUrl
     * @param owner
     * @param forksUrl
     * @param hasProjects
     * @param language
     * @param statusesUrl
     * @param eventsUrl
     * @param openIssues
     * @param teamsUrl
     * @param sshUrl
     * @param contributorsUrl
     * @param stargazersCount
     * @param tagsUrl
     * @param id
     * @param hasIssues
     * @param createdAt
     * @param name
     * @param treesUrl
     * @param cloneUrl
     * @param issuesUrl
     * @param gitUrl
     * @param forksCount
     * @param watchers
     * @param subscriptionUrl
     * @param svnUrl
     * @param archiveUrl
     * @param hasPages
     * @param languagesUrl
     * @param updatedAt
     * @param collaboratorsUrl
     * @param forks
     * @param hasDownloads
     * @param subscribersUrl
     * @param branchesUrl
     * @param fullName
     * @param hasWiki
     * @param defaultBranch
     */
    public Repository(Integer id, String name, String fullName, Owner owner, Boolean _private, String htmlUrl, String description, Boolean fork, String url, String forksUrl, String keysUrl, String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl, String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl, String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl, String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl, String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl, String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl, String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl, String createdAt, String updatedAt, String pushedAt, String gitUrl, String sshUrl, String cloneUrl, String svnUrl, String homepage, Integer size, Integer stargazersCount, Integer watchersCount, String language, Boolean hasIssues, Boolean hasProjects, Boolean hasDownloads, Boolean hasWiki, Boolean hasPages, Integer forksCount, Object mirrorUrl, Integer openIssuesCount, Integer forks, Integer openIssues, Integer watchers, String defaultBranch) {
        super();
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.owner = owner;
        this._private = _private;
        this.htmlUrl = htmlUrl;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forksUrl = forksUrl;
        this.keysUrl = keysUrl;
        this.collaboratorsUrl = collaboratorsUrl;
        this.teamsUrl = teamsUrl;
        this.hooksUrl = hooksUrl;
        this.issueEventsUrl = issueEventsUrl;
        this.eventsUrl = eventsUrl;
        this.assigneesUrl = assigneesUrl;
        this.branchesUrl = branchesUrl;
        this.tagsUrl = tagsUrl;
        this.blobsUrl = blobsUrl;
        this.gitTagsUrl = gitTagsUrl;
        this.gitRefsUrl = gitRefsUrl;
        this.treesUrl = treesUrl;
        this.statusesUrl = statusesUrl;
        this.languagesUrl = languagesUrl;
        this.stargazersUrl = stargazersUrl;
        this.contributorsUrl = contributorsUrl;
        this.subscribersUrl = subscribersUrl;
        this.subscriptionUrl = subscriptionUrl;
        this.commitsUrl = commitsUrl;
        this.gitCommitsUrl = gitCommitsUrl;
        this.commentsUrl = commentsUrl;
        this.issueCommentUrl = issueCommentUrl;
        this.contentsUrl = contentsUrl;
        this.compareUrl = compareUrl;
        this.mergesUrl = mergesUrl;
        this.archiveUrl = archiveUrl;
        this.downloadsUrl = downloadsUrl;
        this.issuesUrl = issuesUrl;
        this.pullsUrl = pullsUrl;
        this.milestonesUrl = milestonesUrl;
        this.notificationsUrl = notificationsUrl;
        this.labelsUrl = labelsUrl;
        this.releasesUrl = releasesUrl;
        this.deploymentsUrl = deploymentsUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pushedAt = pushedAt;
        this.gitUrl = gitUrl;
        this.sshUrl = sshUrl;
        this.cloneUrl = cloneUrl;
        this.svnUrl = svnUrl;
        this.homepage = homepage;
        this.size = size;
        this.stargazersCount = stargazersCount;
        this.watchersCount = watchersCount;
        this.language = language;
        this.hasIssues = hasIssues;
        this.hasProjects = hasProjects;
        this.hasDownloads = hasDownloads;
        this.hasWiki = hasWiki;
        this.hasPages = hasPages;
        this.forksCount = forksCount;
        this.mirrorUrl = mirrorUrl;
        this.openIssuesCount = openIssuesCount;
        this.forks = forks;
        this.openIssues = openIssues;
        this.watchers = watchers;
        this.defaultBranch = defaultBranch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getFork() {
        return fork;
    }

    public void setFork(Boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public void setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public void setWatchers(Integer watchers) {
        this.watchers = watchers;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(fullName);
        dest.writeValue(owner);
        dest.writeValue(_private);
        dest.writeValue(htmlUrl);
        dest.writeValue(description);
        dest.writeValue(fork);
        dest.writeValue(url);
        dest.writeValue(forksUrl);
        dest.writeValue(keysUrl);
        dest.writeValue(collaboratorsUrl);
        dest.writeValue(teamsUrl);
        dest.writeValue(hooksUrl);
        dest.writeValue(issueEventsUrl);
        dest.writeValue(eventsUrl);
        dest.writeValue(assigneesUrl);
        dest.writeValue(branchesUrl);
        dest.writeValue(tagsUrl);
        dest.writeValue(blobsUrl);
        dest.writeValue(gitTagsUrl);
        dest.writeValue(gitRefsUrl);
        dest.writeValue(treesUrl);
        dest.writeValue(statusesUrl);
        dest.writeValue(languagesUrl);
        dest.writeValue(stargazersUrl);
        dest.writeValue(contributorsUrl);
        dest.writeValue(subscribersUrl);
        dest.writeValue(subscriptionUrl);
        dest.writeValue(commitsUrl);
        dest.writeValue(gitCommitsUrl);
        dest.writeValue(commentsUrl);
        dest.writeValue(issueCommentUrl);
        dest.writeValue(contentsUrl);
        dest.writeValue(compareUrl);
        dest.writeValue(mergesUrl);
        dest.writeValue(archiveUrl);
        dest.writeValue(downloadsUrl);
        dest.writeValue(issuesUrl);
        dest.writeValue(pullsUrl);
        dest.writeValue(milestonesUrl);
        dest.writeValue(notificationsUrl);
        dest.writeValue(labelsUrl);
        dest.writeValue(releasesUrl);
        dest.writeValue(deploymentsUrl);
        dest.writeValue(createdAt);
        dest.writeValue(updatedAt);
        dest.writeValue(pushedAt);
        dest.writeValue(gitUrl);
        dest.writeValue(sshUrl);
        dest.writeValue(cloneUrl);
        dest.writeValue(svnUrl);
        dest.writeValue(homepage);
        dest.writeValue(size);
        dest.writeValue(stargazersCount);
        dest.writeValue(watchersCount);
        dest.writeValue(language);
        dest.writeValue(hasIssues);
        dest.writeValue(hasProjects);
        dest.writeValue(hasDownloads);
        dest.writeValue(hasWiki);
        dest.writeValue(hasPages);
        dest.writeValue(forksCount);
        dest.writeValue(mirrorUrl);
        dest.writeValue(openIssuesCount);
        dest.writeValue(forks);
        dest.writeValue(openIssues);
        dest.writeValue(watchers);
        dest.writeValue(defaultBranch);
    }

    public int describeContents() {
        return 0;
    }

    class Owner implements Parcelable {

        @SerializedName("login")
        private String login;
        @SerializedName("id")
        private Integer id;
        @SerializedName("avatar_url")
        private String avatarUrl;
        @SerializedName("gravatar_id")
        private String gravatarId;
        @SerializedName("url")
        private String url;
        @SerializedName("html_url")
        private String htmlUrl;
        @SerializedName("followers_url")
        private String followersUrl;
        @SerializedName("following_url")
        private String followingUrl;
        @SerializedName("gists_url")
        private String gistsUrl;
        @SerializedName("starred_url")
        private String starredUrl;
        @SerializedName("subscriptions_url")
        private String subscriptionsUrl;
        @SerializedName("organizations_url")
        private String organizationsUrl;
        @SerializedName("repos_url")
        private String reposUrl;
        @SerializedName("events_url")
        private String eventsUrl;
        @SerializedName("received_events_url")
        private String receivedEventsUrl;
        @SerializedName("type")
        private String type;
        @SerializedName("site_admin")
        private Boolean siteAdmin;
        public final Parcelable.Creator<Owner> CREATOR = new Creator<Owner>() {

            @SuppressWarnings({"unchecked"})
            public Owner createFromParcel(Parcel in) {
                Owner instance = new Owner();
                instance.login = ((String) in.readValue((String.class.getClassLoader())));
                instance.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
                instance.avatarUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.gravatarId = ((String) in.readValue((String.class.getClassLoader())));
                instance.url = ((String) in.readValue((String.class.getClassLoader())));
                instance.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.followersUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.followingUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.gistsUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.starredUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.subscriptionsUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.organizationsUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.reposUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.eventsUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.receivedEventsUrl = ((String) in.readValue((String.class.getClassLoader())));
                instance.type = ((String) in.readValue((String.class.getClassLoader())));
                instance.siteAdmin = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
                return instance;
            }

            public Owner[] newArray(int size) {
                return (new Owner[size]);
            }
        };

        public Owner() {
        }

        /**
         * @param eventsUrl
         * @param siteAdmin
         * @param gistsUrl
         * @param type
         * @param gravatarId
         * @param url
         * @param subscriptionsUrl
         * @param id
         * @param followersUrl
         * @param reposUrl
         * @param htmlUrl
         * @param receivedEventsUrl
         * @param avatarUrl
         * @param followingUrl
         * @param login
         * @param organizationsUrl
         * @param starredUrl
         */
        public Owner(String login, Integer id, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin) {
            super();
            this.login = login;
            this.id = id;
            this.avatarUrl = avatarUrl;
            this.gravatarId = gravatarId;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.followersUrl = followersUrl;
            this.followingUrl = followingUrl;
            this.gistsUrl = gistsUrl;
            this.starredUrl = starredUrl;
            this.subscriptionsUrl = subscriptionsUrl;
            this.organizationsUrl = organizationsUrl;
            this.reposUrl = reposUrl;
            this.eventsUrl = eventsUrl;
            this.receivedEventsUrl = receivedEventsUrl;
            this.type = type;
            this.siteAdmin = siteAdmin;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getGravatarId() {
            return gravatarId;
        }

        public void setGravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtmlUrl() {
            return htmlUrl;
        }

        public void setHtmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
        }

        public String getFollowersUrl() {
            return followersUrl;
        }

        public void setFollowersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
        }

        public String getFollowingUrl() {
            return followingUrl;
        }

        public void setFollowingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
        }

        public String getGistsUrl() {
            return gistsUrl;
        }

        public void setGistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
        }

        public String getStarredUrl() {
            return starredUrl;
        }

        public void setStarredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
        }

        public String getSubscriptionsUrl() {
            return subscriptionsUrl;
        }

        public void setSubscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
        }

        public String getOrganizationsUrl() {
            return organizationsUrl;
        }

        public void setOrganizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
        }

        public String getReposUrl() {
            return reposUrl;
        }

        public void setReposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
        }

        public String getEventsUrl() {
            return eventsUrl;
        }

        public void setEventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
        }

        public String getReceivedEventsUrl() {
            return receivedEventsUrl;
        }

        public void setReceivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Boolean getSiteAdmin() {
            return siteAdmin;
        }

        public void setSiteAdmin(Boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeValue(login);
            dest.writeValue(id);
            dest.writeValue(avatarUrl);
            dest.writeValue(gravatarId);
            dest.writeValue(url);
            dest.writeValue(htmlUrl);
            dest.writeValue(followersUrl);
            dest.writeValue(followingUrl);
            dest.writeValue(gistsUrl);
            dest.writeValue(starredUrl);
            dest.writeValue(subscriptionsUrl);
            dest.writeValue(organizationsUrl);
            dest.writeValue(reposUrl);
            dest.writeValue(eventsUrl);
            dest.writeValue(receivedEventsUrl);
            dest.writeValue(type);
            dest.writeValue(siteAdmin);
        }

        public int describeContents() {
            return 0;
        }
    }
}