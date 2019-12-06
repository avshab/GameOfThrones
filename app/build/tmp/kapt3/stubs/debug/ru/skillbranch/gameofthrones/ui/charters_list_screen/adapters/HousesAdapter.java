package ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002$\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\b\u0012\u00060\u0006R\u00020\u00000\u0001:\u0001\u001bB\u001f\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0006R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0006R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/HousesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lkotlin/Pair;", "", "", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/HousesAdapter$ViewHolder;", "clickListener", "Lkotlin/Function2;", "Lru/skillbranch/gameofthrones/common/model/HousesTabs;", "", "(Lkotlin/jvm/functions/Function2;)V", "housesCharacters", "", "getHousesCharacters", "()Ljava/util/Map;", "setHousesCharacters", "(Ljava/util/Map;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class HousesAdapter extends androidx.recyclerview.widget.ListAdapter<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>>, ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.HousesAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> housesCharacters;
    private final kotlin.jvm.functions.Function2<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> getHousesCharacters() {
        return null;
    }
    
    public final void setHousesCharacters(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.HousesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.HousesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public HousesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ? super ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/HousesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lru/skillbranch/gameofthrones/databinding/ItemViewPageBinding;", "(Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/HousesAdapter;Lru/skillbranch/gameofthrones/databinding/ItemViewPageBinding;)V", "bind", "", "housesCharacters", "", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "houseTab", "Lru/skillbranch/gameofthrones/common/model/HousesTabs;", "clickListener", "Lkotlin/Function2;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final ru.skillbranch.gameofthrones.databinding.ItemViewPageBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem> housesCharacters, @org.jetbrains.annotations.NotNull()
        ru.skillbranch.gameofthrones.common.model.HousesTabs houseTab, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super ru.skillbranch.gameofthrones.data.local.entities.CharacterItem, ? super ru.skillbranch.gameofthrones.common.model.HousesTabs, kotlin.Unit> clickListener) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        ru.skillbranch.gameofthrones.databinding.ItemViewPageBinding binding) {
            super(null);
        }
    }
}