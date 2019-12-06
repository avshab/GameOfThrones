package ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/CharactersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/CharactersAdapter$ViewHolder;", "tabName", "Lru/skillbranch/gameofthrones/common/model/HousesTabs;", "clickListener", "Lkotlin/Function2;", "", "(Lru/skillbranch/gameofthrones/common/model/HousesTabs;Lkotlin/jvm/functions/Function2;)V", "characters", "", "getCharacters", "()Ljava/util/List;", "setCharacters", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class CharactersAdapter extends androidx.recyclerview.widget.ListAdapter<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.CharactersAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem> characters;
    private final ru.skillbranch.gameofthrones.common.model.HousesTabs tabName = null;
    private final kotlin.jvm.functions.Function2<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem> getCharacters() {
        return null;
    }
    
    public final void setCharacters(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.CharactersAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.CharactersAdapter.ViewHolder holder, int position) {
    }
    
    public CharactersAdapter(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.common.model.HousesTabs tabName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ? super ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/CharactersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/skillbranch/gameofthrones/databinding/ItemCharacterBinding;", "(Lru/skillbranch/gameofthrones/databinding/ItemCharacterBinding;)V", "bind", "", "tabName", "Lru/skillbranch/gameofthrones/common/model/HousesTabs;", "character", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "clickListener", "Lkotlin/Function2;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.skillbranch.gameofthrones.databinding.ItemCharacterBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.gameofthrones.common.model.HousesTabs tabName, @org.jetbrains.annotations.NotNull()
        ru.skillbranch.gameofthrones.data.local.entities.CharacterItem character, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ? super ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.gameofthrones.databinding.ItemCharacterBinding binding) {
            super(null);
        }
    }
}