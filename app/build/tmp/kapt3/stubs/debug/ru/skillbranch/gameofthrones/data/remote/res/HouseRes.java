package ru.skillbranch.gameofthrones.data.remote.res;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b/\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\u0014J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\u00c7\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001J\t\u00108\u001a\u000209H\u00d6\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u00d6\u0003J\t\u0010>\u001a\u000209H\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000209H\u00d6\u0001R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019\u00a8\u0006E"}, d2 = {"Lru/skillbranch/gameofthrones/data/remote/res/HouseRes;", "Landroid/os/Parcelable;", "url", "", "name", "region", "coatOfArms", "words", "titles", "", "seats", "currentLord", "heir", "overlord", "founded", "founder", "diedOut", "ancestralWeapons", "cadetBranches", "swornMembers", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAncestralWeapons", "()Ljava/util/List;", "getCadetBranches", "getCoatOfArms", "()Ljava/lang/String;", "getCurrentLord", "getDiedOut", "getFounded", "getFounder", "getHeir", "getName", "getOverlord", "getRegion", "getSeats", "getSwornMembers", "getTitles", "getUrl", "getWords", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class HouseRes implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String region = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String coatOfArms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String words = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> titles = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> seats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currentLord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String heir = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overlord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String founded = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String founder = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String diedOut = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> ancestralWeapons = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> cadetBranches = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> swornMembers = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoatOfArms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTitles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSeats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentLord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverlord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiedOut() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAncestralWeapons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getCadetBranches() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSwornMembers() {
        return null;
    }
    
    public HouseRes(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    java.lang.String coatOfArms, @org.jetbrains.annotations.NotNull()
    java.lang.String words, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> titles, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> seats, @org.jetbrains.annotations.NotNull()
    java.lang.String currentLord, @org.jetbrains.annotations.NotNull()
    java.lang.String heir, @org.jetbrains.annotations.NotNull()
    java.lang.String overlord, @org.jetbrains.annotations.NotNull()
    java.lang.String founded, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, @org.jetbrains.annotations.NotNull()
    java.lang.String diedOut, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ancestralWeapons, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cadetBranches, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> swornMembers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.gameofthrones.data.remote.res.HouseRes copy(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    java.lang.String coatOfArms, @org.jetbrains.annotations.NotNull()
    java.lang.String words, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> titles, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> seats, @org.jetbrains.annotations.NotNull()
    java.lang.String currentLord, @org.jetbrains.annotations.NotNull()
    java.lang.String heir, @org.jetbrains.annotations.NotNull()
    java.lang.String overlord, @org.jetbrains.annotations.NotNull()
    java.lang.String founded, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, @org.jetbrains.annotations.NotNull()
    java.lang.String diedOut, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ancestralWeapons, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> cadetBranches, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> swornMembers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}