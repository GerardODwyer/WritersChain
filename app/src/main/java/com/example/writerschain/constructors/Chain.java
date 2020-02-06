package com.example.writerschain.constructors;

public class Chain {

    private String chainName;
    private String chainID;
    private String chainAuthor;
    private String chainDescription;
    private String dateCreated;
    private String chainGenre;
    private int chapterCount;
    private int chainUpvotes;

    public Chain(String chainName, String chainID, String chainAuthor, String chainDescription, String chainGenre, int chapterCount, int chainUpvotes) {
        this.chainName = chainName;
        this.chainID = chainID;
        this.chainAuthor = chainAuthor;
        this.chainDescription = chainDescription;
        this.chainGenre = chainGenre;
        this.chapterCount = chapterCount;
        this.chainUpvotes = chainUpvotes;
    }

    public Chain() {

    }

    public String getChainName() {
        return chainName;
    }

    public void setChainName(String chainName) {
        this.chainName = chainName;
    }

    public String getChainID() {
        return chainID;
    }

    public void setChainID(String chainID) {
        this.chainID = chainID;
    }

    public String getChainAuthor() {
        return chainAuthor;
    }

    public void setChainAuthor(String chainAuthor) {
        this.chainAuthor = chainAuthor;
    }

    public String getChainDescription() {
        return chainDescription;
    }

    public void setChainDescription(String chainDescription) {
        this.chainDescription = chainDescription;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getChainGenre() {
        return chainGenre;
    }

    public void setChainGenre(String chainGenre) {
        this.chainGenre = chainGenre;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getChainUpvotes() {
        return chainUpvotes;
    }

    public void setChainUpvotes(int chainUpvotes) {
        this.chainUpvotes = chainUpvotes;
    }
}
