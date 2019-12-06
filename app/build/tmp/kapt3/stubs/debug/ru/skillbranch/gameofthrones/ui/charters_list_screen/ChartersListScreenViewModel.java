package ru.skillbranch.gameofthrones.ui.charters_list_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bR&\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/ChartersListScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lru/skillbranch/gameofthrones/repositories/RootRepository;", "(Lru/skillbranch/gameofthrones/repositories/RootRepository;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "", "", "", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "query", "getData", "Landroidx/lifecycle/LiveData;", "handleSearchQuery", "", "queryStr", "app_debug"})
public final class ChartersListScreenViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>>> data;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> query = null;
    private final ru.skillbranch.gameofthrones.repositories.RootRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>>> getData() {
        return null;
    }
    
    public final void handleSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String queryStr) {
    }
    
    public ChartersListScreenViewModel(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.repositories.RootRepository repository) {
        super();
    }
}