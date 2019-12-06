package ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J<\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016J<\u0010\u000b\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016\u00a8\u0006\f"}, d2 = {"Lru/skillbranch/gameofthrones/ui/charters_list_screen/adapters/ChartersViewPagerDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkotlin/Pair;", "", "", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
public final class ChartersViewPagerDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>>> {
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> oldItem, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> oldItem, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.String, ? extends java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>> newItem) {
        return false;
    }
    
    public ChartersViewPagerDiffCallback() {
        super();
    }
}