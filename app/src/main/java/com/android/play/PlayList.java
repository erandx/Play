package com.android.play;

/**
 * {@link PlayList} represents a single Artist Song.
 * Each object has 3 properties: Artist name, Song Name, and cover resource ID.
 */
public class PlayList {

    // Artist Name (e.g. Red Hot Chili Pappers, Korn)
    private String mArtistName;

    // Artist Song (e.g. Californication, A.d.i.d.a.s)
    private String mArtistSong;

    // Drawable resource ID of Artist.
    private int mImageResourceId;

    /*
     * Create a new Artist object.
     *
     * @param aName is the name of the Artist (e.g. Red Hot Chili Pappers)
     * @param aSong is the Artist Song (e.g. Californication)
     * @param image is drawable reference ID that corresponds to Artist/Band Cover
     * */
    public PlayList(String aName, String aSong, int imageResourceId)
    {
        mArtistName = aName;
        mArtistSong = aSong;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Artist
     */
    public String getmArtistName() {
        return mArtistName;
    }

    /**
     * Get the Artist Song
     */
    public String getmArtistSong() {
        return mArtistSong;
    }

    /**
     * Get the image resource ID
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }




}
