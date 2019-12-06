package ru.skillbranch.gameofthrones.ui.character_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u000eJ\u0014\u0010!\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0017J\u000e\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001a\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\f\u00a8\u0006&"}, d2 = {"Lru/skillbranch/gameofthrones/ui/character_screen/CharacterScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lru/skillbranch/gameofthrones/repositories/RootRepository;", "(Lru/skillbranch/gameofthrones/repositories/RootRepository;)V", "aliases", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "getAliases", "()Landroidx/lifecycle/LiveData;", "setAliases", "(Landroidx/lifecycle/LiveData;)V", "characterFull", "Landroidx/lifecycle/MutableLiveData;", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterFull;", "getCharacterFull", "()Landroidx/lifecycle/MutableLiveData;", "setCharacterFull", "(Landroidx/lifecycle/MutableLiveData;)V", "houseTab", "Lru/skillbranch/gameofthrones/common/model/HousesTabs;", "relativeNavigate", "Lru/skillbranch/gameofthrones/data/local/entities/RelativeCharacter;", "getRelativeNavigate", "setRelativeNavigate", "titles", "getTitles", "setTitles", "doneNavigation", "", "getHouseTab", "getNavigationRelation", "isDied", "navigateToRelative", "id", "setData", "data", "app_debug"})
public final class CharacterScreenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> characterFull;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter> relativeNavigate;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> titles;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> aliases;
    private androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.common.model.HousesTabs> houseTab;
    private final ru.skillbranch.gameofthrones.repositories.RootRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> getCharacterFull() {
        return null;
    }
    
    public final void setCharacterFull(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.CharacterFull> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter> getRelativeNavigate() {
        return null;
    }
    
    public final void setRelativeNavigate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getTitles() {
        return null;
    }
    
    public final void setTitles(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getAliases() {
        return null;
    }
    
    public final void setAliases(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> isDied() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.common.model.HousesTabs> getHouseTab() {
        return null;
    }
    
    public final void navigateToRelative(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter> getNavigationRelation() {
        return null;
    }
    
    public final void doneNavigation() {
    }
    
    public CharacterScreenViewModel(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.repositories.RootRepository repository) {
        super();
    }
}